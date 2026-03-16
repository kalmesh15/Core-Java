class BigDaddy {

    int shipId;
    String shipName;

    Casino casino;

    public void getBigDaddyDetail(){

        System.out.println("--------------------------------");
        System.out.println("BigDaddy Details");
        System.out.println("Ship Id: " + this.shipId);
        System.out.println("Ship Name: " + this.shipName);

        this.casino.getCasinoDetail();

    }
}