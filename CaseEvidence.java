class CaseEvidence{
	private int evidenceId;
	private String caseName;
	private String evidenceType;
	private String collectedBy;
	private String collectedDate;
	private String location;
	private String status;

	public void setEvidenceId(int evidenceId){
		this.evidenceId=evidenceId;
	}
	public int getEvidenceId(){
		return this.evidenceId;
	}

	public void setCaseName(String caseName){
		this.caseName=caseName;
	}
	public String getCaseName(){
		return this.caseName;
	}

	public void setEvidenceType(String evidenceType){
		this.evidenceType=evidenceType;
	}
	public String getEvidenceType(){
		return this.evidenceType;
	}

	public void setCollectedBy(String collectedBy){
		this.collectedBy=collectedBy;
	}
	public String getCollectedBy(){
		return this.collectedBy;
	}

	public void setCollectedDate(String collectedDate){
		this.collectedDate=collectedDate;
	}
	public String getCollectedDate(){
		return this.collectedDate;
	}

	public void setLocation(String location){
		this.location=location;
	}
	public String getLocation(){
		return this.location;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Evidence Id: "+this.evidenceId);
		System.out.println("Case Name: "+this.caseName);
		System.out.println("Evidence Type: "+this.evidenceType);
		System.out.println("Collected By: "+this.collectedBy);
		System.out.println("Collected Date: "+this.collectedDate);
		System.out.println("Location: "+this.location);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}