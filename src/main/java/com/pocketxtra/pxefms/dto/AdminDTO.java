package com.pocketxtra.pxefms.dto;

import lombok.Data;

@Data
public class AdminDTO {

    private String userId; // Reference to UserDTO

    private String alternateNumber; // Admin's alternate contact number

    private String companyName; // Company name

    private String companyEmail; // Company email address

    private String companyLogoUrl; // URL of the company logo

    private String companySize; // Size of the company (e.g., Small, Medium, Large)

}
