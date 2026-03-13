class HospitalExecutor {

    public static void main(String[] args) {

        Hospital h1 = new Hospital(201,350);
        System.out.println("The hospital id is " + h1.hospitalId);
        System.out.println("The total beds in hospital are " + h1.totalBeds);

        Hospital h2 = new Hospital(500.5,4.7);
        System.out.println("The consultation fee is " + h2.consultationFee);
        System.out.println("The hospital rating score is " + h2.ratingScore);

        Hospital h3 = new Hospital("Apollo Hospital","Bangalore","Cardiology");
        System.out.println("The hospital name is " + h3.hospitalName);
        System.out.println("The hospital city is " + h3.city);
        System.out.println("The hospital specialization is " + h3.specialization);

        Hospital h4 = new Hospital(true,true);
        System.out.println("The hospital emergency service availability is " + h4.emergencyService);
        System.out.println("The hospital ambulance service availability is " + h4.ambulanceService);

        Hospital h5 = new Hospital('A');
        System.out.println("The hospital grade is " + h5.hospitalGrade);

        Hospital h6 = new Hospital(123456789012L);
        System.out.println("The hospital license number is " + h6.licenseNumber);

        Hospital h7 = new Hospital(15.5f);
        System.out.println("The average waiting time in hospital is " + h7.averageWaitingTime);

    }
}