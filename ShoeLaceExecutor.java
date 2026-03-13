class ShoeLaceExecutor {

    public static void main(String[] args) {

        ShoeLace s1 = new ShoeLace();

        s1.brand="Nike";
        s1.material="Cotton";
        s1.color="Black";
        s1.length=120;
        s1.thickness=0.5;
        s1.laceType="Flat";
        s1.stretchable=false;
        s1.waterproof=false;
        s1.texture="Smooth";
        s1.shape="Flat";
        s1.agletMaterial="Plastic";
        s1.manufacturer="NikeInc";
        s1.manufacturingYear=2024;
        s1.countryOfOrigin="USA";
        s1.rating=5;
        s1.price=200;
        s1.discountPercent=10;
        s1.limitedEdition=false;
        s1.packagingType="PlasticPack";
        s1.targetUser="Athletes";
        s1.usageType="SportsShoes";
        s1.washable=true;
        s1.shoeCompatibility="RunningShoes";
        s1.warrantyMonths=6;
        s1.pattern="Plain";

        s1.display();

        ShoeLace s2 = new ShoeLace("Adidas","Polyester","White",110,0.4,"Round",true,true,"Soft","Round","Metal","AdidasCorp",2025,"Germany",4,250,5,false,"Box","Unisex","Sneakers",true,"CasualShoes",12,"Striped");

        s2.display();
    }
}