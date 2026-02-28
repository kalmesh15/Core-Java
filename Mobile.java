class Mobile{
	 public static void register(String patientName,String symptom,String email,long mobile){
		 System.out.println("The register invoking book method......");
		Reception.book(patientName,symptom,email,mobile);
		System.out.println("The patient Name is "+patientName+ " and symptom is "+symptom+"\n email :"+email+"\n mobile number : "+mobile);
	 }
}