class CoffeeExecutor {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();

        c1.brand="StarBeans";
        c1.beanType="Arabica";
        c1.roastLevel="Dark";
        c1.originCountry="Brazil";
        c1.flavorProfile="Chocolate";
        c1.price=250;
        c1.quantity=2;
        c1.caffeineLevel=95;
        c1.cupSize=250;
        c1.milkAdded=true;
        c1.sugarAdded=false;
        c1.servingTemperature="Hot";
        c1.packagingType="Cup";
        c1.rating=5;
        c1.aromaLevel="Strong";
        c1.organic=true;
        c1.grindType="Fine";
        c1.productionYear=2024;
        c1.manufacturer="Starbucks";
        c1.discountPercent=10;
        c1.limitedEdition=false;
        c1.collectionName="MorningBlend";
        c1.brewingMethod="Espresso";
        c1.weight=200;
        c1.baristaName="Arjun";

        c1.display();

        Coffee c2 = new Coffee("CafeElite","Robusta","Medium","India","Nutty",200,1,80,220,true,true,"Hot","PaperCup",4,"Rich",false,"Medium",2025,"CafeCoffeeDay",5,false,"ClassicBlend","Filter",180,"Ravi");

        c2.display();
    }
}