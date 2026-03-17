class Train {

    int trainId;
    String trainName;

    Boggie boggie;
	
	public Train(int trainId,String trainName,Boggie boggie){
		this.trainId=trainId;
		this.trainName=trainName;
		this.boggie=boggie;
	}

    public void getTrainDetail() {

        System.out.println("--------------------------------");
        System.out.println("Train Details");
        System.out.println("Train Id: " + this.trainId);
        System.out.println("Train Name: " + this.trainName);

        this.boggie.getBoggieDetail();
    }
}