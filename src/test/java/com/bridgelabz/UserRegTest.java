package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserRegTest {
    UserDetailsValidation userDetails = new UserDetailsValidation();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean result = userDetails.firstName("Trigger");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnFalse() {
        boolean result = userDetails.firstName("trigger");
        Assertions.assertFalse(result);
    }

    @Test
    public void testLastName() {
        boolean result = userDetails.lastName("Babai");
        Assertions.assertTrue(result);
    }

    @Test
    public void testEmail() {
        boolean result = userDetails.email("saikat@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void testMobile() {
        boolean result = userDetails.mobile("91 7894561230");
        Assertions.assertTrue(result);
    }


    @Test
    public void testPassword() {
        boolean result = userDetails.password("saikatBabai1");
        Assertions.assertTrue(result);
    }
}
