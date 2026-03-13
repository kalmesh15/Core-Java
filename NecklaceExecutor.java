class NecklaceExecutor {

    public static void main(String[] args) {

        Necklace n1 = new Necklace();

        n1.brand="MalabarGold";
        n1.material="Gold";
        n1.color="Golden";
        n1.length=24;
        n1.weight=35.5;
        n1.size="Large";
        n1.designStyle="Traditional";
        n1.claspType="Hook";
        n1.adjustable=true;
        n1.gemstoneType="Diamond";
        n1.gemstoneCount=12;
        n1.finishType="Glossy";
        n1.manufacturer="MalabarJewels";
        n1.manufacturingYear=2024;
        n1.countryOfOrigin="India";
        n1.rating=5;
        n1.price=120000;
        n1.discountPercent=8;
        n1.limitedEdition=false;
        n1.collectionName="WeddingCollection";
        n1.packagingType="LuxuryBox";
        n1.handmade=true;
        n1.targetAudience="Women";
        n1.warrantyMonths=24;
        n1.pattern="TempleDesign";

        n1.display();

        Necklace n2 = new Necklace("KalyanJewellers","Platinum","Silver",22,28.4,"Medium","Modern","Clip",true,"Emerald",6,"Matte","KalyanJewels",2025,"India",4,85000,5,false,"FestiveCollection","GiftBox",true,"Women",12,"LeafPattern");

        n2.display();
    }
}