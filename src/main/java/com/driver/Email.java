package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";

    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

//        if(!oldPassword.equals(newPassword) || newPassword.length() < 8){
//            return;
//        }
//        boolean isOneCharUpper = false;
//        boolean isOneLowerCase = false;
//        boolean containsOneDigit = false;
//        boolean containsSpecial = false;
//        for(int i=0; i<newPassword.length(); i++){
//            char ch = newPassword.charAt(i);
//            if(ch >= 'A' && ch <= 'Z'){
//                isOneCharUpper = true;
//            }
//            if(ch >= 'a' && ch <= 'z'){
//                isOneLowerCase = true;
//            }
//            if(Character.isDigit(ch)){
//                containsOneDigit = true;
//            }
//            if(!Character.isLetterOrDigit(ch) ){
//                containsSpecial = true;
//            }
//        }
//        if(isOneCharUpper && isOneLowerCase && containsOneDigit && containsSpecial){
//            this.password = newPassword;
//        }
        if (oldPassword.equals(password) && newPassword.length() >= 8) {
            String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
            if (newPassword.matches(passwordRegex)) {
                password = newPassword;
            }
        }

    }
}
