class BankAccount {

    int accountId;
    int branchCode;

    double balance;
    double interestRate;

    String accountHolderName;
    String bankName;
    String accountType;

    boolean active;
    boolean netBankingEnabled;

    char accountCategory;

    long accountNumber;

    float minimumBalance;

    BankAccount(int accountId, int branchCode){
        this.accountId = accountId;
        this.branchCode = branchCode;
    }

    BankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    BankAccount(String accountHolderName, String bankName, String accountType){
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountType = accountType;
    }

    BankAccount(boolean active, boolean netBankingEnabled){
        this.active = active;
        this.netBankingEnabled = netBankingEnabled;
    }

    BankAccount(char accountCategory){
        this.accountCategory = accountCategory;
    }

    BankAccount(long accountNumber){
        this.accountNumber = accountNumber;
    }

    BankAccount(float minimumBalance){
        this.minimumBalance = minimumBalance;
    }

}