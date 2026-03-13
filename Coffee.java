class Coffee {

    String brand;
    String beanType;
    String roastLevel;
    String originCountry;
    String flavorProfile;
    double price;
    int quantity;
    double caffeineLevel;
    double cupSize;
    boolean milkAdded;
    boolean sugarAdded;
    String servingTemperature;
    String packagingType;
    int rating;
    String aromaLevel;
    boolean organic;
    String grindType;
    int productionYear;
    String manufacturer;
    double discountPercent;
    boolean limitedEdition;
    String collectionName;
    String brewingMethod;
    double weight;
    String baristaName;

    Coffee() {

    }

    Coffee(String brand, String beanType, String roastLevel, String originCountry, String flavorProfile, double price, int quantity, double caffeineLevel, double cupSize, boolean milkAdded, boolean sugarAdded, String servingTemperature, String packagingType, int rating, String aromaLevel, boolean organic, String grindType, int productionYear, String manufacturer, double discountPercent, boolean limitedEdition, String collectionName, String brewingMethod, double weight, String baristaName) {

        this.brand = brand;
        this.beanType = beanType;
        this.roastLevel = roastLevel;
        this.originCountry = originCountry;
        this.flavorProfile = flavorProfile;
        this.price = price;
        this.quantity = quantity;
        this.caffeineLevel = caffeineLevel;
        this.cupSize = cupSize;
        this.milkAdded = milkAdded;
        this.sugarAdded = sugarAdded;
        this.servingTemperature = servingTemperature;
        this.packagingType = packagingType;
        this.rating = rating;
        this.aromaLevel = aromaLevel;
        this.organic = organic;
        this.grindType = grindType;
        this.productionYear = productionYear;
        this.manufacturer = manufacturer;
        this.discountPercent = discountPercent;
        this.limitedEdition = limitedEdition;
        this.collectionName = collectionName;
        this.brewingMethod = brewingMethod;
        this.weight = weight;
        this.baristaName = baristaName;
    }

    void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Bean Type: " + beanType);
        System.out.println("Roast Level: " + roastLevel);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Flavor Profile: " + flavorProfile);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Caffeine Level: " + caffeineLevel);
        System.out.println("Cup Size: " + cupSize);
        System.out.println("Milk Added: " + milkAdded);
        System.out.println("Sugar Added: " + sugarAdded);
        System.out.println("Serving Temperature: " + servingTemperature);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Rating: " + rating);
        System.out.println("Aroma Level: " + aromaLevel);
        System.out.println("Organic: " + organic);
        System.out.println("Grind Type: " + grindType);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Discount Percent: " + discountPercent);
        System.out.println("Limited Edition: " + limitedEdition);
        System.out.println("Collection Name: " + collectionName);
        System.out.println("Brewing Method: " + brewingMethod);
        System.out.println("Weight: " + weight);
        System.out.println("Barista Name: " + baristaName);
    }
}