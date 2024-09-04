package com.pocketxtra.pxefms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pocketxtra.pxefms.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {

    // Method to find a user by their phone number
    UserEntity findByPhoneNumber(String phoneNumber);
}
