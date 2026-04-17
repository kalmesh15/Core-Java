package com.facebook.facebookapp.validate;

import com.facebook.facebookapp.useraccount.UserAccount;

public class Validation {
    UserAccount userAccount;
    public boolean validateData(UserAccount userAccount){
        boolean isDataValidate=false;
        boolean isUnioqueIdValid=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isGenderValid=false;
        boolean isEmailValid=false;
        boolean isMobileNumberValid=false;
        boolean isPasswordValid=false;
        if(userAccount !=null){
            if(userAccount.getUniqueId()>0){
                isUnioqueIdValid=true;
            }else System.out.println("Invalid Unique Id");
            if(userAccount.getFirstName()!=null && !userAccount.getFirstName().isEmpty()){
                isFirstNameValid=true;
            }else System.out.println("Invalid First Name");
            if(userAccount.getLastName()!=null && !userAccount.getLastName().isEmpty()){
                isLastNameValid=true;
            }else System.out.println("Invalid Last Name");
            if (userAccount.getGender()!=null && !userAccount.getGender().isEmpty()){
                isGenderValid=true;
            }else System.out.println("Invalid Genger");
            if(userAccount.getEmail()!=null && !userAccount.getEmail().isEmpty()){
                isEmailValid=true;
            }else System.out.println("Invalid Email Address");
            if(userAccount.getMobileNumber()>0){
                isMobileNumberValid=true;
            }else System.out.println("Mobile Number is Invalid");
            if(userAccount.getPassword()!=null && !userAccount.getPassword().isEmpty()){
                isPasswordValid=true;
            }else System.out.println("Invalid password");

            if(isUnioqueIdValid && isFirstNameValid && isLastNameValid && isGenderValid && isEmailValid && isMobileNumberValid && isPasswordValid ){
                this.userAccount=userAccount;
                isDataValidate=true;
            }else System.out.println("Invalid Inputs");

        }
        return isDataValidate;
    }
}
