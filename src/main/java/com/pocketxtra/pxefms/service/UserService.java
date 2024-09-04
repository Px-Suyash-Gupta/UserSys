package com.pocketxtra.pxefms.service;

import java.util.List;

import com.pocketxtra.pxefms.dto.UserDTO;

public interface UserService {

    // Register a new user and return the registered user details as UserDTO
    UserDTO registerUser(UserDTO userDTO);

    // Login a user using their phone number and OTP, return user details as UserDTO
    UserDTO loginUser(String phoneNumber, String otp);

    // Generate an OTP for a given phone number and return it as a String
    String generateOtp(String phoneNumber);

    // Retrieve a user by ID
    UserDTO getUserById(String id);

    // Retrieve a list of all users
    List<UserDTO> getAllUsers();

    // Delete a user by ID
    void deleteUser(String id);
}
