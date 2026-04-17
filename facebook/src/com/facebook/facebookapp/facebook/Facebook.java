package com.facebook.facebookapp.facebook;

import com.facebook.facebookapp.useraccount.UserAccount;
import com.facebook.facebookapp.validate.Validation;

public class Facebook {

    UserAccount userAccounts[]=new UserAccount[5];
    int index;
    Validation validation = new Validation();

    public boolean saveAccount(UserAccount userAccount){
        boolean isAccountSaved=false;
        if(validation.validateData(userAccount)){
            userAccounts[index++]=userAccount;
            isAccountSaved=true;
        }
        return isAccountSaved;
    }

    public void getAccountsDetails(){
        for(UserAccount userAccount:userAccounts){
            System.out.println("----------------------------------------------");
            System.out.println("The User Unique Id is "+userAccount.getUniqueId());
            System.out.println("The user First Name is "+userAccount.getFirstName());
            System.out.println("The User Last Name is "+userAccount.getLastName());
            System.out.println("The User gender Is "+userAccount.getGender());
            System.out.println("The USer Email is "+userAccount.getEmail());
            System.out.println("The User Mobile Number IS "+userAccount.getMobileNumber());
            System.out.println("The User Password is "+userAccount.getPassword());
        }
    }

    public boolean updateEmailByUniqueId(String updatedEmail , int uniqueID){
        boolean isEmailUpdatedById=false;
        if(updatedEmail!=null && !updatedEmail.isEmpty() && uniqueID>0 && uniqueID<=userAccounts.length){
            for (int index = 0; index < userAccounts.length; index++) {
                if(userAccounts[index].getUniqueId()==uniqueID){
                    userAccounts[index].setEmail(updatedEmail);
                    isEmailUpdatedById=true;
                }
            }
        }

        return  isEmailUpdatedById;
    }


    public boolean updateMobileNumberByFirstName(long updatedMobileNo,String firstName){
        boolean isMobileNumberUpdatedByfirstName=false;
        if(updatedMobileNo >0 && firstName!=null && !firstName.isEmpty()){
            for (int index = 0; index < userAccounts.length; index++) {
                if(userAccounts[index].getFirstName().equals(firstName)){
                    userAccounts[index].setMobileNumber(updatedMobileNo);
                    isMobileNumberUpdatedByfirstName=true;
                }
            }
        }

        return isMobileNumberUpdatedByfirstName;
    }

    public boolean updatePasswordByEmail(String updatedPassword ,String email){
        boolean isPasswordUpdatedByEmail=false;
        if(updatedPassword!=null && !updatedPassword.isEmpty() && email!=null && !email.isEmpty()){
            for (int index = 0; index < userAccounts.length; index++) {
                if(userAccounts[index].getEmail().equals(email)){
                    userAccounts[index].setPassword(updatedPassword);
                    isPasswordUpdatedByEmail=true;
                }            }
        }else System.out.println("not updated");
        return isPasswordUpdatedByEmail;
    }

    public void getAllAccountsEmail(){
        for (int index = 0; index < userAccounts.length; index++) {
            System.out.println(userAccounts[index].getEmail());
        }
    }
}
