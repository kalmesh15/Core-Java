class ZanduBalm {

    int productId;
    String productName;
    String brandName;
    String category;
    double price;
    int quantity;
    String manufacturingDate;
    String expiryDate;
    String color;
    String fragrance;
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    String usageType;
    double rating;
    boolean isHerbal;
    boolean isAvailable;
    double weight;
    String targetAudience;
    String storageInstructions;

    public ZanduBalm() {
        this(1, "Zandu Balm", "Zandu", "Pain Relief", 120.0, 50, "01-01-2024", "01-01-2027", "Brown", "Strong", "Zandu Pharma", "India", "Bottle", "External", 4.5, true, true, 25.0, "Adults", "Store in cool place");
    }

    public ZanduBalm(int productId, String productName, String brandName, String category, double price, int quantity, String manufacturingDate, String expiryDate, String color, String fragrance, String manufacturer, String countryOfOrigin, String packagingType, String usageType, double rating, boolean isHerbal, boolean isAvailable, double weight, String targetAudience, String storageInstructions) {

        this.productId = productId;
        this.productName = productName;
        this.brandName = brandName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.color = color;
        this.fragrance = fragrance;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.usageType = usageType;
        this.rating = rating;
        this.isHerbal = isHerbal;
        this.isAvailable = isAvailable;
        this.weight = weight;
        this.targetAudience = targetAudience;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Color: " + color);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Rating: " + rating);
        System.out.println("Is Herbal: " + isHerbal);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Weight: " + weight);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}