class PostMortemReport{
	private int reportId;
	private String patientName;
	private String causeOfDeath;
	private String doctorName;
	private String reportDate;
	private String location;
	private String status;

	public void setReportId(int reportId){
		this.reportId=reportId;
	}
	public int getReportId(){
		return this.reportId;
	}

	public void setPatientName(String patientName){
		this.patientName=patientName;
	}
	public String getPatientName(){
		return this.patientName;
	}

	public void setCauseOfDeath(String causeOfDeath){
		this.causeOfDeath=causeOfDeath;
	}
	public String getCauseOfDeath(){
		return this.causeOfDeath;
	}

	public void setDoctorName(String doctorName){
		this.doctorName=doctorName;
	}
	public String getDoctorName(){
		return this.doctorName;
	}

	public void setReportDate(String reportDate){
		this.reportDate=reportDate;
	}
	public String getReportDate(){
		return this.reportDate;
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
		System.out.println("Report Id: "+this.reportId);
		System.out.println("Patient Name: "+this.patientName);
		System.out.println("Cause Of Death: "+this.causeOfDeath);
		System.out.println("Doctor Name: "+this.doctorName);
		System.out.println("Report Date: "+this.reportDate);
		System.out.println("Location: "+this.location);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}