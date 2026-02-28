class TableManager{
	public static void seatGuest(int tableNumber){
		System.out.println("seatGuest method invoking takeOrder............");
		Waiter.takeOrder();
		System.out.println("table number is "+tableNumber);
	}
}