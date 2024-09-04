package com.pocketxtra.pxefms.mapper;

import org.springframework.stereotype.Component;

import com.pocketxtra.pxefms.Enums.Role;
import com.pocketxtra.pxefms.Enums.Status;
import com.pocketxtra.pxefms.dto.UserDTO;
import com.pocketxtra.pxefms.entity.UserEntity;

@Component
public class UserMapper {

    public UserDTO userToUserDTO(UserEntity user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setPhoneNumber(user.getPhoneNumber());
        dto.setEmail(user.getEmail());
        dto.setProfilePicUrl(user.getProfilePicUrl());
        dto.setRole(user.getRole().name()); // Convert enum to String
        dto.setStatus(user.getStatus().name()); // Convert enum to String
        dto.setCreatedAt(user.getCreatedAt());
        dto.setUpdatedAt(user.getUpdatedAt());
        dto.setApprovedByAdmin(user.getApprovedByAdmin());
        dto.setOtp(user.getOtp());
        dto.setOtpCreatedAt(user.getOtpCreatedAt());
        return dto;
    }

    public UserEntity userDTOToUser(UserDTO userDTO) {
        UserEntity entity = new UserEntity();
        entity.setId(userDTO.getId());
        entity.setFirstName(userDTO.getFirstName());
        entity.setLastName(userDTO.getLastName());
        entity.setPhoneNumber(userDTO.getPhoneNumber());
        entity.setEmail(userDTO.getEmail());
        entity.setProfilePicUrl(userDTO.getProfilePicUrl());
        entity.setRole(Role.valueOf(userDTO.getRole())); // Convert String to enum
        entity.setStatus(Status.valueOf(userDTO.getStatus())); // Convert String to enum
        entity.setCreatedAt(userDTO.getCreatedAt());
        entity.setUpdatedAt(userDTO.getUpdatedAt());
        entity.setApprovedByAdmin(userDTO.getApprovedByAdmin());
        entity.setOtp(userDTO.getOtp());
        entity.setOtpCreatedAt(userDTO.getOtpCreatedAt());
        return entity;
    }
}
