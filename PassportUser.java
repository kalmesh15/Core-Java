class PassportUser{
	private int passportId;
	private String name;
	private String country;
	private String issueDate;
	private String expiryDate;
	private String place;
	private String status;

	public void setPassportId(int passportId){
		this.passportId=passportId;
	}
	public int getPassportId(){
		return this.passportId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setCountry(String country){
		this.country=country;
	}
	public String getCountry(){
		return this.country;
	}

	public void setIssueDate(String issueDate){
		this.issueDate=issueDate;
	}
	public String getIssueDate(){
		return this.issueDate;
	}

	public void setExpiryDate(String expiryDate){
		this.expiryDate=expiryDate;
	}
	public String getExpiryDate(){
		return this.expiryDate;
	}

	public void setPlace(String place){
		this.place=place;
	}
	public String getPlace(){
		return this.place;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Passport Id: "+this.passportId);
		System.out.println("Name: "+this.name);
		System.out.println("Country: "+this.country);
		System.out.println("Issue Date: "+this.issueDate);
		System.out.println("Expiry Date: "+this.expiryDate);
		System.out.println("Place: "+this.place);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}