class Apartment {

    int apartmentId;
    int totalFlats;

    double rentPrice;
    double areaSize;

    String apartmentName;
    String location;
    String ownerName;

    boolean liftAvailable;
    boolean parkingAvailable;

    char apartmentGrade;

    long registrationNumber;

    float maintenanceCharge;

    Apartment(int apartmentId, int totalFlats){
        this.apartmentId = apartmentId;
        this.totalFlats = totalFlats;
    }

    Apartment(double rentPrice, double areaSize){
        this.rentPrice = rentPrice;
        this.areaSize = areaSize;
    }

    Apartment(String apartmentName, String location, String ownerName){
        this.apartmentName = apartmentName;
        this.location = location;
        this.ownerName = ownerName;
    }

    Apartment(boolean liftAvailable, boolean parkingAvailable){
        this.liftAvailable = liftAvailable;
        this.parkingAvailable = parkingAvailable;
    }

    Apartment(char apartmentGrade){
        this.apartmentGrade = apartmentGrade;
    }

    Apartment(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    Apartment(float maintenanceCharge){
        this.maintenanceCharge = maintenanceCharge;
    }

}