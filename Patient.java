class Patient{
	private int patientId;
	private String name;
	private String disease;
	private String doctor;
	private String admissionDate;
	private String dischargeDate;
	private String status;

	public void setPatientId(int patientId){
		this.patientId=patientId;
	}
	public int getPatientId(){
		return this.patientId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setDisease(String disease){
		this.disease=disease;
	}
	public String getDisease(){
		return this.disease;
	}

	public void setDoctor(String doctor){
		this.doctor=doctor;
	}
	public String getDoctor(){
		return this.doctor;
	}

	public void setAdmissionDate(String admissionDate){
		this.admissionDate=admissionDate;
	}
	public String getAdmissionDate(){
		return this.admissionDate;
	}

	public void setDischargeDate(String dischargeDate){
		this.dischargeDate=dischargeDate;
	}
	public String getDischargeDate(){
		return this.dischargeDate;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Patient Id: "+this.patientId);
		System.out.println("Name: "+this.name);
		System.out.println("Disease: "+this.disease);
		System.out.println("Doctor: "+this.doctor);
		System.out.println("Admission Date: "+this.admissionDate);
		System.out.println("Discharge Date: "+this.dischargeDate);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}