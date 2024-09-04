package com.pocketxtra.pxefms.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pocketxtra.pxefms.Enums.Role;
import com.pocketxtra.pxefms.Enums.Status;

import lombok.Data;

// @Document annotation marks this class as a MongoDB document (similar to a table in relational databases)
@Data
@Document(collection = "users")
public class UserEntity {

    @Id
    private String id; // Unique identifier for the user

    @Indexed
    private String firstName; // User's first name

    private String lastName; // User's last name

    @Indexed(unique = true)
    private String phoneNumber; // User's phone number, must be unique

    @Indexed
    private String email; // User's email address

    private String profilePicUrl; // URL of the user's profile picture

    private Role role; // Role assigned to the user

    private Status status; // Current status of the user

    private LocalDateTime createdAt; // Timestamp when the user was created

    private LocalDateTime updatedAt; // Timestamp when the user was last updated

    private Boolean approvedByAdmin; // Indicates if the user has been approved by the admin

    private String otp; // One-time password (OTP) for verification

    private LocalDateTime otpCreatedAt; // Timestamp when the OTP was created

}
