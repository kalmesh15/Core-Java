package com.sbi.yonosbiapp;

import com.sbi.yonosbiapp.bankaccount.BankAccount;
import com.sbi.yonosbiapp.bankaccount.current.CurrentAccount;
import com.sbi.yonosbiapp.bankaccount.savings.SavingsAccount;

public class BankExecutor {
    public static void main(String[] args) {

//1
        BankAccount kalmeshAccount = new BankAccount();
        kalmeshAccount.getBalance();
        kalmeshAccount.credit(200000);
        System.out.println("Kalmesh's available balance is "+ kalmeshAccount.getBalance());
//2
        BankAccount ritheshAccount = new BankAccount();
        System.out.println(ritheshAccount.getBalance());

        kalmeshAccount.transfer(ritheshAccount,20000);

        System.out.println("Kalmesh's available balance is "+kalmeshAccount.getBalance());
        System.out.println( "Rithesh's available balance is "+ritheshAccount.getBalance());
//3
        BankAccount pratheekAccount = new BankAccount();


        kalmeshAccount.transfer(pratheekAccount,500);
        System.out.println("Kalmesh's available balance is "+kalmeshAccount.getBalance());
        System.out.println( "Pratheek's available balance is "+pratheekAccount.getBalance());

//4
        BankAccount anjaliAccount = new BankAccount();
        kalmeshAccount.transfer(anjaliAccount,7000);
        System.out.println("Kalmesh's available balance is "+kalmeshAccount.getBalance());
        System.out.println( "Anjali's available balance is "+anjaliAccount.getBalance());
//5
        BankAccount devAccount=new BankAccount();
        kalmeshAccount.transfer(devAccount,12000);
        System.out.println("Kalmesh's available balance is "+kalmeshAccount.getBalance());
        System.out.println( "Dev's available balance is "+devAccount.getBalance());
//6
        SavingsAccount prajwalAccount= new SavingsAccount();
        ritheshAccount.transfer(prajwalAccount,5005);
        System.out.println("Rithesh's available balance is "+ritheshAccount.getBalance());
        System.out.println( "prajwal's available balance is "+prajwalAccount.getBalance());
//7

        CurrentAccount akshayAccount=new CurrentAccount();
        System.out.println("Akshay's Available Balance is "+akshayAccount.getBalance());
        devAccount.transfer(akshayAccount,200);
        System.out.println("Akshay's Available Balance is "+akshayAccount.getBalance());
        System.out.println( "Dev's available balance is "+devAccount.getBalance());
//8
        BankAccount praveenAccount=new CurrentAccount();
        System.out.println("Praveen's Available Balance is "+praveenAccount.getBalance());
        devAccount.transfer(praveenAccount,200);
        System.out.println("Praveen's Available Balance is "+praveenAccount.getBalance());
        System.out.println( "Dev's available balance is "+devAccount.getBalance());
//9
        BankAccount bhuvanAccount= new SavingsAccount();
        kalmeshAccount.transfer(bhuvanAccount,2000);
        System.out.println("Bhuvan's Available Balance is "+bhuvanAccount.getBalance());
        System.out.println( "Kalmesh's available balance is "+kalmeshAccount.getBalance());

    }
}
