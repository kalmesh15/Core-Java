class CricketExecutor {

    public static void main(String[] args) {

        Cricket c1 = new Cricket();

        c1.matchType="ODI";
        c1.teamOne="India";
        c1.teamTwo="Australia";
        c1.stadiumName="Chinnaswamy";
        c1.hostCountry="India";
        c1.oversLimit=50;
        c1.playersPerTeam=11;
        c1.teamOneScore=320;
        c1.teamTwoScore=300;
        c1.teamOneWickets=8;
        c1.teamTwoWickets=10;
        c1.tossWinner="India";
        c1.tossDecision="Bat";
        c1.matchWinner="India";
        c1.manOfTheMatch="Virat Kohli";
        c1.umpireOne="Kumar Dharmasena";
        c1.umpireTwo="Richard Kettleborough";
        c1.thirdUmpire="Nitin Menon";
        c1.matchReferee="Ranjan Madugalle";
        c1.matchYear=2024;
        c1.dayNightMatch=true;
        c1.ticketPrice=1500;
        c1.audienceCount=35000;
        c1.broadcastChannel="Star Sports";
        c1.seriesName="World Cup";

        c1.display();

        Cricket c2 = new Cricket("T20","India","England","Eden Gardens","India",20,11,180,170,6,9,"England","Field","India","Rohit Sharma","Joel Wilson","Chris Gaffaney","Anil Chaudhary","Jeff Crowe",2025,true,1200,42000,"Sony Sports","T20 Series");

        c2.display();
    }
}