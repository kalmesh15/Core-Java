class HotelExecutor{
	public static void main(String[] hot){
		
		String[] itemNames = {"idli","Dosa"};
		
		Floor floor = new Floor(5);
		Menu menu = new Menu(10,itemNames);
		
		Hotel hotel = new Hotel(2,floor, menu);
		hotel.getHotelDetail();
		
		
		//hotel.hotelId = 2;                   //  Field Injection
		
		
		/*System.out.println("Hotel Id is ");
		System.out.println(hotel.hotelId);
		System.out.println("Floor Id is ");
		System.out.println(hotel.floor.floorId);
		floor.floorId = 3;
		hotel.floor = floor;*/
		
		
		
		
		//Hotel hotel1 = new Hotel();
		//hotel1.hotelId =3;
		
		
		
	}
}
//System.out.println(floor.room.roomId);
//System.out.println(hotel.floor);