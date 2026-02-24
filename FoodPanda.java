class FoodPanda {

    public static double search(String foodName){

        double price = 0.00;

        if(foodName == "Paneer Butter Naan Combo"){
            price = 220.00;
        }else if(foodName == "Chicken Butter Naan Combo"){
            price = 260.00;
        }else if(foodName == "Mutton Rogan Combo"){
            price = 320.00;
        }else if(foodName == "Veg Dum Aloo"){
            price = 180.00;
        }else if(foodName == "Chicken Dum Aloo"){
            price = 240.00;
        }else if(foodName == "Paneer Bhurji"){
            price = 190.00;
        }else if(foodName == "Chicken Bhurji"){
            price = 230.00;
        }else if(foodName == "Veg Korma"){
            price = 210.00;
        }else if(foodName == "Chicken Korma"){
            price = 270.00;
        }else if(foodName == "Mutton Korma"){
            price = 340.00;
        }else if(foodName == "Veg Malai Kofta"){
            price = 200.00;
        }else if(foodName == "Chicken Malai Tikka"){
            price = 280.00;
        }else if(foodName == "Paneer Angara"){
            price = 215.00;
        }else if(foodName == "Chicken Angara"){
            price = 295.00;
        }else if(foodName == "Veg Achari Curry"){
            price = 195.00;
        }else if(foodName == "Chicken Achari Curry"){
            price = 275.00;
        }else if(foodName == "Mutton Achari Curry"){
            price = 355.00;
        }else if(foodName == "Veg Handi"){
            price = 205.00;
        }else if(foodName == "Chicken Handi Special"){
            price = 285.00;
        }else if(foodName == "Mutton Handi Special"){
            price = 365.00;
        }else if(foodName == "Veg Peshawari"){
            price = 225.00;
        }else if(foodName == "Chicken Peshawari"){
            price = 305.00;
        }else if(foodName == "Paneer Tawa Masala"){
            price = 230.00;
        }else if(foodName == "Chicken Tawa Masala"){
            price = 310.00;
        }else if(foodName == "Mutton Tawa Masala"){
            price = 380.00;
        }else if(foodName == "Veg Jalfrezi"){
            price = 210.50;
        }else if(foodName == "Chicken Jalfrezi"){
            price = 295.50;
        }else if(foodName == "Paneer Do Pyaza"){
            price = 205.50;
        }else if(foodName == "Chicken Do Pyaza"){
            price = 285.50;
        }else if(foodName == "Mutton Do Pyaza"){
            price = 365.50;
        }else if(foodName == "Veg Baked Lasooni"){
            price = 215.50;
        }else if(foodName == "Chicken Lasooni"){
            price = 305.50;
        }else if(foodName == "Paneer Lababdar Special"){
            price = 240.50;
        }else if(foodName == "Chicken Lababdar Special"){
            price = 330.50;
        }else if(foodName == "Mutton Lababdar Special"){
            price = 410.50;
        }else if(foodName == "Veg Tandoori Platter"){
            price = 260.50;
        }else if(foodName == "Chicken Tandoori Platter"){
            price = 340.50;
        }else if(foodName == "Mutton Tandoori Platter"){
            price = 420.50;
        }else if(foodName == "Veg Seekh Kebab"){
            price = 180.50;
        }else if(foodName == "Chicken Seekh Kebab"){
            price = 260.75;
        }else if(foodName == "Mutton Seekh Kebab"){
            price = 345.75;
        }else if(foodName == "Veg Biryani Special"){
            price = 225.75;
        }else if(foodName == "Chicken Biryani Special"){
            price = 305.75;
        }else if(foodName == "Mutton Biryani Special"){
            price = 385.75;
        }else if(foodName == "Veg Fried Rice Special"){
            price = 195.75;
        }else if(foodName == "Chicken Fried Rice Special"){
            price = 275.75;
        }else if(foodName == "Mutton Fried Rice Special"){
            price = 355.75;
        }else if(foodName == "Veg Noodles Special"){
            price = 185.75;
        }else if(foodName == "Chicken Noodles Special"){
            price = 265.75;
        }else if(foodName == "Mutton Noodles Special"){
            price = 345.95;
        }else if(foodName == "Veg Manchurian Special"){
            price = 175.95;
        }else if(foodName == "Chicken Manchurian Special"){
            price = 255.95;
        }else if(foodName == "Paneer Manchurian Special"){
            price = 205.95;
        }else if(foodName == "Dragon Paneer Special"){
            price = 245.95;
        }else {
			System.out.println("The food is not Available...!");
		}


        return price;
    }
	
	//Method overloading
	
	public static double search(String foodName,int items){

        double price = 0.00;

        if(foodName == "Paneer Butter Naan Combo"){
            price = 220.00;
        }else if(foodName == "Chicken Butter Naan Combo"){
            price = 260.00;
        }else if(foodName == "Mutton Rogan Combo"){
            price = 320.00;
        }else if(foodName == "Veg Dum Aloo"){
            price = 180.00;
        }else if(foodName == "Chicken Dum Aloo"){
            price = 240.00;
        }else if(foodName == "Paneer Bhurji"){
            price = 190.00;
        }else if(foodName == "Chicken Bhurji"){
            price = 230.00;
        }else if(foodName == "Veg Korma"){
            price = 210.00;
        }else if(foodName == "Chicken Korma"){
            price = 270.00;
        }else if(foodName == "Mutton Korma"){
            price = 340.00;
        }else if(foodName == "Veg Malai Kofta"){
            price = 200.00;
        }else if(foodName == "Chicken Malai Tikka"){
            price = 280.00;
        }else if(foodName == "Paneer Angara"){
            price = 215.00;
        }else if(foodName == "Chicken Angara"){
            price = 295.00;
        }else if(foodName == "Veg Achari Curry"){
            price = 195.00;
        }else if(foodName == "Chicken Achari Curry"){
            price = 275.00;
        }else if(foodName == "Mutton Achari Curry"){
            price = 355.00;
        }else if(foodName == "Veg Handi"){
            price = 205.00;
        }else if(foodName == "Chicken Handi Special"){
            price = 285.00;
        }else if(foodName == "Mutton Handi Special"){
            price = 365.00;
        }else if(foodName == "Veg Peshawari"){
            price = 225.00;
        }else if(foodName == "Chicken Peshawari"){
            price = 305.00;
        }else if(foodName == "Paneer Tawa Masala"){
            price = 230.00;
        }else if(foodName == "Chicken Tawa Masala"){
            price = 310.00;
        }else if(foodName == "Mutton Tawa Masala"){
            price = 380.00;
        }else if(foodName == "Veg Jalfrezi"){
            price = 210.50;
        }else if(foodName == "Chicken Jalfrezi"){
            price = 295.50;
        }else if(foodName == "Paneer Do Pyaza"){
            price = 205.50;
        }else if(foodName == "Chicken Do Pyaza"){
            price = 285.50;
        }else if(foodName == "Mutton Do Pyaza"){
            price = 365.50;
        }else if(foodName == "Veg Baked Lasooni"){
            price = 215.50;
        }else if(foodName == "Chicken Lasooni"){
            price = 305.50;
        }else if(foodName == "Paneer Lababdar Special"){
            price = 240.50;
        }else if(foodName == "Chicken Lababdar Special"){
            price = 330.50;
        }else if(foodName == "Mutton Lababdar Special"){
            price = 410.50;
        }else if(foodName == "Veg Tandoori Platter"){
            price = 260.50;
        }else if(foodName == "Chicken Tandoori Platter"){
            price = 340.50;
        }else if(foodName == "Mutton Tandoori Platter"){
            price = 420.50;
        }else if(foodName == "Veg Seekh Kebab"){
            price = 180.50;
        }else if(foodName == "Chicken Seekh Kebab"){
            price = 260.75;
        }else if(foodName == "Mutton Seekh Kebab"){
            price = 345.75;
        }else if(foodName == "Veg Biryani Special"){
            price = 225.75;
        }else if(foodName == "Chicken Biryani Special"){
            price = 305.75;
        }else if(foodName == "Mutton Biryani Special"){
            price = 385.75;
        }else if(foodName == "Veg Fried Rice Special"){
            price = 195.75;
        }else if(foodName == "Chicken Fried Rice Special"){
            price = 275.75;
        }else if(foodName == "Mutton Fried Rice Special"){
            price = 355.75;
        }else if(foodName == "Veg Noodles Special"){
            price = 185.75;
        }else if(foodName == "Chicken Noodles Special"){
            price = 265.75;
        }else if(foodName == "Mutton Noodles Special"){
            price = 345.95;
        }else if(foodName == "Veg Manchurian Special"){
            price = 175.95;
        }else if(foodName == "Chicken Manchurian Special"){
            price = 255.95;
        }else if(foodName == "Paneer Manchurian Special"){
            price = 205.95;
        }else if(foodName == "Dragon Paneer Special"){
            price = 245.95;
        }else {
			System.out.println("The food is not Available...!");
		}


        return price*items;
    }
}
