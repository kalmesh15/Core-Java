class RestaurantExecutor {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant(401,120);
        System.out.println("The restaurant id is " + r1.restaurantId);
        System.out.println("The seating capacity is " + r1.seatingCapacity);

        Restaurant r2 = new Restaurant(350.5,4.3);
        System.out.println("The average meal price is " + r2.averageMealPrice);
        System.out.println("The restaurant rating is " + r2.ratingScore);

        Restaurant r3 = new Restaurant("Empire Restaurant","Indian","Bangalore");
        System.out.println("The restaurant name is " + r3.restaurantName);
        System.out.println("The cuisine type is " + r3.cuisineType);
        System.out.println("The restaurant city is " + r3.city);

        Restaurant r4 = new Restaurant(true,true);
        System.out.println("The restaurant home delivery availability is " + r4.homeDelivery);
        System.out.println("The takeaway availability is " + r4.takeawayAvailable);

        Restaurant r5 = new Restaurant('A');
        System.out.println("The restaurant category is " + r5.restaurantCategory);

        Restaurant r6 = new Restaurant(12345678901L);
        System.out.println("The restaurant license number is " + r6.licenseNumber);

        Restaurant r7 = new Restaurant(5.5f);
        System.out.println("The restaurant service charge is " + r7.serviceCharge);

    }
}