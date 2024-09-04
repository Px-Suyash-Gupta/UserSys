package com.pocketxtra.pxefms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pocketxtra.pxefms.entity.UserEntity;
import com.pocketxtra.pxefms.repository.UserRepository;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByPhoneNumber_UserExists() {
        // Act: Retrieve the user by phone number
        UserEntity foundUser = userRepository.findByPhoneNumber("1234567890");

        // Assert: Verify the results
        assertNotNull(foundUser, "User should not be null");
        assertEquals("1234567890", foundUser.getPhoneNumber(), "Phone number should match");

        System.out.println("Expected phone number is same");
    }

    @Test
    void testFindByPhoneNumber_UserDoesNotExist() {
        // Act: Attempt to retrieve a user by a phone number that does not exist
        UserEntity foundUser = userRepository.findByPhoneNumber("0000000000");

        // Assert: Verify the results
        assertEquals(null, foundUser, "User should be null");
    }
}
    