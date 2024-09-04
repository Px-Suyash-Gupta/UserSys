package com.pocketxtra.pxefms.dto;

import lombok.Data;

@Data
public class ContributerDTO {

    private String userId; // Reference to UserDTO

    private String preferredLocation; // Contributor's preferred location

    private String companyName; // Company name

    private String companyEmail; // Company email address

    private String companyContactNumber; // Contact number of the company

}
