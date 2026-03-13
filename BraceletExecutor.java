class BraceletExecutor {

    public static void main(String[] args) {

        Bracelet b1 = new Bracelet();

        b1.brand="Tanishq";
        b1.material="Gold";
        b1.color="Golden";
        b1.length=18;
        b1.weight=12.5;
        b1.size="Medium";
        b1.designStyle="Traditional";
        b1.claspType="Hook";
        b1.adjustable=true;
        b1.gemstoneType="Diamond";
        b1.gemstoneCount=8;
        b1.finishType="Glossy";
        b1.manufacturer="TanishqJewels";
        b1.manufacturingYear=2024;
        b1.countryOfOrigin="India";
        b1.rating=5;
        b1.price=45000;
        b1.discountPercent=5;
        b1.limitedEdition=false;
        b1.collectionName="RoyalCollection";
        b1.packagingType="LuxuryBox";
        b1.handmade=true;
        b1.targetAudience="Women";
        b1.warrantyMonths=24;
        b1.pattern="Floral";

        b1.display();

        Bracelet b2 = new Bracelet("Kalyan","Silver","Silver",17,9.5,"Small","Modern","Clip",true,"Ruby",5,"Matte","KalyanJewellers",2025,"India",4,15000,10,false,"FestiveCollection","GiftBox",true,"Women",12,"LeafDesign");

        b2.display();
    }
}