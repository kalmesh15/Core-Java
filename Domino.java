class Domino {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Margherita Pizza"){
            price = 149.00;
        }else if(foodName == "Farmhouse Pizza"){
            price = 259.00;
        }else if(foodName == "Peppy Paneer Pizza"){
            price = 279.00;
        }else if(foodName == "Mexican Green Wave"){
            price = 269.00;
        }else if(foodName == "Deluxe Veggie Pizza"){
            price = 289.00;
        }else if(foodName == "Veg Extravaganza"){
            price = 309.00;
        }else if(foodName == "Chicken Dominator"){
            price = 349.00;
        }else if(foodName == "Pepper Barbecue Chicken"){
            price = 329.00;
        }else if(foodName == "Chicken Sausage Pizza"){
            price = 299.00;
        }else if(foodName == "Chicken Golden Delight"){
            price = 319.00;
        }else if(foodName == "Indi Chicken Tikka"){
            price = 339.00;
        }else if(foodName == "Paneer Makhani Pizza"){
            price = 289.50;
        }else if(foodName == "Cheese Burst Pizza"){
            price = 369.00;
        }else if(foodName == "Double Cheese Margherita"){
            price = 199.00;
        }else if(foodName == "Veggie Paradise"){
            price = 259.50;
        }else if(foodName == "Spicy Triple Tango"){
            price = 359.00;
        }else if(foodName == "Chicken Fiesta"){
            price = 299.50;
        }else if(foodName == "Veg Supreme"){
            price = 279.50;
        }else if(foodName == "Chicken Supreme"){
            price = 329.50;
        }else if(foodName == "Veg Tandoori Pizza"){
            price = 269.50;
        }else if(foodName == "Chicken Tandoori Pizza"){
            price = 349.50;
        }else if(foodName == "Garlic Breadsticks"){
            price = 139.00;
        }else if(foodName == "Stuffed Garlic Bread"){
            price = 169.00;
        }else if(foodName == "Cheese Garlic Bread"){
            price = 159.00;
        }else if(foodName == "Veg Parcel"){
            price = 109.00;
        }else if(foodName == "Chicken Parcel"){
            price = 129.00;
        }else if(foodName == "Zingy Parcel"){
            price = 119.00;
        }else if(foodName == "Taco Mexicana Veg"){
            price = 149.50;
        }else if(foodName == "Taco Mexicana Chicken"){
            price = 179.50;
        }else if(foodName == "Potato Wedges"){
            price = 99.00;
        }else if(foodName == "Peri Peri Wedges"){
            price = 109.50;
        }else if(foodName == "Choco Lava Cake"){
            price = 99.50;
        }else if(foodName == "Butterscotch Mousse Cake"){
            price = 109.75;
        }else if(foodName == "Brownie Fantasy"){
            price = 119.50;
        }else if(foodName == "Red Velvet Lava Cake"){
            price = 129.50;
        }else if(foodName == "Chocolate Milkshake"){
            price = 149.75;
        }else if(foodName == "Strawberry Milkshake"){
            price = 139.75;
        }else if(foodName == "Vanilla Milkshake"){
            price = 129.75;
        }else if(foodName == "Cold Drink 250ml"){
            price = 40.00;
        }else if(foodName == "Cold Drink 500ml"){
            price = 60.00;
        }else if(foodName == "Cold Drink 1L"){
            price = 90.00;
        }else if(foodName == "Orange Juice"){
            price = 110.00;
        }else if(foodName == "Mango Juice"){
            price = 120.00;
        }else if(foodName == "Paneer Stuffed Crust"){
            price = 389.00;
        }else if(foodName == "Chicken Stuffed Crust"){
            price = 409.00;
        }else if(foodName == "Veggie Stuffed Crust"){
            price = 379.00;
        }else if(foodName == "Chicken Wings Spicy"){
            price = 219.00;
        }else if(foodName == "Chicken Wings BBQ"){
            price = 229.00;
        }else if(foodName == "Veg Loaded Pizza"){
            price = 319.50;
        }else if(foodName == "Chicken Loaded Pizza"){
            price = 359.50;
        }else if(foodName == "Cheesy Dip"){
            price = 30.00;
        }else if(foodName == "Jalapeno Dip"){
            price = 35.00;
        }else if(foodName == "Tomato Ketchup"){
            price = 10.00;
        }else if(foodName == "Mayonnaise Dip"){
            price = 25.00;
        }else if(foodName == "Extra Cheese Topping"){
            price = 50.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price;
    }
	
	public static double search(String foodName , int items){

        double price = 0.00;

        if(foodName == "Margherita Pizza"){
            price = 149.00;
        }else if(foodName == "Farmhouse Pizza"){
            price = 259.00;
        }else if(foodName == "Peppy Paneer Pizza"){
            price = 279.00;
        }else if(foodName == "Mexican Green Wave"){
            price = 269.00;
        }else if(foodName == "Deluxe Veggie Pizza"){
            price = 289.00;
        }else if(foodName == "Veg Extravaganza"){
            price = 309.00;
        }else if(foodName == "Chicken Dominator"){
            price = 349.00;
        }else if(foodName == "Pepper Barbecue Chicken"){
            price = 329.00;
        }else if(foodName == "Chicken Sausage Pizza"){
            price = 299.00;
        }else if(foodName == "Chicken Golden Delight"){
            price = 319.00;
        }else if(foodName == "Indi Chicken Tikka"){
            price = 339.00;
        }else if(foodName == "Paneer Makhani Pizza"){
            price = 289.50;
        }else if(foodName == "Cheese Burst Pizza"){
            price = 369.00;
        }else if(foodName == "Double Cheese Margherita"){
            price = 199.00;
        }else if(foodName == "Veggie Paradise"){
            price = 259.50;
        }else if(foodName == "Spicy Triple Tango"){
            price = 359.00;
        }else if(foodName == "Chicken Fiesta"){
            price = 299.50;
        }else if(foodName == "Veg Supreme"){
            price = 279.50;
        }else if(foodName == "Chicken Supreme"){
            price = 329.50;
        }else if(foodName == "Veg Tandoori Pizza"){
            price = 269.50;
        }else if(foodName == "Chicken Tandoori Pizza"){
            price = 349.50;
        }else if(foodName == "Garlic Breadsticks"){
            price = 139.00;
        }else if(foodName == "Stuffed Garlic Bread"){
            price = 169.00;
        }else if(foodName == "Cheese Garlic Bread"){
            price = 159.00;
        }else if(foodName == "Veg Parcel"){
            price = 109.00;
        }else if(foodName == "Chicken Parcel"){
            price = 129.00;
        }else if(foodName == "Zingy Parcel"){
            price = 119.00;
        }else if(foodName == "Taco Mexicana Veg"){
            price = 149.50;
        }else if(foodName == "Taco Mexicana Chicken"){
            price = 179.50;
        }else if(foodName == "Potato Wedges"){
            price = 99.00;
        }else if(foodName == "Peri Peri Wedges"){
            price = 109.50;
        }else if(foodName == "Choco Lava Cake"){
            price = 99.50;
        }else if(foodName == "Butterscotch Mousse Cake"){
            price = 109.75;
        }else if(foodName == "Brownie Fantasy"){
            price = 119.50;
        }else if(foodName == "Red Velvet Lava Cake"){
            price = 129.50;
        }else if(foodName == "Chocolate Milkshake"){
            price = 149.75;
        }else if(foodName == "Strawberry Milkshake"){
            price = 139.75;
        }else if(foodName == "Vanilla Milkshake"){
            price = 129.75;
        }else if(foodName == "Cold Drink 250ml"){
            price = 40.00;
        }else if(foodName == "Cold Drink 500ml"){
            price = 60.00;
        }else if(foodName == "Cold Drink 1L"){
            price = 90.00;
        }else if(foodName == "Orange Juice"){
            price = 110.00;
        }else if(foodName == "Mango Juice"){
            price = 120.00;
        }else if(foodName == "Paneer Stuffed Crust"){
            price = 389.00;
        }else if(foodName == "Chicken Stuffed Crust"){
            price = 409.00;
        }else if(foodName == "Veggie Stuffed Crust"){
            price = 379.00;
        }else if(foodName == "Chicken Wings Spicy"){
            price = 219.00;
        }else if(foodName == "Chicken Wings BBQ"){
            price = 229.00;
        }else if(foodName == "Veg Loaded Pizza"){
            price = 319.50;
        }else if(foodName == "Chicken Loaded Pizza"){
            price = 359.50;
        }else if(foodName == "Cheesy Dip"){
            price = 30.00;
        }else if(foodName == "Jalapeno Dip"){
            price = 35.00;
        }else if(foodName == "Tomato Ketchup"){
            price = 10.00;
        }else if(foodName == "Mayonnaise Dip"){
            price = 25.00;
        }else if(foodName == "Extra Cheese Topping"){
            price = 50.00;
        }else {
			System.out.println("The food is not Available...!");
		}

        return price*items;
    }
}
