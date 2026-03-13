class TrainTicket {

    int ticketId;
    int seatNumber;

    double ticketPrice;
    double distanceKm;

    String passengerName;
    String trainName;
    String destination;

    boolean confirmed;
    boolean sleeperClass;

    char ticketClass;

    long pnrNumber;

    float travelTime;

    TrainTicket(int ticketId, int seatNumber){
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
    }

    TrainTicket(double ticketPrice, double distanceKm){
        this.ticketPrice = ticketPrice;
        this.distanceKm = distanceKm;
    }

    TrainTicket(String passengerName, String trainName, String destination){
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.destination = destination;
    }

    TrainTicket(boolean confirmed, boolean sleeperClass){
        this.confirmed = confirmed;
        this.sleeperClass = sleeperClass;
    }

    TrainTicket(char ticketClass){
        this.ticketClass = ticketClass;
    }

    TrainTicket(long pnrNumber){
        this.pnrNumber = pnrNumber;
    }

    TrainTicket(float travelTime){
        this.travelTime = travelTime;
    }

}