class Laptop {

    int ram;
    int storage;

    double price;
    double weight;

    String brand;
    String processor;
    String color;

    boolean touchscreen;
    boolean gaming;

    char grade;

    long serialNumber;

    float discount;

    Laptop(int ram, int storage){
        this.ram = ram;
        this.storage = storage;
    }

    Laptop(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    Laptop(String brand, String processor, String color){
        this.brand = brand;
        this.processor = processor;
        this.color = color;
    }

    Laptop(boolean touchscreen, boolean gaming){
        this.touchscreen = touchscreen;
        this.gaming = gaming;
    }

    Laptop(char grade){
        this.grade = grade;
    }

    Laptop(long serialNumber){
        this.serialNumber = serialNumber;
    }

    Laptop(float discount){
        this.discount = discount;
    }

}