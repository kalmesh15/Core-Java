class Wire {

    int wireId;
    String brandName;
    String materialType;
    double length;
    double thickness;
    String color;
    double price;
    String usageType;
    String manufacturer;
    String countryOfOrigin;
    boolean isInsulated;
    boolean isFlexible;
    int durabilityRating;
    double voltageCapacity;
    String packagingType;
    String availabilityStatus;
    String certification;
    double weight;
    String warranty;
    String storageInstructions;

    public Wire() {
        this(1, "Finolex", "Copper", 10.0, 2.5, "Red", 500.0, "Electrical", "Finolex Industries", "India", true, true, 5, 220.0, "Roll", "Available", "ISI", 1.2, "1 Year", "Keep dry");
    }

    public Wire(int wireId, String brandName, String materialType, double length, double thickness, String color, double price, String usageType, String manufacturer, String countryOfOrigin, boolean isInsulated, boolean isFlexible, int durabilityRating, double voltageCapacity, String packagingType, String availabilityStatus, String certification, double weight, String warranty, String storageInstructions) {

        this.wireId = wireId;
        this.brandName = brandName;
        this.materialType = materialType;
        this.length = length;
        this.thickness = thickness;
        this.color = color;
        this.price = price;
        this.usageType = usageType;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.isInsulated = isInsulated;
        this.isFlexible = isFlexible;
        this.durabilityRating = durabilityRating;
        this.voltageCapacity = voltageCapacity;
        this.packagingType = packagingType;
        this.availabilityStatus = availabilityStatus;
        this.certification = certification;
        this.weight = weight;
        this.warranty = warranty;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Wire ID: " + wireId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Material Type: " + materialType);
        System.out.println("Length: " + length);
        System.out.println("Thickness: " + thickness);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Is Insulated: " + isInsulated);
        System.out.println("Is Flexible: " + isFlexible);
        System.out.println("Durability Rating: " + durabilityRating);
        System.out.println("Voltage Capacity: " + voltageCapacity);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Availability Status: " + availabilityStatus);
        System.out.println("Certification: " + certification);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}