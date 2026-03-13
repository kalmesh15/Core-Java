class AnkletExecutor {

    public static void main(String[] args) {

        Anklet a1 = new Anklet();

        a1.brand="SilverStep";
        a1.material="Silver";
        a1.color="White";
        a1.length=24.5;
        a1.price=3500;
        a1.quantity=2;
        a1.weight=8.5;
        a1.adjustable=true;
        a1.designStyle="Traditional";
        a1.countryOfOrigin="India";
        a1.warrantyMonths=12;
        a1.pattern="Floral";
        a1.handmade=true;
        a1.thickness=1.5;
        a1.popularityRank=2;
        a1.finishType="Glossy";
        a1.waterproof=true;
        a1.packageType="GiftBox";
        a1.rating=5;
        a1.targetAudience="Women";
        a1.discountPercent=10;
        a1.limitedEdition=false;
        a1.collectionName="Festive";
        a1.yearOfManufacture=2024;
        a1.manufacturer="Tanishq";

        a1.display();


        Anklet a2 = new Anklet("RoyalStep","Silver","RoseGold",23.5,4200,2,9.1,true,"Designer","India",24,"Leaf",true,1.8,1,"Matte",true,"PremiumBox",5,"Women",15,true,"WeddingEdition",2025,"KalyanJewellers");

        a2.display();
    }
}