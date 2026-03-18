class SoapHolder {

    int holderId;
    String brandName;
    String materialType;
    String color;
    double price;
    int quantity;
    String shape;
    String size;
    String manufacturer;
    String countryOfOrigin;
    boolean isWallMounted;
    boolean isWaterResistant;
    int durabilityRating;
    String designType;
    String packagingType;
    String availabilityStatus;
    String usageType;
    double weight;
    String warranty;
    String storageInstructions;

    public SoapHolder() {
        this(1, "HomeEssentials", "Plastic", "White", 150.0, 20, "Rectangle", "Medium", "HomeEssentials Ltd", "India", true, true, 4, "Modern", "Box", "Available", "Bathroom", 0.5, "6 Months", "Keep dry");
    }

    public SoapHolder(int holderId, String brandName, String materialType, String color, double price, int quantity, String shape, String size, String manufacturer, String countryOfOrigin, boolean isWallMounted, boolean isWaterResistant, int durabilityRating, String designType, String packagingType, String availabilityStatus, String usageType, double weight, String warranty, String storageInstructions) {

        this.holderId = holderId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.shape = shape;
        this.size = size;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isWallMounted = isWallMounted;
        this.isWaterResistant = isWaterResistant;
        this.durabilityRating = durabilityRating;
        this.designType = designType;
        this.packagingType = packagingType;
        this.availabilityStatus = availabilityStatus;
        this.usageType = usageType;
        this.weight = weight;
        this.warranty = warranty;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Holder ID: " + holderId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Material Type: " + materialType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Wall Mounted: " + isWallMounted);
        System.out.println("Is Water Resistant: " + isWaterResistant);
        System.out.println("Durability Rating: " + durabilityRating);
        System.out.println("Design Type: " + designType);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}