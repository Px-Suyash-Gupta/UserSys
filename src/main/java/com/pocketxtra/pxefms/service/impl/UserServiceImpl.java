package com.pocketxtra.pxefms.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocketxtra.pxefms.dto.UserDTO;
import com.pocketxtra.pxefms.entity.UserEntity;
import com.pocketxtra.pxefms.exception.InvalidOtpException;
import com.pocketxtra.pxefms.exception.UserNotFoundException;
import com.pocketxtra.pxefms.mapper.UserMapper;
import com.pocketxtra.pxefms.repository.UserRepository;
import com.pocketxtra.pxefms.service.UserService;
import com.pocketxtra.pxefms.util.Utils;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        // Convert DTO to entity
        UserEntity user = userMapper.userDTOToUser(userDTO);
        
        // Set creation and update timestamps
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        
        // Generate and set OTP
        String otp = Utils.generateOtp();
        user.setOtp(otp);
        user.setOtpCreatedAt(LocalDateTime.now());
        
        // Save the user entity to the database
        userRepository.save(user);
        
        // Convert saved entity back to DTO and return it
        return userMapper.userToUserDTO(user);
    }

    @Override
    public UserDTO loginUser(String phoneNumber, String otp) {
        UserEntity user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null && otp.equals(user.getOtp())) {
            return userMapper.userToUserDTO(user);
        }
        throw new InvalidOtpException("Invalid OTP or user not found.");
    }

    @Override
    public String generateOtp(String phoneNumber) {
        UserEntity user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null) {
            String otp = Utils.generateOtp();
            user.setOtp(otp);
            user.setOtpCreatedAt(LocalDateTime.now());
            userRepository.save(user);
            return otp;
        }
        throw new UserNotFoundException("User not found.");
    }
    @Override
    public UserDTO getUserById(String id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found."));
        return userMapper.userToUserDTO(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new UserNotFoundException("User not found.");
        }
    }
}
