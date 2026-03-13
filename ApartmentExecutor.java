class ApartmentExecutor {

    public static void main(String[] args) {

        Apartment a1 = new Apartment(901,120);
        System.out.println("The apartment id is " + a1.apartmentId);
        System.out.println("The total flats in the apartment are " + a1.totalFlats);

        Apartment a2 = new Apartment(15000.5,1200.5);
        System.out.println("The apartment rent price is " + a2.rentPrice);
        System.out.println("The apartment area size is " + a2.areaSize);

        Apartment a3 = new Apartment("Green Residency","Hassan","Mr. Ramesh");
        System.out.println("The apartment name is " + a3.apartmentName);
        System.out.println("The apartment location is " + a3.location);
        System.out.println("The apartment owner name is " + a3.ownerName);

        Apartment a4 = new Apartment(true,true);
        System.out.println("The apartment lift availability is " + a4.liftAvailable);
        System.out.println("The apartment parking availability is " + a4.parkingAvailable);

        Apartment a5 = new Apartment('A');
        System.out.println("The apartment grade is " + a5.apartmentGrade);

        Apartment a6 = new Apartment(112233445566L);
        System.out.println("The apartment registration number is " + a6.registrationNumber);

        Apartment a7 = new Apartment(2500.5f);
        System.out.println("The apartment maintenance charge is " + a7.maintenanceCharge);

    }
}