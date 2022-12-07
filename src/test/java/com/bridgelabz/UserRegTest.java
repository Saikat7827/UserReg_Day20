package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegTest {
    @Test
    public void givenAEmailPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            Boolean result = user.emailCheck(null);
            Assertions.assertEquals(false, result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean name = user.firstName("");
            Assertions.assertTrue(name);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPasswordPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean password = user.checkPassword(null);
            Assertions.assertTrue(password);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAMobileNumberPatternWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean number = user.numberCheck("");
            Assertions.assertTrue(number);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenAPatternOfLastNameWhenMatchedShouldReturnTrue() {
        try {
            UserRegistration user = new UserRegistration();
            boolean lastName = user.lastName(null);
            Assertions.assertTrue(lastName);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
