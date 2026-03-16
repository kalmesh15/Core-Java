class Hospital{
	
	int hospitalId;
	String hospitalName;
	
	
	Doctor doctor;
	
	
	
	
	
	public void getHospitalDetail(){
		System.out.println("................................. ");
		System.out.println("Hospital details are ");
		System.out.println("The Hospital id is "+this.hospitalId);
		System.out.println("The Hospital name is "+this.hospitalName);
		
	
		this.doctor.getDoctorDetail();
	}
	

}