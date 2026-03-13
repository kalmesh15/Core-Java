class Jacket {

    String brand;
    String material;
    String color;
    String size;
    double price;
    double weight;
    boolean waterproof;
    boolean hoodAvailable;
    String sleeveType;
    String closureType;
    String manufacturer;
    int productionYear;
    String countryOfOrigin;
    String insulationType;
    double length;
    boolean windproof;
    String style;
    int rating;
    String packageType;
    boolean limitedEdition;
    double discountPercent;
    String collectionName;
    String seasonType;
    int warrantyMonths;
    String targetGender;

    Jacket() {

    }

    Jacket(String brand, String material, String color, String size, double price, double weight, boolean waterproof, boolean hoodAvailable, String sleeveType, String closureType, String manufacturer, int productionYear, String countryOfOrigin, String insulationType, double length, boolean windproof, String style, int rating, String packageType, boolean limitedEdition, double discountPercent, String collectionName, String seasonType, int warrantyMonths, String targetGender) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.size = size;
        this.price = price;
        this.weight = weight;
        this.waterproof = waterproof;
        this.hoodAvailable = hoodAvailable;
        this.sleeveType = sleeveType;
        this.closureType = closureType;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.insulationType = insulationType;
        this.length = length;
        this.windproof = windproof;
        this.style = style;
        this.rating = rating;
        this.packageType = packageType;
        this.limitedEdition = limitedEdition;
        this.discountPercent = discountPercent;
        this.collectionName = collectionName;
        this.seasonType = seasonType;
        this.warrantyMonths = warrantyMonths;
        this.targetGender = targetGender;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Hood Available: " + hoodAvailable);
        System.out.println("Sleeve Type: " + sleeveType);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Insulation Type: " + insulationType);
        System.out.println("Length: " + length);
        System.out.println("Windproof: " + windproof);
        System.out.println("Style: " + style);
        System.out.println("Rating: " + rating);
        System.out.println("Package Type: " + packageType);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Collection Name: " + collectionName);
        System.out.println("Season Type: " + seasonType);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Target Gender: " + targetGender);
    }
}