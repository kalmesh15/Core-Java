package com.sbi.yonosbiapp.bankaccount;

public class BankAccount {
    private  double balance;


    public boolean credit(double amount){
        boolean isAmountCredited=false;
        System.out.println("credit started");
        if(amount > 0){
            balance = balance + amount;
            isAmountCredited=true;

        }else System.out.println("Invalid Amount!!!");
        System.out.println("credit ended");
        return  isAmountCredited;
    }

    public boolean debit(double amount){
        System.out.println("debit started");
        boolean isAmountDebited=false;
        if( amount <= this.balance){
            balance  = balance- amount;
            isAmountDebited=true;
        }else System.out.println("Insuffient balance");
        System.out.println("debit ended");
        return  isAmountDebited;
    }

    public double getBalance(){
        return this.balance;
    }

    public void transfer(BankAccount beneficiaryAccount , double amount){

        System.out.println("Transfer started  ");
        boolean debit= this.debit(amount);
         if (debit){
             beneficiaryAccount.credit(amount);
         }

        System.out.println("transfer ended");


    }
}
