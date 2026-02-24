class Zepto {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Veg Sandwich Pack"){
            price = 85.00;
        }else if(foodName == "Chicken Sandwich Pack"){
            price = 125.00;
        }else if(foodName == "Paneer Sandwich Pack"){
            price = 105.00;
        }else if(foodName == "Egg Sandwich Pack"){
            price = 95.00;
        }else if(foodName == "Veg Mayo Sandwich"){
            price = 90.00;
        }else if(foodName == "Chicken Mayo Sandwich"){
            price = 135.00;
        }else if(foodName == "Veg Salad Bowl"){
            price = 110.00;
        }else if(foodName == "Chicken Salad Bowl"){
            price = 165.00;
        }else if(foodName == "Fruit Yogurt Cup"){
            price = 60.00;
        }else if(foodName == "Greek Yogurt Cup"){
            price = 75.00;
        }else if(foodName == "Chocolate Donut"){
            price = 45.00;
        }else if(foodName == "Strawberry Donut"){
            price = 50.00;
        }else if(foodName == "Blueberry Muffin"){
            price = 55.00;
        }else if(foodName == "Chocolate Muffin"){
            price = 58.00;
        }else if(foodName == "Veg Puff"){
            price = 30.00;
        }else if(foodName == "Egg Puff"){
            price = 35.00;
        }else if(foodName == "Chicken Puff"){
            price = 45.50;
        }else if(foodName == "Paneer Puff"){
            price = 40.50;
        }else if(foodName == "Mini Veg Pizza"){
            price = 120.00;
        }else if(foodName == "Mini Chicken Pizza"){
            price = 160.00;
        }else if(foodName == "Cheese Corn Cup"){
            price = 70.00;
        }else if(foodName == "Sweet Corn Cup"){
            price = 65.00;
        }else if(foodName == "Protein Bar Chocolate"){
            price = 99.00;
        }else if(foodName == "Protein Bar Peanut"){
            price = 105.50;
        }else if(foodName == "Energy Drink Can"){
            price = 110.50;
        }else if(foodName == "Cold Coffee Bottle"){
            price = 95.50;
        }else if(foodName == "Iced Tea Lemon"){
            price = 85.50;
        }else if(foodName == "Iced Tea Peach"){
            price = 88.50;
        }else if(foodName == "Fresh Lime Soda"){
            price = 70.50;
        }else if(foodName == "Watermelon Juice Bottle"){
            price = 90.50;
        }else if(foodName == "Apple Juice Bottle"){
            price = 92.50;
        }else if(foodName == "Orange Juice Bottle"){
            price = 94.50;
        }else if(foodName == "Banana Shake Bottle"){
            price = 98.50;
        }else if(foodName == "Cold Brew Coffee"){
            price = 115.50;
        }else if(foodName == "Veg Ready Meal Pack"){
            price = 150.50;
        }else if(foodName == "Chicken Ready Meal Pack"){
            price = 195.50;
        }else if(foodName == "Paneer Ready Meal Pack"){
            price = 175.50;
        }else if(foodName == "Egg Ready Meal Pack"){
            price = 165.50;
        }else if(foodName == "Instant Noodles Cup"){
            price = 45.75;
        }else if(foodName == "Instant Pasta Cup"){
            price = 55.75;
        }else if(foodName == "Instant Soup Cup"){
            price = 35.75;
        }else if(foodName == "Veg Burger Mini"){
            price = 75.25;
        }else if(foodName == "Chicken Burger Mini"){
            price = 95.25;
        }else if(foodName == "Cheese Slice Pack"){
            price = 120.75;
        }else if(foodName == "Butter Croissant"){
            price = 60.75;
        }else if(foodName == "Chocolate Croissant"){
            price = 70.75;
        }else if(foodName == "Garlic Toast Pack"){
            price = 65.25;
        }else if(foodName == "Veg Nuggets Pack"){
            price = 110.75;
        }else if(foodName == "Chicken Nuggets Pack"){
            price = 150.75;
        }else if(foodName == "Popcorn Chicken Cup"){
            price = 135.75;
        }else if(foodName == "Veg Spring Roll Pack"){
            price = 125.75;
        }else if(foodName == "Chicken Spring Roll Pack"){
            price = 165.75;
        }else if(foodName == "Cheese Nacho Chips"){
            price = 85.25;
        }else if(foodName == "Salted Potato Chips"){
            price = 40.25;
        }else if(foodName == "Masala Peanut Pack"){
            price = 30.75;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price;
    }
	
	//method overloading
	
	public static double search(String foodName, int items){

        double price = 0.00;

        if(foodName == "Veg Sandwich Pack"){
            price = 85.00;
        }else if(foodName == "Chicken Sandwich Pack"){
            price = 125.00;
        }else if(foodName == "Paneer Sandwich Pack"){
            price = 105.00;
        }else if(foodName == "Egg Sandwich Pack"){
            price = 95.00;
        }else if(foodName == "Veg Mayo Sandwich"){
            price = 90.00;
        }else if(foodName == "Chicken Mayo Sandwich"){
            price = 135.00;
        }else if(foodName == "Veg Salad Bowl"){
            price = 110.00;
        }else if(foodName == "Chicken Salad Bowl"){
            price = 165.00;
        }else if(foodName == "Fruit Yogurt Cup"){
            price = 60.00;
        }else if(foodName == "Greek Yogurt Cup"){
            price = 75.00;
        }else if(foodName == "Chocolate Donut"){
            price = 45.00;
        }else if(foodName == "Strawberry Donut"){
            price = 50.00;
        }else if(foodName == "Blueberry Muffin"){
            price = 55.00;
        }else if(foodName == "Chocolate Muffin"){
            price = 58.00;
        }else if(foodName == "Veg Puff"){
            price = 30.00;
        }else if(foodName == "Egg Puff"){
            price = 35.00;
        }else if(foodName == "Chicken Puff"){
            price = 45.50;
        }else if(foodName == "Paneer Puff"){
            price = 40.50;
        }else if(foodName == "Mini Veg Pizza"){
            price = 120.00;
        }else if(foodName == "Mini Chicken Pizza"){
            price = 160.00;
        }else if(foodName == "Cheese Corn Cup"){
            price = 70.00;
        }else if(foodName == "Sweet Corn Cup"){
            price = 65.00;
        }else if(foodName == "Protein Bar Chocolate"){
            price = 99.00;
        }else if(foodName == "Protein Bar Peanut"){
            price = 105.50;
        }else if(foodName == "Energy Drink Can"){
            price = 110.50;
        }else if(foodName == "Cold Coffee Bottle"){
            price = 95.50;
        }else if(foodName == "Iced Tea Lemon"){
            price = 85.50;
        }else if(foodName == "Iced Tea Peach"){
            price = 88.50;
        }else if(foodName == "Fresh Lime Soda"){
            price = 70.50;
        }else if(foodName == "Watermelon Juice Bottle"){
            price = 90.50;
        }else if(foodName == "Apple Juice Bottle"){
            price = 92.50;
        }else if(foodName == "Orange Juice Bottle"){
            price = 94.50;
        }else if(foodName == "Banana Shake Bottle"){
            price = 98.50;
        }else if(foodName == "Cold Brew Coffee"){
            price = 115.50;
        }else if(foodName == "Veg Ready Meal Pack"){
            price = 150.50;
        }else if(foodName == "Chicken Ready Meal Pack"){
            price = 195.50;
        }else if(foodName == "Paneer Ready Meal Pack"){
            price = 175.50;
        }else if(foodName == "Egg Ready Meal Pack"){
            price = 165.50;
        }else if(foodName == "Instant Noodles Cup"){
            price = 45.75;
        }else if(foodName == "Instant Pasta Cup"){
            price = 55.75;
        }else if(foodName == "Instant Soup Cup"){
            price = 35.75;
        }else if(foodName == "Veg Burger Mini"){
            price = 75.25;
        }else if(foodName == "Chicken Burger Mini"){
            price = 95.25;
        }else if(foodName == "Cheese Slice Pack"){
            price = 120.75;
        }else if(foodName == "Butter Croissant"){
            price = 60.75;
        }else if(foodName == "Chocolate Croissant"){
            price = 70.75;
        }else if(foodName == "Garlic Toast Pack"){
            price = 65.25;
        }else if(foodName == "Veg Nuggets Pack"){
            price = 110.75;
        }else if(foodName == "Chicken Nuggets Pack"){
            price = 150.75;
        }else if(foodName == "Popcorn Chicken Cup"){
            price = 135.75;
        }else if(foodName == "Veg Spring Roll Pack"){
            price = 125.75;
        }else if(foodName == "Chicken Spring Roll Pack"){
            price = 165.75;
        }else if(foodName == "Cheese Nacho Chips"){
            price = 85.25;
        }else if(foodName == "Salted Potato Chips"){
            price = 40.25;
        }else if(foodName == "Masala Peanut Pack"){
            price = 30.75;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price*items;
    }
}
