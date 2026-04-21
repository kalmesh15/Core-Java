class LionDates {

    int productId;
    String brandName;
    String productType;
    String qualityGrade;
    double price;
    int quantity;
    String packagingDate;
    String expiryDate;
    String color;
    String taste;
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    String usageType;
    double rating;
    boolean isSeedless;
    boolean isOrganic;
    double weight;
    String targetAudience;
    String storageInstructions;

    public LionDates() {
        this(1, "Lion Dates", "Dry Fruit", "Premium", 450.0, 5, "01-01-2024", "01-01-2026", "Brown", "Sweet", "Lion Dates Impex", "UAE", "Box", "Eating", 4.7, true, true, 1.0, "All Age Groups", "Store in cool dry place");
    }

    public LionDates(int productId, String brandName, String productType, String qualityGrade, double price, int quantity, String packagingDate, String expiryDate, String color, String taste, String manufacturer, String countryOfOrigin, String packagingType, String usageType, double rating, boolean isSeedless, boolean isOrganic, double weight, String targetAudience, String storageInstructions) {

        this.productId = productId;
        this.brandName = brandName;
        this.productType = productType;
        this.qualityGrade = qualityGrade;
        this.price = price;
        this.quantity = quantity;
        this.packagingDate = packagingDate;
        this.expiryDate = expiryDate;
        this.color = color;
        this.taste = taste;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.usageType = usageType;
        this.rating = rating;
        this.isSeedless = isSeedless;
        this.isOrganic = isOrganic;
        this.weight = weight;
        this.targetAudience = targetAudience;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Product ID: " + productId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Product Type: " + productType);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packaging Date: " + packagingDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Rating: " + rating);
        System.out.println("Is Seedless: " + isSeedless);
        System.out.println("Is Organic: " + isOrganic);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}