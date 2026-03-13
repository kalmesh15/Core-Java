class Pocket {

    String brand;
    String material;
    String color;
    String shape;
    double width;
    double height;
    double depth;
    boolean zipperAvailable;
    boolean buttonAvailable;
    String stitchingType;
    String placement;
    String clothingType;
    String manufacturer;
    int productionYear;
    String countryOfOrigin;
    boolean waterproof;
    boolean stretchable;
    int capacityItems;
    String designPattern;
    int rating;
    String packageType;
    boolean hiddenPocket;
    double weight;
    String usagePurpose;
    int warrantyMonths;

    Pocket() {

    }

    Pocket(String brand, String material, String color, String shape, double width, double height, double depth, boolean zipperAvailable, boolean buttonAvailable, String stitchingType, String placement, String clothingType, String manufacturer, int productionYear, String countryOfOrigin, boolean waterproof, boolean stretchable, int capacityItems, String designPattern, int rating, String packageType, boolean hiddenPocket, double weight, String usagePurpose, int warrantyMonths) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.zipperAvailable = zipperAvailable;
        this.buttonAvailable = buttonAvailable;
        this.stitchingType = stitchingType;
        this.placement = placement;
        this.clothingType = clothingType;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.waterproof = waterproof;
        this.stretchable = stretchable;
        this.capacityItems = capacityItems;
        this.designPattern = designPattern;
        this.rating = rating;
        this.packageType = packageType;
        this.hiddenPocket = hiddenPocket;
        this.weight = weight;
        this.usagePurpose = usagePurpose;
        this.warrantyMonths = warrantyMonths;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        System.out.println("Zipper Available: " + zipperAvailable);
        System.out.println("Button Available: " + buttonAvailable);
        System.out.println("Stitching Type: " + stitchingType);
        System.out.println("Placement: " + placement);
        System.out.println("Clothing Type: " + clothingType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Stretchable: " + stretchable);
        System.out.println("Capacity Items: " + capacityItems);
        System.out.println("Design Pattern: " + designPattern);
        System.out.println("Rating: " + rating);
        System.out.println("Package Type: " + packageType);
        System.out.println("Hidden Pocket: " + hiddenPocket);
        System.out.println("Weight: " + weight);
        System.out.println("Usage Purpose: " + usagePurpose);
        System.out.println("Warranty Months: " + warrantyMonths);
    }
}