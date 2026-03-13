class HotelExecutor {

    public static void main(String[] args) {

        Hotel h1 = new Hotel(1001,200);
        System.out.println("The hotel id is " + h1.hotelId);
        System.out.println("The total rooms in the hotel are " + h1.totalRooms);

        Hotel h2 = new Hotel(3500.5,4.5);
        System.out.println("The hotel room price is " + h2.roomPrice);
        System.out.println("The hotel rating score is " + h2.ratingScore);

        Hotel h3 = new Hotel("Grand Palace","Bangalore","Mr. Suresh");
        System.out.println("The hotel name is " + h3.hotelName);
        System.out.println("The hotel city is " + h3.city);
        System.out.println("The hotel manager name is " + h3.managerName);

        Hotel h4 = new Hotel(true,true);
        System.out.println("The hotel wifi availability is " + h4.wifiAvailable);
        System.out.println("The hotel swimming pool availability is " + h4.swimmingPool);

        Hotel h5 = new Hotel('A');
        System.out.println("The hotel grade is " + h5.hotelGrade);

        Hotel h6 = new Hotel(556677889900L);
        System.out.println("The hotel license number is " + h6.licenseNumber);

        Hotel h7 = new Hotel(12.5f);
        System.out.println("The hotel service charge is " + h7.serviceCharge);

    }
}