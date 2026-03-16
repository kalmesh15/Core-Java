class Casino {

    int casinoId;
    String casinoName;
    String gameType;
    int entryFee;

    public void getCasinoDetail(){

        System.out.println("Casino Details");
        System.out.println("Casino Id: " + this.casinoId);
        System.out.println("Casino Name: " + this.casinoName);
        System.out.println("Game Type: " + this.gameType);
        System.out.println("Entry Fee: " + this.entryFee);

    }
}