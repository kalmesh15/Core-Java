class Boggie {

    int boggieId;
    String boggieType;
    int seats;
	
	public Boggie(int boggieId,String boggieType,int seats){
		this.boggieId=boggieId;
		this.boggieType=boggieType;
		this.seats=seats;
		
	}

    public void getBoggieDetail() {

        System.out.println("Boggie Details");
        System.out.println("Boggie Id: " + this.boggieId);
        System.out.println("Boggie Type: " + this.boggieType);
        System.out.println("Seats: " + this.seats);
    }
}