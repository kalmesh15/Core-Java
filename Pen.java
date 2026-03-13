class Pen {

    int id;
    int inkLevel;

    double price;
    double length;

    String brand;
    String color;
    String type;

    boolean refillable;
    boolean waterproof;

    char grade;

    long serialNumber;

    float discount;

    Pen(int id, int inkLevel){
        this.id = id;
        this.inkLevel = inkLevel;
    }

    Pen(double price, double length){
        this.price = price;
        this.length = length;
    }

    Pen(String brand, String color, String type){
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    Pen(boolean refillable, boolean waterproof){
        this.refillable = refillable;
        this.waterproof = waterproof;
    }

    Pen(char grade){
        this.grade = grade;
    }

    Pen(long serialNumber){
        this.serialNumber = serialNumber;
    }

    Pen(float discount){
        this.discount = discount;
    }

}