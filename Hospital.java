class Hospital{
		public static void bookAppointment(String patientName,String symptom){
			System.out.println("The bookAppointment invoking basicCheck method......");
			Nurse.basicCheck(patientName,symptom,false,false);
		}

}