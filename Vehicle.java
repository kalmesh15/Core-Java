class Vehicle {

    int id;
    int seatingCapacity;

    double price;
    double mileage;

    String brand;
    String model;
    String fuelType;

    boolean automatic;
    boolean electric;

    char category;

    long registrationNumber;

    float engineCapacity;

    Vehicle(int id, int seatingCapacity){
        this.id = id;
        this.seatingCapacity = seatingCapacity;
    }

    Vehicle(double price, double mileage){
        this.price = price;
        this.mileage = mileage;
    }

    Vehicle(String brand, String model, String fuelType){
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    Vehicle(boolean automatic, boolean electric){
        this.automatic = automatic;
        this.electric = electric;
    }

    Vehicle(char category){
        this.category = category;
    }

    Vehicle(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    Vehicle(float engineCapacity){
        this.engineCapacity = engineCapacity;
    }

}