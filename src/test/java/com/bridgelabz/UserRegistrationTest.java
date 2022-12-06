package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Saikat");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("saikat");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Chakraborty");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("cass");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.email("abc.xyz@bl.co.in");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.email("abc.xyz.in");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.mobileNumber("919994561230");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.mobileNumber("1478523690");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.password1("saikatch");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.password1("s");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.password2("saikATchak");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.password2("emptiness");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.password3("saikAtchak7");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.password3("abgfhh");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.password4("saikat@98");
        Assertions Assert = null;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenInvalid_ShouldReturnFalse() {
        boolean result = userRegistration.password3("sk07");
        Assertions Assert = null;
        Assert.assertEquals(false, result);
    }
}
