class Zomato {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Burger"){
            price = 99.00;
        }else if(foodName == "Pizza"){
            price = 199.00;
        }else if(foodName == "Pasta"){
            price = 179.00;
        }else if(foodName == "Sandwich"){
            price = 89.00;
        }else if(foodName == "French Fries"){
            price = 79.00;
        }else if(foodName == "Hot Dog"){
            price = 109.00;
        }else if(foodName == "Taco"){
            price = 149.00;
        }else if(foodName == "Wrap"){
            price = 129.00;
        }else if(foodName == "Noodles"){
            price = 139.00;
        }else if(foodName == "Momos"){
            price = 119.00;
        }else if(foodName == "Paneer Tikka"){
            price = 249.00;
        }else if(foodName == "Chicken Tikka"){
            price = 269.00;
        }else if(foodName == "Veg Biryani"){
            price = 189.00;
        }else if(foodName == "Chicken Biryani"){
            price = 229.00;
        }else if(foodName == "Mutton Biryani"){
            price = 289.00;
        }else if(foodName == "Fried Rice"){
            price = 159.00;
        }else if(foodName == "Manchurian"){
            price = 169.00;
        }else if(foodName == "Spring Roll"){
            price = 149.50;
        }else if(foodName == "Chowmein"){
            price = 149.75;
        }else if(foodName == "Shawarma"){
            price = 159.50;
        }else if(foodName == "Falafel"){
            price = 139.50;
        }else if(foodName == "Grilled Chicken"){
            price = 299.00;
        }else if(foodName == "BBQ Wings"){
            price = 279.00;
        }else if(foodName == "Cheese Balls"){
            price = 149.25;
        }else if(foodName == "Garlic Bread"){
            price = 129.50;
        }else if(foodName == "Stuffed Paratha"){
            price = 119.25;
        }else if(foodName == "Dal Tadka"){
            price = 149.80;
        }else if(foodName == "Paneer Butter Masala"){
            price = 239.00;
        }else if(foodName == "Butter Chicken"){
            price = 259.00;
        }else if(foodName == "Fish Fry"){
            price = 269.50;
        }else if(foodName == "Prawns Masala"){
            price = 319.00;
        }else if(foodName == "Kebab Platter"){
            price = 349.00;
        }else if(foodName == "Seekh Kebab"){
            price = 289.50;
        }else if(foodName == "Chicken Curry"){
            price = 219.50;
        }else if(foodName == "Mutton Curry"){
            price = 309.00;
        }else if(foodName == "Veg Thali"){
            price = 199.50;
        }else if(foodName == "NonVeg Thali"){
            price = 259.75;
        }else if(foodName == "Samosa"){
            price = 25.00;
        }else if(foodName == "Kachori"){
            price = 30.00;
        }else if(foodName == "Pav Bhaji"){
            price = 149.90;
        }else if(foodName == "Dhokla"){
            price = 60.00;
        }else if(foodName == "Pani Puri"){
            price = 50.00;
        }else if(foodName == "Bhel Puri"){
            price = 70.00;
        }else if(foodName == "Rasgulla"){
            price = 40.00;
        }else if(foodName == "Gulab Jamun"){
            price = 45.00;
        }else if(foodName == "Ice Cream"){
            price = 90.00;
        }else if(foodName == "Brownie"){
            price = 110.00;
        }else if(foodName == "Chocolate Cake"){
            price = 130.00;
        }else if(foodName == "Milkshake"){
            price = 120.00;
        }else if(foodName == "Cold Coffee"){
            price = 125.00;
        }else if(foodName == "Lemon Juice"){
            price = 35.00;
        }else if(foodName == "Mango Shake"){
            price = 140.00;
        }else if(foodName == "Fruit Salad"){
            price = 100.00;
        }else if(foodName == "Omelette"){
            price = 55.00;
        }else if(foodName == "Boiled Egg"){
            price = 20.00;
        }
		else {
			System.out.println("The food is not Available...!");
		}

        return price;
    }
	
	//method overloading
	
	
	public static double search(String foodName, int items){

        double price = 0.00;

        if(foodName == "Burger"){
            price = 99.00;
        }else if(foodName == "Pizza"){
            price = 199.00;
        }else if(foodName == "Pasta"){
            price = 179.00;
        }else if(foodName == "Sandwich"){
            price = 89.00;
        }else if(foodName == "French Fries"){
            price = 79.00;
        }else if(foodName == "Hot Dog"){
            price = 109.00;
        }else if(foodName == "Taco"){
            price = 149.00;
        }else if(foodName == "Wrap"){
            price = 129.00;
        }else if(foodName == "Noodles"){
            price = 139.00;
        }else if(foodName == "Momos"){
            price = 119.00;
        }else if(foodName == "Paneer Tikka"){
            price = 249.00;
        }else if(foodName == "Chicken Tikka"){
            price = 269.00;
        }else if(foodName == "Veg Biryani"){
            price = 189.00;
        }else if(foodName == "Chicken Biryani"){
            price = 229.00;
        }else if(foodName == "Mutton Biryani"){
            price = 289.00;
        }else if(foodName == "Fried Rice"){
            price = 159.00;
        }else if(foodName == "Manchurian"){
            price = 169.00;
        }else if(foodName == "Spring Roll"){
            price = 149.50;
        }else if(foodName == "Chowmein"){
            price = 149.75;
        }else if(foodName == "Shawarma"){
            price = 159.50;
        }else if(foodName == "Falafel"){
            price = 139.50;
        }else if(foodName == "Grilled Chicken"){
            price = 299.00;
        }else if(foodName == "BBQ Wings"){
            price = 279.00;
        }else if(foodName == "Cheese Balls"){
            price = 149.25;
        }else if(foodName == "Garlic Bread"){
            price = 129.50;
        }else if(foodName == "Stuffed Paratha"){
            price = 119.25;
        }else if(foodName == "Dal Tadka"){
            price = 149.80;
        }else if(foodName == "Paneer Butter Masala"){
            price = 239.00;
        }else if(foodName == "Butter Chicken"){
            price = 259.00;
        }else if(foodName == "Fish Fry"){
            price = 269.50;
        }else if(foodName == "Prawns Masala"){
            price = 319.00;
        }else if(foodName == "Kebab Platter"){
            price = 349.00;
        }else if(foodName == "Seekh Kebab"){
            price = 289.50;
        }else if(foodName == "Chicken Curry"){
            price = 219.50;
        }else if(foodName == "Mutton Curry"){
            price = 309.00;
        }else if(foodName == "Veg Thali"){
            price = 199.50;
        }else if(foodName == "NonVeg Thali"){
            price = 259.75;
        }else if(foodName == "Samosa"){
            price = 25.00;
        }else if(foodName == "Kachori"){
            price = 30.00;
        }else if(foodName == "Pav Bhaji"){
            price = 149.90;
        }else if(foodName == "Dhokla"){
            price = 60.00;
        }else if(foodName == "Pani Puri"){
            price = 50.00;
        }else if(foodName == "Bhel Puri"){
            price = 70.00;
        }else if(foodName == "Rasgulla"){
            price = 40.00;
        }else if(foodName == "Gulab Jamun"){
            price = 45.00;
        }else if(foodName == "Ice Cream"){
            price = 90.00;
        }else if(foodName == "Brownie"){
            price = 110.00;
        }else if(foodName == "Chocolate Cake"){
            price = 130.00;
        }else if(foodName == "Milkshake"){
            price = 120.00;
        }else if(foodName == "Cold Coffee"){
            price = 125.00;
        }else if(foodName == "Lemon Juice"){
            price = 35.00;
        }else if(foodName == "Mango Shake"){
            price = 140.00;
        }else if(foodName == "Fruit Salad"){
            price = 100.00;
        }else if(foodName == "Omelette"){
            price = 55.00;
        }else if(foodName == "Boiled Egg"){
            price = 20.00;
        }
		else {
			System.out.println("The food is not Available...!");
		}

        return price*items;
    }
}
