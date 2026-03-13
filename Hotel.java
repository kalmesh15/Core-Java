class Hotel {

    int hotelId;
    int totalRooms;

    double roomPrice;
    double ratingScore;

    String hotelName;
    String city;
    String managerName;

    boolean wifiAvailable;
    boolean swimmingPool;

    char hotelGrade;

    long licenseNumber;

    float serviceCharge;

    Hotel(int hotelId, int totalRooms){
        this.hotelId = hotelId;
        this.totalRooms = totalRooms;
    }

    Hotel(double roomPrice, double ratingScore){
        this.roomPrice = roomPrice;
        this.ratingScore = ratingScore;
    }

    Hotel(String hotelName, String city, String managerName){
        this.hotelName = hotelName;
        this.city = city;
        this.managerName = managerName;
    }

    Hotel(boolean wifiAvailable, boolean swimmingPool){
        this.wifiAvailable = wifiAvailable;
        this.swimmingPool = swimmingPool;
    }

    Hotel(char hotelGrade){
        this.hotelGrade = hotelGrade;
    }

    Hotel(long licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    Hotel(float serviceCharge){
        this.serviceCharge = serviceCharge;
    }

}