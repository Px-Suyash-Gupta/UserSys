package com.pocketxtra.pxefms.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDTO {
    
    // Unique identifier for the user
    private String id; 

    // User's first name
    private String firstName; 

     // User's last name
    private String lastName;
    
    private String phoneNumber; // User's phone number
    private String email; // User's email address (optional)
    private String profilePicUrl; // URL of the user's profile picture (optional)
    private String role; // User's role (e.g., Admin, Organizer, Contributor, Crew)
    private String status; // User's account status (e.g., Active, Inactive, Pending)
    private LocalDateTime createdAt; // Timestamp when the user was created
    private LocalDateTime updatedAt; // Timestamp when the user was last updated
    private Boolean approvedByAdmin; // Indicates if the user is approved by admin (for certain roles)
    private String otp; // One-time password (OTP) for verification
    private LocalDateTime otpCreatedAt; // Timestamp when the OTP was created

}