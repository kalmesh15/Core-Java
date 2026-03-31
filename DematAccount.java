class DematAccount{
	private int accountId;
	private String holderName;
	private String brokerName;
	private String accountType;
	private String openingDate;
	private String balance;
	private String status;

	public void setAccountId(int accountId){
		this.accountId=accountId;
	}
	public int getAccountId(){
		return this.accountId;
	}

	public void setHolderName(String holderName){
		this.holderName=holderName;
	}
	public String getHolderName(){
		return this.holderName;
	}

	public void setBrokerName(String brokerName){
		this.brokerName=brokerName;
	}
	public String getBrokerName(){
		return this.brokerName;
	}

	public void setAccountType(String accountType){
		this.accountType=accountType;
	}
	public String getAccountType(){
		return this.accountType;
	}

	public void setOpeningDate(String openingDate){
		this.openingDate=openingDate;
	}
	public String getOpeningDate(){
		return this.openingDate;
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
		System.out.println("Holder Name: "+this.holderName);
		System.out.println("Broker Name: "+this.brokerName);
		System.out.println("Account Type: "+this.accountType);
		System.out.println("Opening Date: "+this.openingDate);
		System.out.println("Balance: "+this.balance);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}