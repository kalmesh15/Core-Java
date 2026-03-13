class Racket {

    String brand;
    String sportType;
    String material;
    String color;
    double weight;
    double length;
    String gripType;
    double gripSize;
    int stringCount;
    String stringMaterial;
    double headSize;
    String balanceType;
    boolean professionalUse;
    String playerLevel;
    int manufacturingYear;
    String manufacturer;
    String countryOfOrigin;
    int rating;
    double price;
    double discountPercent;
    boolean limitedEdition;
    String frameShape;
    String coverType;
    int warrantyMonths;
    String usageSurface;

    Racket() {

    }

    Racket(String brand, String sportType, String material, String color, double weight, double length, String gripType, double gripSize, int stringCount, String stringMaterial, double headSize, String balanceType, boolean professionalUse, String playerLevel, int manufacturingYear, String manufacturer, String countryOfOrigin, int rating, double price, double discountPercent, boolean limitedEdition, String frameShape, String coverType, int warrantyMonths, String usageSurface) {

        this.brand = brand;
        this.sportType = sportType;
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.length = length;
        this.gripType = gripType;
        this.gripSize = gripSize;
        this.stringCount = stringCount;
        this.stringMaterial = stringMaterial;
        this.headSize = headSize;
        this.balanceType = balanceType;
        this.professionalUse = professionalUse;
        this.playerLevel = playerLevel;
        this.manufacturingYear = manufacturingYear;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.rating = rating;
        this.price = price;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.frameShape = frameShape;
        this.coverType = coverType;
        this.warrantyMonths = warrantyMonths;
        this.usageSurface = usageSurface;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Length: " + length);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Grip Size: " + gripSize);
        System.out.println("String Count: " + stringCount);
        System.out.println("String Material: " + stringMaterial);
        System.out.println("Head Size: " + headSize);
        System.out.println("Balance Type: " + balanceType);
        System.out.println("Professional Use: " + professionalUse);
        System.out.println("Player Level: " + playerLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Rating: " + rating);
        System.out.println("Price: " + price);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Frame Shape: " + frameShape);
        System.out.println("Cover Type: " + coverType);
        System.out.println("Warranty Months: " + warrantyMonths);
        System.out.println("Usage Surface: " + usageSurface);
    }
}