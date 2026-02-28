class Restaurant {
	public static void  restaurant(String restaurantName,int seatNumer){
		System.out.println("restaurant method invoking seatGuest............");
		System.out.println("restaurant name is "+restaurantName);
		TableManager.seatGuest(seatNumer);
	}
}