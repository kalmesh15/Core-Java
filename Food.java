class Food{

    static String name;
    static String type;
    static String cuisine;
    static String price;
    static String calories;

    public static boolean createFood(String n, String t, String c, String p, String cal){

        boolean isCreateFood = false;

        boolean isNameValid = false;
        boolean isTypeValid = false;
        boolean isCuisineValid = false;
        boolean isPriceValid = false;
        boolean isCaloriesValid = false;

        if(n != null && !n.isEmpty()){
            System.out.println("Food name is valid....");
            name = n;
            isNameValid = true;
        }else{
            System.out.println("Food name is not valid....");
        }

        if(t != null && !t.isEmpty()){
            System.out.println("Food type is valid....");
            type = t;
            isTypeValid = true;
        }else{
            System.out.println("Food type is not valid....");
        }

        if(c != null && !c.isEmpty()){
            System.out.println("Cuisine is valid....");
            cuisine = c;
            isCuisineValid = true;
        }else{
            System.out.println("Cuisine is not valid....");
        }

        if(p != null && !p.isEmpty()){
            System.out.println("Price is valid....");
            price = p;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(cal != null && !cal.isEmpty()){
            System.out.println("Calories are valid....");
            calories = cal;
            isCaloriesValid = true;
        }else{
            System.out.println("Calories are not valid....");
        }

        if(isNameValid && isTypeValid && isCuisineValid && isPriceValid && isCaloriesValid){
            isCreateFood = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateFood;
    }

    public static void getFoodDetails(){
        System.out.println("......................................................");
        System.out.println("Food details are.....");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
        System.out.println("......................................................");
    }
}