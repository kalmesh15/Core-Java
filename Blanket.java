class Blanket {

    String brand;
    String material;
    String color;
    double length;
    double width;
    double weight;
    String sizeType;
    boolean washable;
    boolean electric;
    String pattern;
    String seasonType;
    String manufacturer;
    int manufacturingYear;
    String countryOfOrigin;
    int rating;
    double price;
    double discountPercent;
    boolean limitedEdition;
    String packagingType;
    String softnessLevel;
    boolean hypoallergenic;
    String usageType;
    int warrantyMonths;
    String targetUser;
    String fabricType;

    Blanket() {

    }

    Blanket(String brand, String material, String color, double length, double width, double weight, String sizeType, boolean washable, boolean electric, String pattern, String seasonType, String manufacturer, int manufacturingYear, String countryOfOrigin, int rating, double price, double discountPercent, boolean limitedEdition, String packagingType, String softnessLevel, boolean hypoallergenic, String usageType, int warrantyMonths, String targetUser, String fabricType) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.sizeType = sizeType;
        this.washable = washable;
        this.electric = electric;
        this.pattern = pattern;
        this.seasonType = seasonType;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = rating;
        this.price = price;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.packagingType = packagingType;
        this.softnessLevel = softnessLevel;
        this.hypoallergenic = hypoallergenic;
        this.usageType = usageType;
        this.warrantyMonths = warrantyMonths;
        this.targetUser = targetUser;
        this.fabricType = fabricType;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Size Type: " + sizeType);
        System.out.println("Washable: " + washable);
        System.out.println("Electric: " + electric);
        System.out.println("Pattern: " + pattern);
        System.out.println("Season Type: " + seasonType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Softness Level: " + softnessLevel);
        System.out.println("Hypoallergenic: " + hypoallergenic);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Target User: " + targetUser);
        System.out.println("Fabric Type: " + fabricType);
    }
}