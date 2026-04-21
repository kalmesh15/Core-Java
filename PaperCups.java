class PaperCups {

    int productId;
    String brandName;
    String materialType;
    String color;
    double price;
    int quantity;
    int capacity;
    String shape;
    String manufacturer;
    String countryOfOrigin;
    boolean isDisposable;
    boolean isEcoFriendly;
    int durabilityRating;
    String designType;
    String packagingType;
    String availabilityStatus;
    String usageType;
    double weight;
    String warranty;
    String storageInstructions;

    public PaperCups() {
        this(1, "EcoServe", "Paper", "White", 200.0, 100, 200, "Round", "EcoServe Pvt Ltd", "India", true, true, 3, "Plain", "Packet", "Available", "Party", 0.5, "No Warranty", "Keep in dry place");
    }

    public PaperCups(int productId, String brandName, String materialType, String color, double price, int quantity, int capacity, String shape, String manufacturer, String countryOfOrigin, boolean isDisposable, boolean isEcoFriendly, int durabilityRating, String designType, String packagingType, String availabilityStatus, String usageType, double weight, String warranty, String storageInstructions) {

        this.productId = productId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.capacity = capacity;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isDisposable = isDisposable;
        this.isEcoFriendly = isEcoFriendly;
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
        System.out.println("Capacity (ml): " + capacity);
        System.out.println("Shape: " + shape);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Disposable: " + isDisposable);
        System.out.println("Is Eco Friendly: " + isEcoFriendly);
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