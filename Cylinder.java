class Cylinder {

    int cylinderId;
    String brandName;
    String gasType;
    double capacity;
    double weight;
    String color;
    double price;
    String usageType;
    String manufacturer;
    String countryOfOrigin;
    boolean isRefillable;
    boolean isAvailable;
    int safetyRating;
    double pressureLevel;
    String packagingType;
    String availabilityStatus;
    String certification;
    String valveType;
    String warranty;
    String storageInstructions;

    public Cylinder() {
        this(1, "Indane", "LPG", 14.2, 29.5, "Red", 1200.0, "Domestic", "Indian Oil", "India", true, true, 5, 300.0, "Metal Body", "Available", "ISI", "Standard Valve", "5 Years", "Keep in ventilated area");
    }

    public Cylinder(int cylinderId, String brandName, String gasType, double capacity, double weight, String color, double price, String usageType, String manufacturer, String countryOfOrigin, boolean isRefillable, boolean isAvailable, int safetyRating, double pressureLevel, String packagingType, String availabilityStatus, String certification, String valveType, String warranty, String storageInstructions) {

        this.cylinderId = cylinderId;
        this.brandName = brandName;
        this.gasType = gasType;
        this.capacity = capacity;
        this.weight = weight;
        this.color = color;
        this.price = price;
        this.usageType = usageType;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isRefillable = isRefillable;
        this.isAvailable = isAvailable;
        this.safetyRating = safetyRating;
        this.pressureLevel = pressureLevel;
        this.packagingType = packagingType;
        this.availabilityStatus = availabilityStatus;
        this.certification = certification;
        this.valveType = valveType;
        this.warranty = warranty;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Cylinder ID: " + cylinderId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Gas Type: " + gasType);
        System.out.println("Capacity: " + capacity);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Refillable: " + isRefillable);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Safety Rating: " + safetyRating);
        System.out.println("Pressure Level: " + pressureLevel);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("Certification: " + certification);
        System.out.println("Valve Type: " + valveType);
        System.out.println("Warranty: " + warranty);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}