class Restaurant {

    int restaurantId;
    int seatingCapacity;

    double averageMealPrice;
    double ratingScore;

    String restaurantName;
    String cuisineType;
    String city;

    boolean homeDelivery;
    boolean takeawayAvailable;

    char restaurantCategory;

    long licenseNumber;

    float serviceCharge;

    Restaurant(int restaurantId, int seatingCapacity){
        this.restaurantId = restaurantId;
        this.seatingCapacity = seatingCapacity;
    }

    Restaurant(double averageMealPrice, double ratingScore){
        this.averageMealPrice = averageMealPrice;
        this.ratingScore = ratingScore;
    }

    Restaurant(String restaurantName, String cuisineType, String city){
        this.restaurantName = restaurantName;
        this.cuisineType = cuisineType;
        this.city = city;
    }

    Restaurant(boolean homeDelivery, boolean takeawayAvailable){
        this.homeDelivery = homeDelivery;
        this.takeawayAvailable = takeawayAvailable;
    }

    Restaurant(char restaurantCategory){
        this.restaurantCategory = restaurantCategory;
    }

    Restaurant(long licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    Restaurant(float serviceCharge){
        this.serviceCharge = serviceCharge;
    }

}