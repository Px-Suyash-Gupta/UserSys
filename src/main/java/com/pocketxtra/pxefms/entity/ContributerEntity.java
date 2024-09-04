package com.pocketxtra.pxefms.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Document(collection = "contributors")

public class ContributerEntity {
     @Id
    private String id;

    private String preferredLocation;

    private String companyName;

    private String companyEmail;

    private String companyContactNumber;
}