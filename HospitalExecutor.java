class HospitalExecutor{
	public static void main(String[] hos){
		
		
		Hospital hospital = new Hospital();
		
		hospital.hospitalId =2;
		hospital.hospitalName = "Fortis";
		
		
		Doctor doctor = new Doctor();
		
		
		doctor.doctorId = 4;
		doctor.doctorName = "kalmesh";
		doctor.spectialization = "General";
		doctor.exp = "4 year";
		doctor.fees = 2500;
		
		hospital.doctor = doctor;
		
	
		hospital.getHospitalDetail();
		
		
		
		Hospital  hospital2 = new Hospital();
		hospital2.hospitalId=9;
		hospital2.hospitalName = "Appolo";
		
		Doctor doctor2 = new Doctor();
		hospital2.doctor = doctor2;
		
		doctor2.doctorId = 3;
		doctor2.doctorName="Sagar";
		doctor2.spectialization="General";
		doctor2.exp = "2 year";
		doctor2.fees = 300;
		
		hospital2.getHospitalDetail();
		
		
	}
}