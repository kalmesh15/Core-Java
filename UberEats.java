class UberEats {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Hyderabadi Dum Biryani"){
            price = 249.00;
        }else if(foodName == "Ambur Biryani"){
            price = 229.00;
        }else if(foodName == "Donne Biryani"){
            price = 199.00;
        }else if(foodName == "Lucknowi Biryani"){
            price = 259.00;
        }else if(foodName == "Kolkata Biryani"){
            price = 239.00;
        }else if(foodName == "Afghani Chicken"){
            price = 279.00;
        }else if(foodName == "Tandoori Roti"){
            price = 25.00;
        }else if(foodName == "Butter Naan"){
            price = 45.00;
        }else if(foodName == "Laccha Paratha"){
            price = 50.00;
        }else if(foodName == "Missi Roti"){
            price = 35.00;
        }else if(foodName == "Paneer Lababdar"){
            price = 240.00;
        }else if(foodName == "Shahi Paneer"){
            price = 235.00;
        }else if(foodName == "Kaju Masala"){
            price = 260.00;
        }else if(foodName == "Navratan Korma"){
            price = 225.00;
        }else if(foodName == "Baingan Bharta"){
            price = 180.00;
        }else if(foodName == "Aloo Gobi"){
            price = 150.00;
        }else if(foodName == "Bhindi Masala"){
            price = 165.00;
        }else if(foodName == "Chicken Handi"){
            price = 270.00;
        }else if(foodName == "Mughlai Chicken"){
            price = 285.00;
        }else if(foodName == "Kadai Chicken"){
            price = 255.00;
        }else if(foodName == "Rogan Josh"){
            price = 320.00;
        }else if(foodName == "Keema Masala"){
            price = 290.00;
        }else if(foodName == "Egg Curry"){
            price = 170.00;
        }else if(foodName == "Anda Bhurji"){
            price = 120.00;
        }else if(foodName == "Pesarattu"){
            price = 95.00;
        }else if(foodName == "Appam"){
            price = 60.00;
        }else if(foodName == "Neer Dosa"){
            price = 85.00;
        }else if(foodName == "Chicken Sukka"){
            price = 275.00;
        }else if(foodName == "Mutton Sukka"){
            price = 330.00;
        }else if(foodName == "Fish Curry"){
            price = 295.00;
        }else if(foodName == "Crab Masala"){
            price = 350.00;
        }else if(foodName == "Prawn Fry"){
            price = 310.00;
        }else if(foodName == "Veg Cutlet"){
            price = 70.00;
        }else if(foodName == "Chicken Cutlet"){
            price = 110.00;
        }else if(foodName == "Corn Cheese Balls"){
            price = 130.00;
        }else if(foodName == "Stuffed Mushroom"){
            price = 145.00;
        }else if(foodName == "Veg Lasagna"){
            price = 210.00;
        }else if(foodName == "Chicken Lasagna"){
            price = 240.50;
        }else if(foodName == "Veg Nachos"){
            price = 125.00;
        }else if(foodName == "Chicken Nachos"){
            price = 165.00;
        }else if(foodName == "Peri Peri Fries"){
            price = 95.50;
        }else if(foodName == "Loaded Fries"){
            price = 150.75;
        }else if(foodName == "Cheese Omelette"){
            price = 75.00;
        }else if(foodName == "Spanish Omelette"){
            price = 105.00;
        }else if(foodName == "Masala Omelette"){
            price = 65.00;
        }else if(foodName == "Vanilla Shake"){
            price = 95.00;
        }else if(foodName == "Strawberry Shake"){
            price = 98.00;
        }else if(foodName == "Kitkat Shake"){
            price = 130.00;
        }else if(foodName == "Oreo Shake"){
            price = 135.00;
        }else if(foodName == "Blueberry Cheesecake"){
            price = 180.00;
        }else if(foodName == "Red Velvet Cake"){
            price = 170.00;
        }else if(foodName == "Caramel Pudding"){
            price = 115.00;
        }else if(foodName == "Tiramisu"){
            price = 220.00;
        }else if(foodName == "Mocha Coffee"){
            price = 140.00;
        }else if(foodName == "Cappuccino"){
            price = 125.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price;
    }
	
	//method overloading
	
	public static double search(String foodName, int items){

        double price = 0.00;

        if(foodName == "Hyderabadi Dum Biryani"){
            price = 249.00;
        }else if(foodName == "Ambur Biryani"){
            price = 229.00;
        }else if(foodName == "Donne Biryani"){
            price = 199.00;
        }else if(foodName == "Lucknowi Biryani"){
            price = 259.00;
        }else if(foodName == "Kolkata Biryani"){
            price = 239.00;
        }else if(foodName == "Afghani Chicken"){
            price = 279.00;
        }else if(foodName == "Tandoori Roti"){
            price = 25.00;
        }else if(foodName == "Butter Naan"){
            price = 45.00;
        }else if(foodName == "Laccha Paratha"){
            price = 50.00;
        }else if(foodName == "Missi Roti"){
            price = 35.00;
        }else if(foodName == "Paneer Lababdar"){
            price = 240.00;
        }else if(foodName == "Shahi Paneer"){
            price = 235.00;
        }else if(foodName == "Kaju Masala"){
            price = 260.00;
        }else if(foodName == "Navratan Korma"){
            price = 225.00;
        }else if(foodName == "Baingan Bharta"){
            price = 180.00;
        }else if(foodName == "Aloo Gobi"){
            price = 150.00;
        }else if(foodName == "Bhindi Masala"){
            price = 165.00;
        }else if(foodName == "Chicken Handi"){
            price = 270.00;
        }else if(foodName == "Mughlai Chicken"){
            price = 285.00;
        }else if(foodName == "Kadai Chicken"){
            price = 255.00;
        }else if(foodName == "Rogan Josh"){
            price = 320.00;
        }else if(foodName == "Keema Masala"){
            price = 290.00;
        }else if(foodName == "Egg Curry"){
            price = 170.00;
        }else if(foodName == "Anda Bhurji"){
            price = 120.00;
        }else if(foodName == "Pesarattu"){
            price = 95.00;
        }else if(foodName == "Appam"){
            price = 60.00;
        }else if(foodName == "Neer Dosa"){
            price = 85.00;
        }else if(foodName == "Chicken Sukka"){
            price = 275.00;
        }else if(foodName == "Mutton Sukka"){
            price = 330.00;
        }else if(foodName == "Fish Curry"){
            price = 295.00;
        }else if(foodName == "Crab Masala"){
            price = 350.00;
        }else if(foodName == "Prawn Fry"){
            price = 310.00;
        }else if(foodName == "Veg Cutlet"){
            price = 70.00;
        }else if(foodName == "Chicken Cutlet"){
            price = 110.00;
        }else if(foodName == "Corn Cheese Balls"){
            price = 130.00;
        }else if(foodName == "Stuffed Mushroom"){
            price = 145.00;
        }else if(foodName == "Veg Lasagna"){
            price = 210.00;
        }else if(foodName == "Chicken Lasagna"){
            price = 240.50;
        }else if(foodName == "Veg Nachos"){
            price = 125.00;
        }else if(foodName == "Chicken Nachos"){
            price = 165.00;
        }else if(foodName == "Peri Peri Fries"){
            price = 95.50;
        }else if(foodName == "Loaded Fries"){
            price = 150.75;
        }else if(foodName == "Cheese Omelette"){
            price = 75.00;
        }else if(foodName == "Spanish Omelette"){
            price = 105.00;
        }else if(foodName == "Masala Omelette"){
            price = 65.00;
        }else if(foodName == "Vanilla Shake"){
            price = 95.00;
        }else if(foodName == "Strawberry Shake"){
            price = 98.00;
        }else if(foodName == "Kitkat Shake"){
            price = 130.00;
        }else if(foodName == "Oreo Shake"){
            price = 135.00;
        }else if(foodName == "Blueberry Cheesecake"){
            price = 180.00;
        }else if(foodName == "Red Velvet Cake"){
            price = 170.00;
        }else if(foodName == "Caramel Pudding"){
            price = 115.00;
        }else if(foodName == "Tiramisu"){
            price = 220.00;
        }else if(foodName == "Mocha Coffee"){
            price = 140.00;
        }else if(foodName == "Cappuccino"){
            price = 125.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price*items;
    }
}
