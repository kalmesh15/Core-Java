class TrainExecutor {

    public static void main(String[] args) {


         Boggie boggie1 = new Boggie(101,"Ac",72);
        Train train1 = new Train(1,"Express1",boggie1);
        
		
		
		train1.boggie = boggie1;
        train1.getTrainDetail();

        /*train1.trainId = 1;
        train1.trainName = "Express1";

        boggie1.boggieId = 101;
        boggie1.boggieType = "AC";
        boggie1.seats = 72;*/

        

        Boggie boggie2 = new Boggie(102,"Sleeper",76);
        Train train2 = new Train(2,"Express2",boggie2);
        
        train2.boggie = boggie2;
        train2.getTrainDetail();
        /*train2.trainId = 2;
        train2.trainName = "Express2";

        boggie2.boggieId = 102;
        boggie2.boggieType = "Sleeper";
        boggie2.seats = 72;

        


        Train train3 = new Train();
        Boggie boggie3 = new Boggie();

        train3.trainId = 3;
        train3.trainName = "Express3";

        boggie3.boggieId = 103;
        boggie3.boggieType = "AC";
        boggie3.seats = 70;

        train3.boggie = boggie3;
        train3.getTrainDetail();


        Train train4 = new Train();
        Boggie boggie4 = new Boggie();

        train4.trainId = 4;
        train4.trainName = "Express4";

        boggie4.boggieId = 104;
        boggie4.boggieType = "General";
        boggie4.seats = 90;

        train4.boggie = boggie4;
        train4.getTrainDetail();


        Train train5 = new Train();
        Boggie boggie5 = new Boggie();

        train5.trainId = 5;
        train5.trainName = "Express5";

        boggie5.boggieId = 105;
        boggie5.boggieType = "AC";
        boggie5.seats = 70;

        train5.boggie = boggie5;
        train5.getTrainDetail();


        Train train6 = new Train();
        Boggie boggie6 = new Boggie();

        train6.trainId = 6;
        train6.trainName = "Express6";

        boggie6.boggieId = 106;
        boggie6.boggieType = "Sleeper";
        boggie6.seats = 72;

        train6.boggie = boggie6;
        train6.getTrainDetail();


        Train train7 = new Train();
        Boggie boggie7 = new Boggie();

        train7.trainId = 7;
        train7.trainName = "Express7";

        boggie7.boggieId = 107;
        boggie7.boggieType = "AC";
        boggie7.seats = 70;

        train7.boggie = boggie7;
        train7.getTrainDetail();


        Train train8 = new Train();
        Boggie boggie8 = new Boggie();

        train8.trainId = 8;
        train8.trainName = "Express8";

        boggie8.boggieId = 108;
        boggie8.boggieType = "General";
        boggie8.seats = 95;

        train8.boggie = boggie8;
        train8.getTrainDetail();


        Train train9 = new Train();
        Boggie boggie9 = new Boggie();

        train9.trainId = 9;
        train9.trainName = "Express9";

        boggie9.boggieId = 109;
        boggie9.boggieType = "AC";
        boggie9.seats = 70;

        train9.boggie = boggie9;
        train9.getTrainDetail();


        Train train10 = new Train();
        Boggie boggie10 = new Boggie();

        train10.trainId = 10;
        train10.trainName = "Express10";

        boggie10.boggieId = 110;
        boggie10.boggieType = "Sleeper";
        boggie10.seats = 72;

        train10.boggie = boggie10;
        train10.getTrainDetail();


        Train train11 = new Train();
        Boggie boggie11 = new Boggie();

        train11.trainId = 11;
        train11.trainName = "Express11";

        boggie11.boggieId = 111;
        boggie11.boggieType = "AC";
        boggie11.seats = 70;

        train11.boggie = boggie11;
        train11.getTrainDetail();


        Train train12 = new Train();
        Boggie boggie12 = new Boggie();

        train12.trainId = 12;
        train12.trainName = "Express12";

        boggie12.boggieId = 112;
        boggie12.boggieType = "General";
        boggie12.seats = 95;

        train12.boggie = boggie12;
        train12.getTrainDetail();


        Train train13 = new Train();
        Boggie boggie13 = new Boggie();

        train13.trainId = 13;
        train13.trainName = "Express13";

        boggie13.boggieId = 113;
        boggie13.boggieType = "AC";
        boggie13.seats = 70;

        train13.boggie = boggie13;
        train13.getTrainDetail();


        Train train14 = new Train();
        Boggie boggie14 = new Boggie();

        train14.trainId = 14;
        train14.trainName = "Express14";

        boggie14.boggieId = 114;
        boggie14.boggieType = "Sleeper";
        boggie14.seats = 72;

        train14.boggie = boggie14;
        train14.getTrainDetail();


        Train train15 = new Train();
        Boggie boggie15 = new Boggie();

        train15.trainId = 15;
        train15.trainName = "Express15";

        boggie15.boggieId = 115;
        boggie15.boggieType = "AC";
        boggie15.seats = 70;

        train15.boggie = boggie15;
        train15.getTrainDetail();


        Train train16 = new Train();
        Boggie boggie16 = new Boggie();

        train16.trainId = 16;
        train16.trainName = "Express16";

        boggie16.boggieId = 116;
        boggie16.boggieType = "General";
        boggie16.seats = 95;

        train16.boggie = boggie16;
        train16.getTrainDetail();


        Train train17 = new Train();
        Boggie boggie17 = new Boggie();

        train17.trainId = 17;
        train17.trainName = "Express17";

        boggie17.boggieId = 117;
        boggie17.boggieType = "AC";
        boggie17.seats = 70;

        train17.boggie = boggie17;
        train17.getTrainDetail();


        Train train18 = new Train();
        Boggie boggie18 = new Boggie();

        train18.trainId = 18;
        train18.trainName = "Express18";

        boggie18.boggieId = 118;
        boggie18.boggieType = "Sleeper";
        boggie18.seats = 72;

        train18.boggie = boggie18;
        train18.getTrainDetail();


        Train train19 = new Train();
        Boggie boggie19 = new Boggie();

        train19.trainId = 19;
        train19.trainName = "Express19";

        boggie19.boggieId = 119;
        boggie19.boggieType = "AC";
        boggie19.seats = 70;

        train19.boggie = boggie19;
        train19.getTrainDetail();


        Train train20 = new Train();
        Boggie boggie20 = new Boggie();

        train20.trainId = 20;
        train20.trainName = "Express20";

        boggie20.boggieId = 120;
        boggie20.boggieType = "General";
        boggie20.seats = 95;

        train20.boggie = boggie20;
        train20.getTrainDetail();
		*/

    }
}