class HotelExecutor{
	public static void main(String[] hot){
		
		Hotel hotel = new Hotel();
		hotel.hotelId = 2;
		System.out.println(hotel.hotelId);
		Floor floor = new Floor();
		floor.floorId = 3;
		hotel.floor = floor;
		
		
		hotel.getHotelDetail();
		
		//Hotel hotel1 = new Hotel();
		//hotel1.hotelId =3;
		
		
		
	}
}
//System.out.println(floor.room.roomId);
//System.out.println(hotel.floor);