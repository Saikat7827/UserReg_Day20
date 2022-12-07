package com.bridgelabz;

public class UserRegistrationException extends Exception{
    public String message;// Declaring

    public UserRegistrationException(String messege) {
        if (messege.contains("Null")) {
            this.message = "NULL_MESSAGE" + ":" + messege;// Initilizing
        } else if (messege.contains("Empty")) {
            this.message =  "EMPTY_MESSAGE" + ":" + messege;
        }
    }

    @Override
    //Exception class Method
    public String getMessage() {
        return message;
    }
}
