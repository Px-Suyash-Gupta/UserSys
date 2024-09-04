package com.pocketxtra.pxefms.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Document(collection = "crews")

public class CrewEntity {
    @Id
    private String id;

    private LocalDate dateOfBirth;

    private String gender;

    private String collegeName;

    private String courseName;

    private String primaryLocation;

    private String secondaryLocation;

    private List<String> preferredWorkdays;

    private String workExperience;

    private String aadhaarNumber;

    private String panNumber;

    private String bankDetails;

    private String profilePhotoUrl;
}
