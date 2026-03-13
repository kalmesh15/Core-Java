class BankAccountExecutor {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(501,12);
        System.out.println("The account id is " + a1.accountId);
        System.out.println("The branch code is " + a1.branchCode);

        BankAccount a2 = new BankAccount(15000.5,4.5);
        System.out.println("The account balance is " + a2.balance);
        System.out.println("The interest rate is " + a2.interestRate);

        BankAccount a3 = new BankAccount("Rahul Sharma","SBI","Savings");
        System.out.println("The account holder name is " + a3.accountHolderName);
        System.out.println("The bank name is " + a3.bankName);
        System.out.println("The account type is " + a3.accountType);

        BankAccount a4 = new BankAccount(true,true);
        System.out.println("The account active status is " + a4.active);
        System.out.println("The net banking enabled status is " + a4.netBankingEnabled);

        BankAccount a5 = new BankAccount('A');
        System.out.println("The account category is " + a5.accountCategory);

        BankAccount a6 = new BankAccount(987654321234L);
        System.out.println("The account number is " + a6.accountNumber);

        BankAccount a7 = new BankAccount(5000.0f);
        System.out.println("The minimum balance is " + a7.minimumBalance);

    }
}