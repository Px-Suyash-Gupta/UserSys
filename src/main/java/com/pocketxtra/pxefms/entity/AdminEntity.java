package com.pocketxtra.pxefms.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Document(collection = "admins")

public class AdminEntity {
   
    @Id
    private String id;

    private String alternateNumber;

    private String companyName;

    private String companyEmail;

    private String companyLogoUrl;

    private String companySize;
}

