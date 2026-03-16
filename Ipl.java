class Ipl {

    int iplId;
    String teamName;

    Player player;

    public void getIplDetail() {

        System.out.println("--------------------------------");
        System.out.println("IPL Team Details");
        System.out.println("IPL Id: " + this.iplId);
        System.out.println("Team Name: " + this.teamName);

        this.player.getPlayerDetail();
    }
}