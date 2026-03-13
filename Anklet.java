class Anklet {

    String brand;
    String material;
    String color;
    double length;
    double price;
    int quantity;
    double weight;
    boolean adjustable;
    String designStyle;
    String countryOfOrigin;
    int warrantyMonths;
    String pattern;
    boolean handmade;
    double thickness;
    int popularityRank;
    String finishType;
    boolean waterproof;
    String packageType;
    int rating;
    String targetAudience;
    double discountPercent;
    boolean limitedEdition;
    String collectionName;
    int yearOfManufacture;
    String manufacturer;

    // Default constructor
    Anklet() {

    }

    // Parameterized constructor
    Anklet(String brand, String material, String color, double length, double price, int quantity, double weight, boolean adjustable, String designStyle, String countryOfOrigin, int warrantyMonths, String pattern, boolean handmade, double thickness, int popularityRank, String finishType, boolean waterproof, String packageType, int rating, String targetAudience, double discountPercent, boolean limitedEdition, String collectionName, int yearOfManufacture, String manufacturer) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.adjustable = adjustable;
        this.designStyle = designStyle;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyMonths = warrantyMonths;
        this.pattern = pattern;
        this.handmade = handmade;
        this.thickness = thickness;
        this.popularityRank = popularityRank;
        this.finishType = finishType;
        this.waterproof = waterproof;
        this.packageType = packageType;
        this.rating = rating;
        this.targetAudience = targetAudience;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.collectionName = collectionName;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
    }

     void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Design Style: " + designStyle);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Pattern: " + pattern);
        System.out.println("Handmade: " + handmade);
        System.out.println("Thickness: " + thickness);
        System.out.println("Popularity Rank: " + popularityRank);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Package Type: " + packageType);
        System.out.println("Rating: " + rating);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Collection Name: " + collectionName);
        System.out.println("Year Of Manufacture: " + yearOfManufacture);
        System.out.println("Manufacturer: " + manufacturer);
    }
}