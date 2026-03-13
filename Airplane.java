class Airplane {

    int airplaneId;
    int passengerCapacity;

    double ticketPrice;
    double flightRange;

    String airlineName;
    String model;
    String destination;

    boolean internationalFlight;
    boolean wifiAvailable;

    char flightClass;

    long flightNumber;

    float fuelCapacity;

    Airplane(int airplaneId, int passengerCapacity){
        this.airplaneId = airplaneId;
        this.passengerCapacity = passengerCapacity;
    }

    Airplane(double ticketPrice, double flightRange){
        this.ticketPrice = ticketPrice;
        this.flightRange = flightRange;
    }

    Airplane(String airlineName, String model, String destination){
        this.airlineName = airlineName;
        this.model = model;
        this.destination = destination;
    }

    Airplane(boolean internationalFlight, boolean wifiAvailable){
        this.internationalFlight = internationalFlight;
        this.wifiAvailable = wifiAvailable;
    }

    Airplane(char flightClass){
        this.flightClass = flightClass;
    }

    Airplane(long flightNumber){
        this.flightNumber = flightNumber;
    }

    Airplane(float fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }

}