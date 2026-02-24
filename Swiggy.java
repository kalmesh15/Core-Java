class Swiggy {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Masala Dosa"){
            price = 80.00;
        }else if(foodName == "Plain Dosa"){
            price = 60.00;
        }else if(foodName == "Rava Dosa"){
            price = 95.00;
        }else if(foodName == "Set Dosa"){
            price = 85.00;
        }else if(foodName == "Onion Dosa"){
            price = 90.00;
        }else if(foodName == "Idli Sambar"){
            price = 50.00;
        }else if(foodName == "Vada Sambar"){
            price = 55.00;
        }else if(foodName == "Rava Idli"){
            price = 65.00;
        }else if(foodName == "Pongal"){
            price = 75.00;
        }else if(foodName == "Upma"){
            price = 45.00;
        }else if(foodName == "Tomato Rice"){
            price = 70.00;
        }else if(foodName == "Lemon Rice"){
            price = 68.00;
        }else if(foodName == "Curd Rice"){
            price = 72.00;
        }else if(foodName == "Bisibele Bath"){
            price = 110.00;
        }else if(foodName == "Puliyogare"){
            price = 78.00;
        }else if(foodName == "Akki Roti"){
            price = 85.50;
        }else if(foodName == "Ragi Mudde"){
            price = 65.50;
        }else if(foodName == "Veg Pulao"){
            price = 150.00;
        }else if(foodName == "Jeera Rice"){
            price = 140.00;
        }else if(foodName == "Ghee Rice"){
            price = 160.00;
        }else if(foodName == "Kadai Paneer"){
            price = 220.00;
        }else if(foodName == "Palak Paneer"){
            price = 210.00;
        }else if(foodName == "Malai Kofta"){
            price = 230.00;
        }else if(foodName == "Mushroom Masala"){
            price = 200.00;
        }else if(foodName == "Veg Kolhapuri"){
            price = 205.00;
        }else if(foodName == "Chicken Lollipop"){
            price = 240.00;
        }else if(foodName == "Chicken 65"){
            price = 235.00;
        }else if(foodName == "Chilli Chicken"){
            price = 245.00;
        }else if(foodName == "Dragon Chicken"){
            price = 255.00;
        }else if(foodName == "Pepper Chicken"){
            price = 260.00;
        }else if(foodName == "Egg Fried Rice"){
            price = 165.00;
        }else if(foodName == "Chicken Fried Rice"){
            price = 185.00;
        }else if(foodName == "Schezwan Rice"){
            price = 175.00;
        }else if(foodName == "Veg Hakka Noodles"){
            price = 155.00;
        }else if(foodName == "Chicken Hakka Noodles"){
            price = 195.00;
        }else if(foodName == "Paneer Roll"){
            price = 120.00;
        }else if(foodName == "Chicken Roll"){
            price = 135.00;
        }else if(foodName == "Egg Roll"){
            price = 110.50;
        }else if(foodName == "Veg Burger"){
            price = 95.50;
        }else if(foodName == "Chicken Burger"){
            price = 125.50;
        }else if(foodName == "Club Sandwich"){
            price = 145.00;
        }else if(foodName == "Grill Sandwich"){
            price = 115.75;
        }else if(foodName == "Cheese Sandwich"){
            price = 105.75;
        }else if(foodName == "Veg Momos"){
            price = 130.50;
        }else if(foodName == "Chicken Momos"){
            price = 150.50;
        }else if(foodName == "Tandoori Momos"){
            price = 170.50;
        }else if(foodName == "Paneer Momos"){
            price = 145.50;
        }else if(foodName == "Veg Soup"){
            price = 90.50;
        }else if(foodName == "Chicken Soup"){
            price = 115.00;
        }else if(foodName == "Sweet Corn Soup"){
            price = 85.25;
        }else if(foodName == "Hot And Sour Soup"){
            price = 100.25;
        }else if(foodName == "Buttermilk"){
            price = 25.50;
        }else if(foodName == "Lassi"){
            price = 60.50;
        }else if(foodName == "Rose Milk"){
            price = 55.75;
        }else if(foodName == "Badam Milk"){
            price = 75.75;
        }else {
			System.out.println("The food is not Available...!");
		}


        return price;
		
	}	
		
		
		public static double search(String foodName, int items){

        double price = 0.00;

        if(foodName == "Masala Dosa"){
            price = 80.00;
        }else if(foodName == "Plain Dosa"){
            price = 60.00;
        }else if(foodName == "Rava Dosa"){
            price = 95.00;
        }else if(foodName == "Set Dosa"){
            price = 85.00;
        }else if(foodName == "Onion Dosa"){
            price = 90.00;
        }else if(foodName == "Idli Sambar"){
            price = 50.00;
        }else if(foodName == "Vada Sambar"){
            price = 55.00;
        }else if(foodName == "Rava Idli"){
            price = 65.00;
        }else if(foodName == "Pongal"){
            price = 75.00;
        }else if(foodName == "Upma"){
            price = 45.00;
        }else if(foodName == "Tomato Rice"){
            price = 70.00;
        }else if(foodName == "Lemon Rice"){
            price = 68.00;
        }else if(foodName == "Curd Rice"){
            price = 72.00;
        }else if(foodName == "Bisibele Bath"){
            price = 110.00;
        }else if(foodName == "Puliyogare"){
            price = 78.00;
        }else if(foodName == "Akki Roti"){
            price = 85.50;
        }else if(foodName == "Ragi Mudde"){
            price = 65.50;
        }else if(foodName == "Veg Pulao"){
            price = 150.00;
        }else if(foodName == "Jeera Rice"){
            price = 140.00;
        }else if(foodName == "Ghee Rice"){
            price = 160.00;
        }else if(foodName == "Kadai Paneer"){
            price = 220.00;
        }else if(foodName == "Palak Paneer"){
            price = 210.00;
        }else if(foodName == "Malai Kofta"){
            price = 230.00;
        }else if(foodName == "Mushroom Masala"){
            price = 200.00;
        }else if(foodName == "Veg Kolhapuri"){
            price = 205.00;
        }else if(foodName == "Chicken Lollipop"){
            price = 240.00;
        }else if(foodName == "Chicken 65"){
            price = 235.00;
        }else if(foodName == "Chilli Chicken"){
            price = 245.00;
        }else if(foodName == "Dragon Chicken"){
            price = 255.00;
        }else if(foodName == "Pepper Chicken"){
            price = 260.00;
        }else if(foodName == "Egg Fried Rice"){
            price = 165.00;
        }else if(foodName == "Chicken Fried Rice"){
            price = 185.00;
        }else if(foodName == "Schezwan Rice"){
            price = 175.00;
        }else if(foodName == "Veg Hakka Noodles"){
            price = 155.00;
        }else if(foodName == "Chicken Hakka Noodles"){
            price = 195.00;
        }else if(foodName == "Paneer Roll"){
            price = 120.00;
        }else if(foodName == "Chicken Roll"){
            price = 135.00;
        }else if(foodName == "Egg Roll"){
            price = 110.50;
        }else if(foodName == "Veg Burger"){
            price = 95.50;
        }else if(foodName == "Chicken Burger"){
            price = 125.50;
        }else if(foodName == "Club Sandwich"){
            price = 145.00;
        }else if(foodName == "Grill Sandwich"){
            price = 115.75;
        }else if(foodName == "Cheese Sandwich"){
            price = 105.75;
        }else if(foodName == "Veg Momos"){
            price = 130.50;
        }else if(foodName == "Chicken Momos"){
            price = 150.50;
        }else if(foodName == "Tandoori Momos"){
            price = 170.50;
        }else if(foodName == "Paneer Momos"){
            price = 145.50;
        }else if(foodName == "Veg Soup"){
            price = 90.50;
        }else if(foodName == "Chicken Soup"){
            price = 115.00;
        }else if(foodName == "Sweet Corn Soup"){
            price = 85.25;
        }else if(foodName == "Hot And Sour Soup"){
            price = 100.25;
        }else if(foodName == "Buttermilk"){
            price = 25.50;
        }else if(foodName == "Lassi"){
            price = 60.50;
        }else if(foodName == "Rose Milk"){
            price = 55.75;
        }else if(foodName == "Badam Milk"){
            price = 75.75;
        }else {
			System.out.println("The food is not Available...!");
		}


        return price*items;
    }
}
