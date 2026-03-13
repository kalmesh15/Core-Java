class BangleExecutor {

    public static void main(String[] args) {

        System.out.println("DEFAULT CONSTRUCTOR OBJECT");

        Bangle b1 = new Bangle();

        b1.brand = "RoyalGold";
        b1.material = "Gold";
        b1.color = "Golden";
        b1.diameter = 6.2;
        b1.price = 15000;
        b1.quantity = 2;
        b1.weight = 12.5;
        b1.adjustable = true;
        b1.designType = "Traditional";
        b1.countryOfOrigin = "India";
        b1.warrantyMonths = 12;
        b1.pattern = "Floral";
        b1.handmade = true;
        b1.thickness = 2.5;
        b1.popularityRank = 1;
        b1.finishType = "Glossy";
        b1.waterproof = true;
        b1.packageType = "Luxury Box";
        b1.rating = 5;
        b1.targetAudience = "Women";
        b1.discountPercent = 10;
        b1.limitedEdition = false;
        b1.collectionName = "Wedding Collection";
        b1.yearOfManufacture = 2024;
        b1.manufacturer = "Tanishq";

        b1.display();


        System.out.println("\nPARAMETERIZED CONSTRUCTOR Copy");

        Bangle b2 = new Bangle(
        "HeritageGold","Gold","Rose Gold",6.0,18000,
        2,13.0,true,"Designer","India",24,
        "Leaf Pattern",true,2.8,2,"Matte",
        true,"Premium Box",5,"Women",15,
        true,"Festive Collection",2025,"Kalyan Jewellers");

        b2.display();
    }
}