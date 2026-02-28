class Reception{
	public static void book(String patientName,String symptom,String email,long mobile){
		System.out.println("The book invoking bookAppointment method......");
		Hospital.bookAppointment(patientName, symptom);
	}
}