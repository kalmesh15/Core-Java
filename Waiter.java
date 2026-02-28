class Waiter{
	public static void takeOrder(){
		System.out.println("takeOrder method invoking sendToKitchen............");
		OrderSystem.sendToKitchen() ;
	}
}