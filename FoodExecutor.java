class FoodExecutor{
    public static void main(String[] args){

        boolean isCreate;

        isCreate = Food.createFood("Burger","Veg","American","150","500");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood(null,"Veg","American","150","500");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Burger","","American","150","500");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Burger","Veg","","150","500");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Burger","Veg","American","","500");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Burger","Veg","American","150","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("","","","","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood(null,null,null,null,null);
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Pizza","Veg","Italian","300","700");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Biryani","NonVeg","Indian","250","800");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Dosa","Veg","South Indian","80","200");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Idli","Veg","South Indian","50","150");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("","","Italian","","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood(null,"","","",null);
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Pasta","Veg","Italian","200","400");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Noodles","Veg","Chinese","120","350");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("","","","","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Test","Test","Test","Test","Test");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("","","","","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood(null,"Test","Test","Test","Test");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Sandwich","Veg","American","100","300");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Fries","Veg","American","90","250");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("IceCream","Veg","Dessert","120","200");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Cake","Veg","Dessert","300","600");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("","","","","");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Juice","Veg","Beverage","70","120");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Coffee","Veg","Beverage","60","100");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Food.createFood("Tea","Veg","Beverage","30","80");
        if(isCreate){
            Food.getFoodDetails();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}