package com.techlabs.model;

public class InputValidator {
	
	public String checkingUsername(String username) {
        if (username == null) {
            return "Username cannot be null.";
        }
        if (username.isEmpty()) {
            return "Username cannot be empty.";
        }
        int length = username.length();
        if (length < 3 || length > 20) {
            return "Username must be between 3 and 20 characters.";
        }
        return "Valid username.";
    }

    public String checkingPassword(String password) {
        if (password == null) {
            return "Password cannot be null.";
        }
        if (password.isEmpty()) {
            return "Password cannot be empty.";
        }
        int length = password.length();
        if (length < 8 || length > 30) {
            return "Password must be between 8 and 30 characters.";
        }
        return "Valid password.";
    }

    public String checkingEmail(String email) {
        if (email == null) {
            return "Email cannot be null.";
        }
        if (email.isEmpty()) {
            return "Email cannot be empty.";
        }
        int length = email.length();
        if (length < 5 || length > 50) {
            return "Email must be between 5 and 50 characters.";
        }
        if (!email.contains("@") || !email.contains(".")) {
            return "Email must contain '@' and '.'.";
        }
        return "Valid email.";
    }

}
