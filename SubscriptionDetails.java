class SubscriptionDetails{
	private int subscriptionId;
	private String userName;
	private String planName;
	private String startDate;
	private String endDate;
	private String price;
	private String status;

	public void setSubscriptionId(int subscriptionId){
		this.subscriptionId=subscriptionId;
	}
	public int getSubscriptionId(){
		return this.subscriptionId;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}

	public void setPlanName(String planName){
		this.planName=planName;
	}
	public String getPlanName(){
		return this.planName;
	}

	public void setStartDate(String startDate){
		this.startDate=startDate;
	}
	public String getStartDate(){
		return this.startDate;
	}

	public void setEndDate(String endDate){
		this.endDate=endDate;
	}
	public String getEndDate(){
		return this.endDate;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return this.price;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Subscription Id: "+this.subscriptionId);
		System.out.println("User Name: "+this.userName);
		System.out.println("Plan: "+this.planName);
		System.out.println("Start Date: "+this.startDate);
		System.out.println("End Date: "+this.endDate);
		System.out.println("Price: "+this.price);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}