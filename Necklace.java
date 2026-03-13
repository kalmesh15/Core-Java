class Necklace {

    String brand;
    String material;
    String color;
    double length;
    double weight;
    String size;
    String designStyle;
    String claspType;
    boolean adjustable;
    String gemstoneType;
    int gemstoneCount;
    String finishType;
    String manufacturer;
    int manufacturingYear;
    String countryOfOrigin;
    int rating;
    double price;
    double discountPercent;
    boolean limitedEdition;
    String collectionName;
    String packagingType;
    boolean handmade;
    String targetAudience;
    int warrantyMonths;
    String pattern;

    Necklace() {

    }

    Necklace(String brand, String material, String color, double length, double weight, String size, String designStyle, String claspType, boolean adjustable, String gemstoneType, int gemstoneCount, String finishType, String manufacturer, int manufacturingYear, String countryOfOrigin, int rating, double price, double discountPercent, boolean limitedEdition, String collectionName, String packagingType, boolean handmade, String targetAudience, int warrantyMonths, String pattern) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.size = size;
        this.designStyle = designStyle;
        this.claspType = claspType;
        this.adjustable = adjustable;
        this.gemstoneType = gemstoneType;
        this.gemstoneCount = gemstoneCount;
        this.finishType = finishType;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = rating;
        this.price = price;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.collectionName = collectionName;
        this.packagingType = packagingType;
        this.handmade = handmade;
        this.targetAudience = targetAudience;
        this.warrantyMonths = warrantyMonths;
        this.pattern = pattern;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Design Style: " + designStyle);
        System.out.println("Clasp Type: " + claspType);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Gemstone Type: " + gemstoneType);
        System.out.println("Gemstone Count: " + gemstoneCount);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Collection Name: " + collectionName);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Handmade: " + handmade);
        System.out.println("Target Audience: " + targetAudience);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Pattern: " + pattern);
    }
}