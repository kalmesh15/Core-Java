class TheoBroma {

    int bakeryId;
    String bakeryName;
    String productName;
    String category;
    double price;
    int quantity;
    String orderDate;
    String deliveryDate;
    String flavor;
    String size;
    String manufacturer;
    String countryOfOrigin;
    String packagingType;
    String deliveryType;
    double rating;
    boolean isEggless;
    boolean isAvailable;
    double weight;
    String targetAudience;
    String storageInstructions;

    public TheoBroma() {
        this(1, "TheoBroma", "Chocolate Cake", "Cake", 800.0, 1, "10-04-2026", "11-04-2026", "Chocolate", "1kg", "TheoBroma Bakery", "India", "Box", "Online Delivery", 4.8, true, true, 1.0, "All Age Groups", "Refrigerate after delivery");
    }

    public TheoBroma(int bakeryId, String bakeryName, String productName, String category, double price, int quantity, String orderDate, String deliveryDate, String flavor, String size, String manufacturer, String countryOfOrigin, String packagingType, String deliveryType, double rating, boolean isEggless, boolean isAvailable, double weight, String targetAudience, String storageInstructions) {

        this.bakeryId = bakeryId;
        this.bakeryName = bakeryName;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.flavor = flavor;
        this.size = size;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.deliveryType = deliveryType;
        this.rating = rating;
        this.isEggless = isEggless;
        this.isAvailable = isAvailable;
        this.weight = weight;
        this.targetAudience = targetAudience;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Bakery ID: " + bakeryId);
        System.out.println("Bakery Name: " + bakeryName);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Flavor: " + flavor);
        System.out.println("Size: " + size);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Delivery Type: " + deliveryType);
        System.out.println("Rating: " + rating);
        System.out.println("Is Eggless: " + isEggless);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Weight (kg): " + weight);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}