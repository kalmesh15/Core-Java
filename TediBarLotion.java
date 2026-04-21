class TediBarLotion {

    int productId;
    String productName;
    String brandName;
    String skinType;
    double price;
    int quantity;
    String manufacturingDate;
    String expiryDate;
    String fragrance;
    String texture;
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    String usageType;
    double rating;
    boolean isDermatologicallyTested;
    boolean isAvailable;
    double volume;
    String targetAudience;
    String storageInstructions;

    public TediBarLotion() {
        this(2, "TediBar Lotion", "Curatio", "Sensitive", 250.0, 30, "01-02-2024", "01-02-2027", "Mild", "Smooth", "Curatio Healthcare", "India", "Bottle", "External", 4.6, true, true, 200.0, "Babies", "Keep away from heat");
    }

    public TediBarLotion(int productId, String productName, String brandName, String skinType, double price, int quantity, String manufacturingDate, String expiryDate, String fragrance, String texture, String manufacturer, String countryOfOrigin, String packagingType, String usageType, double rating, boolean isDermatologicallyTested, boolean isAvailable, double volume, String targetAudience, String storageInstructions) {

        this.productId = productId;
        this.productName = productName;
        this.brandName = brandName;
        this.skinType = skinType;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.fragrance = fragrance;
        this.texture = texture;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.usageType = usageType;
        this.rating = rating;
        this.isDermatologicallyTested = isDermatologicallyTested;
        this.isAvailable = isAvailable;
        this.volume = volume;
        this.targetAudience = targetAudience;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Texture: " + texture);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Rating: " + rating);
        System.out.println("Dermatologically Tested: " + isDermatologicallyTested);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Volume: " + volume);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}