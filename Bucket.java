class Bucket {

    String brand;
    String material;
    String color;
    double capacityLiters;
    double price;
    double weight;
    boolean lidAvailable;
    boolean handleAvailable;
    String shape;
    String usageType;
    String manufacturer;
    int productionYear;
    String countryOfOrigin;
    double height;
    double diameter;
    boolean stackable;
    String surfaceFinish;
    int rating;
    String packageType;
    boolean foodGrade;
    double thickness;
    String designPattern;
    boolean recyclable;
    int warrantyMonths;
    String storagePurpose;

    Bucket() {

    }

    Bucket(String brand, String material, String color, double capacityLiters, double price, double weight, boolean lidAvailable, boolean handleAvailable, String shape, String usageType, String manufacturer, int productionYear, String countryOfOrigin, double height, double diameter, boolean stackable, String surfaceFinish, int rating, String packageType, boolean foodGrade, double thickness, String designPattern, boolean recyclable, int warrantyMonths, String storagePurpose) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.capacityLiters = capacityLiters;
        this.price = price;
        this.weight = weight;
        this.lidAvailable = lidAvailable;
        this.handleAvailable = handleAvailable;
        this.shape = shape;
        this.usageType = usageType;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.height = height;
        this.diameter = diameter;
        this.stackable = stackable;
        this.surfaceFinish = surfaceFinish;
        this.rating = rating;
        this.packageType = packageType;
        this.foodGrade = foodGrade;
        this.thickness = thickness;
        this.designPattern = designPattern;
        this.recyclable = recyclable;
        this.warrantyMonths = warrantyMonths;
        this.storagePurpose = storagePurpose;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity Liters: " + capacityLiters);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Lid Available: " + lidAvailable);
        System.out.println("Handle Available: " + handleAvailable);
        System.out.println("Shape: " + shape);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Height: " + height);
        System.out.println("Diameter: " + diameter);
        System.out.println("Stackable: " + stackable);
        System.out.println("Surface Finish: " + surfaceFinish);
        System.out.println("Rating: " + rating);
        System.out.println("Package Type: " + packageType);
        System.out.println("Food Grade: " + foodGrade);
        System.out.println("Thickness: " + thickness);
        System.out.println("Design Pattern: " + designPattern);
        System.out.println("Recyclable: " + recyclable);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Storage Purpose: " + storagePurpose);
    }
}