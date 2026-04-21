class Sunscream {

    int productId;
    String productName;
    String brandName;
    String skinType;
    double price;
    int quantity;
    String manufacturingDate;
    String expiryDate;
    int spfLevel;
    String texture;
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    String usageType;
    double rating;
    boolean isWaterResistant;
    boolean isDermatologicallyTested;
    double volume;
    String targetAudience;
    String storageInstructions;

    public Sunscream() {
        this(1, "Sunscreen SPF50", "Nivea", "All Skin", 350.0, 25, "01-01-2024", "01-01-2027", 50, "Cream", "Nivea India", "India", "Tube", "External", 4.7, true, true, 100.0, "Men & Women", "Keep away from heat");
    }

    public Sunscream(int productId, String productName, String brandName, String skinType, double price, int quantity, String manufacturingDate, String expiryDate, int spfLevel, String texture, String manufacturer, String countryOfOrigin, String packagingType, String usageType, double rating, boolean isWaterResistant, boolean isDermatologicallyTested, double volume, String targetAudience, String storageInstructions) {

        this.productId = productId;
        this.productName = productName;
        this.brandName = brandName;
        this.skinType = skinType;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.spfLevel = spfLevel;
        this.texture = texture;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.usageType = usageType;
        this.rating = rating;
        this.isWaterResistant = isWaterResistant;
        this.isDermatologicallyTested = isDermatologicallyTested;
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
        System.out.println("SPF Level: " + spfLevel);
        System.out.println("Texture: " + texture);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Rating: " + rating);
        System.out.println("Is Water Resistant: " + isWaterResistant);
        System.out.println("Dermatologically Tested: " + isDermatologicallyTested);
        System.out.println("Volume: " + volume);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}