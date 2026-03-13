class Helmet {

    String brand;
    String type;
    String material;
    String color;
    double weight;
    String size;
    boolean visorAvailable;
    boolean scratchResistant;
    boolean antiFog;
    boolean ventilationSystem;
    String safetyCertification;
    String paddingMaterial;
    boolean removablePadding;
    String chinStrapType;
    String manufacturer;
    int manufacturingYear;
    String countryOfOrigin;
    int rating;
    double price;
    double discountPercent;
    boolean limitedEdition;
    String designPattern;
    String usageType;
    int warrantyMonths;
    String targetUser;

    Helmet() {

    }

    Helmet(String brand, String type, String material, String color, double weight, String size, boolean visorAvailable, boolean scratchResistant, boolean antiFog, boolean ventilationSystem, String safetyCertification, String paddingMaterial, boolean removablePadding, String chinStrapType, String manufacturer, int manufacturingYear, String countryOfOrigin, int rating, double price, double discountPercent, boolean limitedEdition, String designPattern, String usageType, int warrantyMonths, String targetUser) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.size = size;
        this.visorAvailable = visorAvailable;
        this.scratchResistant = scratchResistant;
        this.antiFog = antiFog;
        this.ventilationSystem = ventilationSystem;
        this.safetyCertification = safetyCertification;
        this.paddingMaterial = paddingMaterial;
        this.removablePadding = removablePadding;
        this.chinStrapType = chinStrapType;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = rating;
        this.price = price;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.designPattern = designPattern;
        this.usageType = usageType;
        this.warrantyMonths = warrantyMonths;
        this.targetUser = targetUser;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Visor Available: " + visorAvailable);
        System.out.println("Scratch Resistant: " + scratchResistant);
        System.out.println("Anti Fog: " + antiFog);
        System.out.println("Ventilation System: " + ventilationSystem);
        System.out.println("Safety Certification: " + safetyCertification);
        System.out.println("Padding Material: " + paddingMaterial);
        System.out.println("Removable Padding: " + removablePadding);
        System.out.println("Chin Strap Type: " + chinStrapType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Design Pattern: " + designPattern);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Target User: " + targetUser);
    }
}