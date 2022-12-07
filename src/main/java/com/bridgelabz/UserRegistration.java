package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean emailCheck(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.isEmpty()) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("([a-z]{3,})(.)([a-z]{3,})[@][a-z]{2}(.)([a-z]{2})(.)([a-z]{2})", name);
        return check;
    }

    public boolean firstName(String name) throws UserRegistrationException {
        try {
            if (name.isEmpty()) {
                throw new UserRegistrationException("Contains Empty value ");
            } else {


                boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
                return check;
            }

        } catch (NullPointerException nullPointerException) {
            throw new UserRegistrationException("Is Null");
        }
    }

    public boolean lastName(String name) throws UserRegistrationException {
        if (name == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (name.isEmpty()) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("([A-Z][a-z]{2,})", name);
        return check;
    }

    public boolean numberCheck(String number) throws UserRegistrationException {
        if (number == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (number.isEmpty()) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("[9][1][\s][0-9]{10}", number);
        return check;
    }

    public boolean checkPassword(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException("Contains Null value");
        } else if (password.isEmpty()) {
            throw new UserRegistrationException("Contains Empty value ");
        }
        boolean check = Pattern.matches("^[A-Z]{1}+[!@#$%^&*()_+]{1}+[a-z A-z 0-9]{7,}$", password);
        return check;
    }


}
