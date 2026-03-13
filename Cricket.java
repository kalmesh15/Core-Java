class Cricket {

    String matchType;
    String teamOne;
    String teamTwo;
    String stadiumName;
    String hostCountry;
    int oversLimit;
    int playersPerTeam;
    int teamOneScore;
    int teamTwoScore;
    int teamOneWickets;
    int teamTwoWickets;
    String tossWinner;
    String tossDecision;
    String matchWinner;
    String manOfTheMatch;
    String umpireOne;
    String umpireTwo;
    String thirdUmpire;
    String matchReferee;
    int matchYear;
    boolean dayNightMatch;
    double ticketPrice;
    int audienceCount;
    String broadcastChannel;
    String seriesName;

    Cricket() {

    }

    Cricket(String matchType, String teamOne, String teamTwo, String stadiumName, String hostCountry, int oversLimit, int playersPerTeam, int teamOneScore, int teamTwoScore, int teamOneWickets, int teamTwoWickets, String tossWinner, String tossDecision, String matchWinner, String manOfTheMatch, String umpireOne, String umpireTwo, String thirdUmpire, String matchReferee, int matchYear, boolean dayNightMatch, double ticketPrice, int audienceCount, String broadcastChannel, String seriesName) {

        this.matchType = matchType;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.stadiumName = stadiumName;
        this.hostCountry = hostCountry;
        this.oversLimit = oversLimit;
        this.playersPerTeam = playersPerTeam;
        this.teamOneScore = teamOneScore;
        this.teamTwoScore = teamTwoScore;
        this.teamOneWickets = teamOneWickets;
        this.teamTwoWickets = teamTwoWickets;
        this.tossWinner = tossWinner;
        this.tossDecision = tossDecision;
        this.matchWinner = matchWinner;
        this.manOfTheMatch = manOfTheMatch;
        this.umpireOne = umpireOne;
        this.umpireTwo = umpireTwo;
        this.thirdUmpire = thirdUmpire;
        this.matchReferee = matchReferee;
        this.matchYear = matchYear;
        this.dayNightMatch = dayNightMatch;
        this.ticketPrice = ticketPrice;
        this.audienceCount = audienceCount;
        this.broadcastChannel = broadcastChannel;
        this.seriesName = seriesName;
    }

    void display() {

        System.out.println("Match Type: " + matchType);
        System.out.println("Team One: " + teamOne);
        System.out.println("Team Two: " + teamTwo);
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Host Country: " + hostCountry);
        System.out.println("Overs Limit: " + oversLimit);
        System.out.println("Players Per Team: " + playersPerTeam);
        System.out.println("Team One Score: " + teamOneScore);
        System.out.println("Team Two Score: " + teamTwoScore);
        System.out.println("Team One Wickets: " + teamOneWickets);
        System.out.println("Team Two Wickets: " + teamTwoWickets);
        System.out.println("Toss Winner: " + tossWinner);
        System.out.println("Toss Decision: " + tossDecision);
        System.out.println("Match Winner: " + matchWinner);
        System.out.println("Man Of The Match: " + manOfTheMatch);
        System.out.println("Umpire One: " + umpireOne);
        System.out.println("Umpire Two: " + umpireTwo);
        System.out.println("Third Umpire: " + thirdUmpire);
        System.out.println("Match Referee: " + matchReferee);
        System.out.println("Match Year: " + matchYear);
        System.out.println("Day Night Match: " + dayNightMatch);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Audience Count: " + audienceCount);
        System.out.println("Broadcast Channel: " + broadcastChannel);
        System.out.println("Series Name: " + seriesName);
    }
}