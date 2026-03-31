class LoanApplication{
	private int applicationId;
	private String applicantName;
	private String loanType;
	private String amount;
	private String applicationDate;
	private String bankName;
	private String status;

	public void setApplicationId(int applicationId){
		this.applicationId=applicationId;
	}
	public int getApplicationId(){
		return this.applicationId;
	}

	public void setApplicantName(String applicantName){
		this.applicantName=applicantName;
	}
	public String getApplicantName(){
		return this.applicantName;
	}

	public void setLoanType(String loanType){
		this.loanType=loanType;
	}
	public String getLoanType(){
		return this.loanType;
	}

	public void setAmount(String amount){
		this.amount=amount;
	}
	public String getAmount(){
		return this.amount;
	}

	public void setApplicationDate(String applicationDate){
		this.applicationDate=applicationDate;
	}
	public String getApplicationDate(){
		return this.applicationDate;
	}

	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return this.bankName;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Application Id: "+this.applicationId);
		System.out.println("Applicant Name: "+this.applicantName);
		System.out.println("Loan Type: "+this.loanType);
		System.out.println("Amount: "+this.amount);
		System.out.println("Application Date: "+this.applicationDate);
		System.out.println("Bank Name: "+this.bankName);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}