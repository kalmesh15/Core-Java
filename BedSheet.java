class BedSheet {

    int productId;
    String brandName;
    String materialType;
    String color;
    double price;
    int quantity;
    String size;
    String pattern;
    String manufacturer;
    String countryOfOrigin;
    boolean isCotton;
    boolean isWashable;
    int threadCount;
    String designType;
    String packagingType;
    String availabilityStatus;
    String usageType;
    double weight;
    String warranty;
    String storageInstructions;

    public BedSheet() {
        this(1, "HomeStyle", "Cotton", "Blue", 800.0, 10, "Queen", "Floral", "HomeStyle Pvt Ltd", "India", true, true, 300, "Modern", "Cover", "Available", "Bedroom", 1.5, "1 Year", "Fold and keep dry");
    }

    public BedSheet(int productId, String brandName, String materialType, String color, double price, int quantity, String size, String pattern, String manufacturer, String countryOfOrigin, boolean isCotton, boolean isWashable, int threadCount, String designType, String packagingType, String availabilityStatus, String usageType, double weight, String warranty, String storageInstructions) {

        this.productId = productId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.pattern = pattern;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isCotton = isCotton;
        this.isWashable = isWashable;
        this.threadCount = threadCount;
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
        System.out.println("Size: " + size);
        System.out.println("Pattern: " + pattern);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Cotton: " + isCotton);
        System.out.println("Is Washable: " + isWashable);
        System.out.println("Thread Count: " + threadCount);
        System.out.println("Design Type: " + designType);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}