class AirplaneExecutor {

    public static void main(String[] args) {

        Airplane a1 = new Airplane(301,220);
        System.out.println("The airplane id is " + a1.airplaneId);
        System.out.println("The passenger capacity is " + a1.passengerCapacity);

        Airplane a2 = new Airplane(7500.5,12000.0);
        System.out.println("The ticket price is " + a2.ticketPrice);
        System.out.println("The flight range is " + a2.flightRange);

        Airplane a3 = new Airplane("IndiGo","Airbus A320","Dubai");
        System.out.println("The airline name is " + a3.airlineName);
        System.out.println("The airplane model is " + a3.model);
        System.out.println("The destination is " + a3.destination);

        Airplane a4 = new Airplane(true,true);
        System.out.println("The airplane international flight status is " + a4.internationalFlight);
        System.out.println("The airplane wifi availability is " + a4.wifiAvailable);

        Airplane a5 = new Airplane('B');
        System.out.println("The flight class is " + a5.flightClass);

        Airplane a6 = new Airplane(5678901234L);
        System.out.println("The flight number is " + a6.flightNumber);

        Airplane a7 = new Airplane(45000.0f);
        System.out.println("The airplane fuel capacity is " + a7.fuelCapacity);

    }
}