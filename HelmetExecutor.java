class HelmetExecutor {

    public static void main(String[] args) {

        Helmet h1 = new Helmet();

        h1.brand="SteelBird";
        h1.type="FullFace";
        h1.material="ABS";
        h1.color="Black";
        h1.weight=1.4;
        h1.size="L";
        h1.visorAvailable=true;
        h1.scratchResistant=true;
        h1.antiFog=true;
        h1.ventilationSystem=true;
        h1.safetyCertification="ISI";
        h1.paddingMaterial="Foam";
        h1.removablePadding=true;
        h1.chinStrapType="QuickRelease";
        h1.manufacturer="SteelBirdCo";
        h1.manufacturingYear=2024;
        h1.countryOfOrigin="India";
        h1.rating=5;
        h1.price=2500;
        h1.discountPercent=10;
        h1.limitedEdition=false;
        h1.designPattern="MatteBlack";
        h1.usageType="Motorcycle";
        h1.warrantyMonths=12;
        h1.targetUser="Riders";

        h1.display();

        Helmet h2 = new Helmet("Vega","HalfFace","Fiber","Red",1.2,"M",true,true,false,true,"DOT","Cotton",true,"Buckle","VegaAuto",2025,"India",4,1800,5,false,"Striped","BikeRiding",6,"DailyRider");

        h2.display();
    }
}