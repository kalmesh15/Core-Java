class PlasticPlate {

    int productId;
    String brandName;
    String materialType;
    String color;
    double price;
    int quantity;
    String shape;
    String size;
    String manufacturer;
    String countryOfOrigin;
    boolean isReusable;
    boolean isMicrowaveSafe;
    int durabilityRating;
    String designType;
    String packagingType;
    String availabilityStatus;
    String usageType;
    double weight;
    String warranty;
    String storageInstructions;

    public PlasticPlate() {
        this(1, "ServeWell", "Plastic", "White", 300.0, 50, "Round", "Medium", "ServeWell Ltd", "India", true, true, 4, "Plain", "Packet", "Available", "Dining", 1.0, "6 Months", "Keep clean and dry");
    }

    public PlasticPlate(int productId, String brandName, String materialType, String color, double price, int quantity, String shape, String size, String manufacturer, String countryOfOrigin, boolean isReusable, boolean isMicrowaveSafe, int durabilityRating, String designType, String packagingType, String availabilityStatus, String usageType, double weight, String warranty, String storageInstructions) {

        this.productId = productId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.shape = shape;
        this.size = size;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isReusable = isReusable;
        this.isMicrowaveSafe = isMicrowaveSafe;
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

        System.out.println("Product ID: " + productId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Material Type: " + materialType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Is Microwave Safe: " + isMicrowaveSafe);
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