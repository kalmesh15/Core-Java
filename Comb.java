class Comb {

    int combId;
    String brandName;
    String materialType;
    String color;
    double price;
    int quantity;
    String size;
    String toothType;
    String manufacturer;
    String countryOfOrigin;
    boolean isAntiStatic;
    boolean isPocketFriendly;
    int durabilityRating;
    String designType;
    String packagingType;
    String availabilityStatus;
    String usageType;
    double weight;
    String warranty;
    String storageInstructions;

    public Comb() {
        this(1, "Vega", "Plastic", "Black", 50.0, 100, "Medium", "Fine", "Vega Industries", "India", true, true, 4, "Classic", "Cover", "Available", "Hair Styling", 0.1, "3 Months", "Keep clean");
    }

    public Comb(int combId, String brandName, String materialType, String color, double price, int quantity, String size, String toothType, String manufacturer, String countryOfOrigin, boolean isAntiStatic, boolean isPocketFriendly, int durabilityRating, String designType, String packagingType, String availabilityStatus, String usageType, double weight, String warranty, String storageInstructions) {

        this.combId = combId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.toothType = toothType;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isAntiStatic = isAntiStatic;
        this.isPocketFriendly = isPocketFriendly;
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

        System.out.println("Comb ID: " + combId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Material Type: " + materialType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Size: " + size);
        System.out.println("Tooth Type: " + toothType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Anti Static: " + isAntiStatic);
        System.out.println("Is Pocket Friendly: " + isPocketFriendly);
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