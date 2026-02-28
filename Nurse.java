class Nurse{
		public static void basicCheck(String patientName,String symptom,boolean bp,boolean sugar){
			System.out.println("The basicCheck invoking treat method......");
			Doctor.treat(patientName,symptom);
		}

}