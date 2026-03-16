class Hotel {
	
	
	int hotelId;
	
	Floor floor;
	
	
	public void getHotelDetail(){
		System.out.println("The Hotel Id is "+ hotelId);
		System.out.println("Fetching  Floor detail  ");
		this.floor.getFloorDetail();
	}

}