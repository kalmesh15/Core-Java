class TrainTicketExecutor {

    public static void main(String[] args) {

        TrainTicket t1 = new TrainTicket(1601,45);
        System.out.println("The ticket id is " + t1.ticketId);
        System.out.println("The seat number is " + t1.seatNumber);

        TrainTicket t2 = new TrainTicket(750.5,320.5);
        System.out.println("The ticket price is " + t2.ticketPrice);
        System.out.println("The travel distance in km is " + t2.distanceKm);

        TrainTicket t3 = new TrainTicket("Ravi","Shatabdi Express","Bangalore");
        System.out.println("The passenger name is " + t3.passengerName);
        System.out.println("The train name is " + t3.trainName);
        System.out.println("The destination is " + t3.destination);

        TrainTicket t4 = new TrainTicket(true,true);
        System.out.println("The ticket confirmation status is " + t4.confirmed);
        System.out.println("The sleeper class availability is " + t4.sleeperClass);

        TrainTicket t5 = new TrainTicket('A');
        System.out.println("The ticket class is " + t5.ticketClass);

        TrainTicket t6 = new TrainTicket(998877665544L);
        System.out.println("The PNR number is " + t6.pnrNumber);

        TrainTicket t7 = new TrainTicket(5.5f);
        System.out.println("The travel time in hours is " + t7.travelTime);

    }
}