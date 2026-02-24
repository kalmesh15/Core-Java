class EatSure {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Classic Veg Combo"){
            price = 180.00;
        }else if(foodName == "Deluxe Veg Combo"){
            price = 210.00;
        }else if(foodName == "Classic NonVeg Combo"){
            price = 240.00;
        }else if(foodName == "Premium NonVeg Combo"){
            price = 290.00;
        }else if(foodName == "Mini Veg Meal"){
            price = 150.00;
        }else if(foodName == "Mini Chicken Meal"){
            price = 190.00;
        }else if(foodName == "Family Veg Pack"){
            price = 399.00;
        }else if(foodName == "Family Chicken Pack"){
            price = 499.00;
        }else if(foodName == "Veg Delight Bowl"){
            price = 170.00;
        }else if(foodName == "Chicken Delight Bowl"){
            price = 220.00;
        }else if(foodName == "Paneer Rice Bowl"){
            price = 200.00;
        }else if(foodName == "Chicken Rice Bowl"){
            price = 230.00;
        }else if(foodName == "Mutton Rice Bowl"){
            price = 280.00;
        }else if(foodName == "Veggie Wrap Meal"){
            price = 160.00;
        }else if(foodName == "Chicken Wrap Meal"){
            price = 210.00;
        }else if(foodName == "Paneer Wrap Meal"){
            price = 190.00;
        }else if(foodName == "Veg Fiesta Platter"){
            price = 260.00;
        }else if(foodName == "Chicken Fiesta Platter"){
            price = 310.00;
        }else if(foodName == "Mutton Fiesta Platter"){
            price = 360.00;
        }else if(foodName == "Spicy Veg Bowl"){
            price = 175.00;
        }else if(foodName == "Spicy Chicken Bowl"){
            price = 225.00;
        }else if(foodName == "Veg Curry Combo"){
            price = 185.00;
        }else if(foodName == "Chicken Curry Combo"){
            price = 245.00;
        }else if(foodName == "Mutton Curry Combo"){
            price = 305.00;
        }else if(foodName == "Veg Steam Momos"){
            price = 130.00;
        }else if(foodName == "Chicken Steam Momos"){
            price = 160.00;
        }else if(foodName == "Paneer Steam Momos"){
            price = 145.00;
        }else if(foodName == "Veg Fried Momos"){
            price = 140.00;
        }else if(foodName == "Chicken Fried Momos"){
            price = 175.00;
        }else if(foodName == "Veg Schezwan Bowl"){
            price = 190.00;
        }else if(foodName == "Chicken Schezwan Bowl"){
            price = 235.00;
        }else if(foodName == "Veg Manchurian Bowl"){
            price = 195.00;
        }else if(foodName == "Chicken Manchurian Bowl"){
            price = 250.00;
        }else if(foodName == "Veg Kathi Roll"){
            price = 120.00;
        }else if(foodName == "Chicken Kathi Roll"){
            price = 155.00;
        }else if(foodName == "Paneer Kathi Roll"){
            price = 140.00;
        }else if(foodName == "Veg Stuffed Kulcha"){
            price = 110.00;
        }else if(foodName == "Paneer Stuffed Kulcha"){
            price = 150.00;
        }else if(foodName == "Chicken Stuffed Kulcha"){
            price = 180.00;
        }else if(foodName == "Veg Loaded Nachos"){
            price = 165.00;
        }else if(foodName == "Chicken Loaded Nachos"){
            price = 205.00;
        }else if(foodName == "Veg Crispy Meal"){
            price = 175.50;
        }else if(foodName == "Chicken Crispy Meal"){
            price = 215.50;
        }else if(foodName == "Veg Power Bowl"){
            price = 210.50;
        }else if(foodName == "Chicken Power Bowl"){
            price = 260.50;
        }else if(foodName == "Veg Masala Khichdi"){
            price = 135.00;
        }else if(foodName == "Chicken Masala Khichdi"){
            price = 185.00;
        }else if(foodName == "Veg Mac n Cheese"){
            price = 220.50;
        }else if(foodName == "Chicken Mac n Cheese"){
            price = 270.50;
        }else if(foodName == "Veg Pasta Bowl"){
            price = 200.50;
        }else if(foodName == "Chicken Pasta Bowl"){
            price = 255.50;
        }else if(foodName == "Veg Supreme Combo"){
            price = 275.00;
        }else if(foodName == "Chicken Supreme Combo"){
            price = 325.00;
        }else if(foodName == "Royal Mutton Combo"){
            price = 375.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price;
    }
	
	
	
	public static double search(String foodName, int items){

        double price = 0.00;

        if(foodName == "Classic Veg Combo"){
            price = 180.00;
        }else if(foodName == "Deluxe Veg Combo"){
            price = 210.00;
        }else if(foodName == "Classic NonVeg Combo"){
            price = 240.00;
        }else if(foodName == "Premium NonVeg Combo"){
            price = 290.00;
        }else if(foodName == "Mini Veg Meal"){
            price = 150.00;
        }else if(foodName == "Mini Chicken Meal"){
            price = 190.00;
        }else if(foodName == "Family Veg Pack"){
            price = 399.00;
        }else if(foodName == "Family Chicken Pack"){
            price = 499.00;
        }else if(foodName == "Veg Delight Bowl"){
            price = 170.00;
        }else if(foodName == "Chicken Delight Bowl"){
            price = 220.00;
        }else if(foodName == "Paneer Rice Bowl"){
            price = 200.00;
        }else if(foodName == "Chicken Rice Bowl"){
            price = 230.00;
        }else if(foodName == "Mutton Rice Bowl"){
            price = 280.00;
        }else if(foodName == "Veggie Wrap Meal"){
            price = 160.00;
        }else if(foodName == "Chicken Wrap Meal"){
            price = 210.00;
        }else if(foodName == "Paneer Wrap Meal"){
            price = 190.00;
        }else if(foodName == "Veg Fiesta Platter"){
            price = 260.00;
        }else if(foodName == "Chicken Fiesta Platter"){
            price = 310.00;
        }else if(foodName == "Mutton Fiesta Platter"){
            price = 360.00;
        }else if(foodName == "Spicy Veg Bowl"){
            price = 175.00;
        }else if(foodName == "Spicy Chicken Bowl"){
            price = 225.00;
        }else if(foodName == "Veg Curry Combo"){
            price = 185.00;
        }else if(foodName == "Chicken Curry Combo"){
            price = 245.00;
        }else if(foodName == "Mutton Curry Combo"){
            price = 305.00;
        }else if(foodName == "Veg Steam Momos"){
            price = 130.00;
        }else if(foodName == "Chicken Steam Momos"){
            price = 160.00;
        }else if(foodName == "Paneer Steam Momos"){
            price = 145.00;
        }else if(foodName == "Veg Fried Momos"){
            price = 140.00;
        }else if(foodName == "Chicken Fried Momos"){
            price = 175.00;
        }else if(foodName == "Veg Schezwan Bowl"){
            price = 190.00;
        }else if(foodName == "Chicken Schezwan Bowl"){
            price = 235.00;
        }else if(foodName == "Veg Manchurian Bowl"){
            price = 195.00;
        }else if(foodName == "Chicken Manchurian Bowl"){
            price = 250.00;
        }else if(foodName == "Veg Kathi Roll"){
            price = 120.00;
        }else if(foodName == "Chicken Kathi Roll"){
            price = 155.00;
        }else if(foodName == "Paneer Kathi Roll"){
            price = 140.00;
        }else if(foodName == "Veg Stuffed Kulcha"){
            price = 110.00;
        }else if(foodName == "Paneer Stuffed Kulcha"){
            price = 150.00;
        }else if(foodName == "Chicken Stuffed Kulcha"){
            price = 180.00;
        }else if(foodName == "Veg Loaded Nachos"){
            price = 165.00;
        }else if(foodName == "Chicken Loaded Nachos"){
            price = 205.00;
        }else if(foodName == "Veg Crispy Meal"){
            price = 175.50;
        }else if(foodName == "Chicken Crispy Meal"){
            price = 215.50;
        }else if(foodName == "Veg Power Bowl"){
            price = 210.50;
        }else if(foodName == "Chicken Power Bowl"){
            price = 260.50;
        }else if(foodName == "Veg Masala Khichdi"){
            price = 135.00;
        }else if(foodName == "Chicken Masala Khichdi"){
            price = 185.00;
        }else if(foodName == "Veg Mac n Cheese"){
            price = 220.50;
        }else if(foodName == "Chicken Mac n Cheese"){
            price = 270.50;
        }else if(foodName == "Veg Pasta Bowl"){
            price = 200.50;
        }else if(foodName == "Chicken Pasta Bowl"){
            price = 255.50;
        }else if(foodName == "Veg Supreme Combo"){
            price = 275.00;
        }else if(foodName == "Chicken Supreme Combo"){
            price = 325.00;
        }else if(foodName == "Royal Mutton Combo"){
            price = 375.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price*items;
    }
}
