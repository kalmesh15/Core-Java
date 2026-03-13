class BlanketExecutor {

    public static void main(String[] args) {

        Blanket b1 = new Blanket();

        b1.brand="SleepWell";
        b1.material="Cotton";
        b1.color="Blue";
        b1.length=200;
        b1.width=150;
        b1.weight=1.5;
        b1.sizeType="Queen";
        b1.washable=true;
        b1.electric=false;
        b1.pattern="Floral";
        b1.seasonType="Winter";
        b1.manufacturer="HomeTex";
        b1.manufacturingYear=2024;
        b1.countryOfOrigin="India";
        b1.rating=5;
        b1.price=1800;
        b1.discountPercent=10;
        b1.limitedEdition=false;
        b1.packagingType="Bag";
        b1.softnessLevel="Soft";
        b1.hypoallergenic=true;
        b1.usageType="Bed";
        b1.warrantyMonths=12;
        b1.targetUser="Adults";
        b1.fabricType="WoolBlend";

        b1.display();

        Blanket b2 = new Blanket("CozyHome","Wool","Brown",210,160,2.0,"King",true,false,"Striped","Winter","CozyTex",2025,"Canada",4,2500,5,false,"Box","UltraSoft",true,"Bedroom",24,"Family","PureWool");

        b2.display();
    }
}