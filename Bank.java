class Bank{
	private int accountId;
	private String accountHolderName;
	private String bankName;
	private String branch;
	private String accountType;
	private String balance;
	private String status;

	public void setAccountId(int accountId){
		this.accountId=accountId;
	}
	public int getAccountId(){
		return this.accountId;
	}

	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	public String getAccountHolderName(){
		return this.accountHolderName;
	}

	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return this.bankName;
	}

	public void setBranch(String branch){
		this.branch=branch;
	}
	public String getBranch(){
		return this.branch;
	}

	public void setAccountType(String accountType){
		this.accountType=accountType;
	}
	public String getAccountType(){
		return this.accountType;
	}

	public void setBalance(String balance){
		this.balance=balance;
	}
	public String getBalance(){
		return this.balance;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Account Id: "+this.accountId);
		System.out.println("Holder Name: "+this.accountHolderName);
		System.out.println("Bank Name: "+this.bankName);
		System.out.println("Branch: "+this.branch);
		System.out.println("Account Type: "+this.accountType);
		System.out.println("Balance: "+this.balance);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}