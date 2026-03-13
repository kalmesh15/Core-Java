class PocketExecutor {

    public static void main(String[] args) {

        Pocket p1 = new Pocket();

        p1.brand="DenimCraft";
        p1.material="Cotton";
        p1.color="Blue";
        p1.shape="Rectangle";
        p1.width=12;
        p1.height=15;
        p1.depth=2;
        p1.zipperAvailable=true;
        p1.buttonAvailable=false;
        p1.stitchingType="Double";
        p1.placement="Front";
        p1.clothingType="Jeans";
        p1.manufacturer="Levis";
        p1.productionYear=2024;
        p1.countryOfOrigin="USA";
        p1.waterproof=false;
        p1.stretchable=true;
        p1.capacityItems=5;
        p1.designPattern="Plain";
        p1.rating=4;
        p1.packageType="Cover";
        p1.hiddenPocket=false;
        p1.weight=0.2;
        p1.usagePurpose="CarrySmallItems";
        p1.warrantyMonths=6;

        p1.display();

        Pocket p2 = new Pocket("UrbanPocket","Polyester","Black","Square",10,12,2,true,true,"Triple","Side","Jacket","Adidas",2025,"Germany",true,false,4,"Striped",5,"Box",true,0.25,"SecureStorage",12);

        p2.display();
    }
}