class BigDaddy {

    int shipId;
    String shipName;

    Casino casino;
	public BigDaddy(int shipId,String shipName,Casino casino){
		this.shipId=shipId;
		this.shipName=shipName;
		this.casino=casino;
	}

    public void getBigDaddyDetail(){

        System.out.println("--------------------------------");
        System.out.println("BigDaddy Details");
        System.out.println("Ship Id: " + this.shipId);
        System.out.println("Ship Name: " + this.shipName);

        this.casino.getCasinoDetail();

    }
}