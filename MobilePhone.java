class MobilePhone {

    int id;
    int storage;

    double price;
    double screenSize;

    String brand;
    String model;
    String color;

    boolean dualSim;
    boolean supports5G;

    char grade;

    long imeiNumber;

    float batteryCapacity;

    MobilePhone(int id, int storage){
        this.id = id;
        this.storage = storage;
    }

    MobilePhone(double price, double screenSize){
        this.price = price;
        this.screenSize = screenSize;
    }

    MobilePhone(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    MobilePhone(boolean dualSim, boolean supports5G){
        this.dualSim = dualSim;
        this.supports5G = supports5G;
    }

    MobilePhone(char grade){
        this.grade = grade;
    }

    MobilePhone(long imeiNumber){
        this.imeiNumber = imeiNumber;
    }

    MobilePhone(float batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }

}