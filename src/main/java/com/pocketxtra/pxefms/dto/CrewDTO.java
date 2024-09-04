package com.pocketxtra.pxefms.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class CrewDTO {

    private String userId; // Reference to UserDTO

    private LocalDate dateOfBirth; // Crew's date of birth

    private String gender; // Crew's gender

    private String collegeName; // College name

    private String courseName; // Course name

    private String primaryLocation; // Primary location

    private String secondaryLocation; // Secondary location

    private List<String> preferredWorkdays; // List of preferred workdays

    private String workExperience; // Work experience

    private String aadhaarNumber; // Aadhaar number

    private String panNumber; // PAN number

    private String bankDetails; // Bank details

    private String profilePhotoUrl; // URL of the profile photo

}
