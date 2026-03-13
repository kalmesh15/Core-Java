class ShoeLace {

    String brand;
    String material;
    String color;
    double length;
    double thickness;
    String laceType;
    boolean stretchable;
    boolean waterproof;
    String texture;
    String shape;
    String agletMaterial;
    String manufacturer;
    int manufacturingYear;
    String countryOfOrigin;
    int rating;
    double price;
    double discountPercent;
    boolean limitedEdition;
    String packagingType;
    String targetUser;
    String usageType;
    boolean washable;
    String shoeCompatibility;
    int warrantyMonths;
    String pattern;

    ShoeLace() {

    }

    ShoeLace(String brand, String material, String color, double length, double thickness, String laceType, boolean stretchable, boolean waterproof, String texture, String shape, String agletMaterial, String manufacturer, int manufacturingYear, String countryOfOrigin, int rating, double price, double discountPercent, boolean limitedEdition, String packagingType, String targetUser, String usageType, boolean washable, String shoeCompatibility, int warrantyMonths, String pattern) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.thickness = thickness;
        this.laceType = laceType;
        this.stretchable = stretchable;
        this.waterproof = waterproof;
        this.texture = texture;
        this.shape = shape;
        this.agletMaterial = agletMaterial;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = rating;
        this.price = price;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.packagingType = packagingType;
        this.targetUser = targetUser;
        this.usageType = usageType;
        this.washable = washable;
        this.shoeCompatibility = shoeCompatibility;
        this.warrantyMonths = warrantyMonths;
        this.pattern = pattern;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Thickness: " + thickness);
        System.out.println("Lace Type: " + laceType);
        System.out.println("Stretchable: " + stretchable);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Texture: " + texture);
        System.out.println("Shape: " + shape);
        System.out.println("Aglet Material: " + agletMaterial);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Target User: " + targetUser);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Washable: " + washable);
        System.out.println("Shoe Compatibility: " + shoeCompatibility);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Pattern: " + pattern);
    }
}