class Bag {

    int id;
    int capacity;

    double price;
    double weight;

    String brand;
    String color;
    String type;

    boolean waterproof;
    boolean laptopCompatible;

    char sizeGrade;

    long serialNumber;

    float discount;

    Bag(int id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    Bag(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    Bag(String brand, String color, String type){
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    Bag(boolean waterproof, boolean laptopCompatible){
        this.waterproof = waterproof;
        this.laptopCompatible = laptopCompatible;
    }

    Bag(char sizeGrade){
        this.sizeGrade = sizeGrade;
    }

    Bag(long serialNumber){
        this.serialNumber = serialNumber;
    }

    Bag(float discount){
        this.discount = discount;
    }

}