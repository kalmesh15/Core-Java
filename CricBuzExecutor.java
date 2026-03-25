class CricBuzExecutor {
    public static void main(String[] args) {

        CricBuz obj = new CricBuz();

        obj.addTeam("India");
        obj.addTeam("Australia");
        obj.addTeam("England");
        obj.addTeam("South Africa");
        obj.addTeam("New Zealand");
        obj.addTeam("Pakistan");
        obj.addTeam("Sri Lanka");
        obj.addTeam("West Indies");

        obj.getTeams();
    }
}