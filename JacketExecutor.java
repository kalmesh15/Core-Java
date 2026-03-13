class JacketExecutor {

    public static void main(String[] args) {

        Jacket j1 = new Jacket();

        j1.brand="NorthWear";
        j1.material="Leather";
        j1.color="Black";
        j1.size="L";
        j1.price=4500;
        j1.weight=1.2;
        j1.waterproof=true;
        j1.hoodAvailable=false;
        j1.sleeveType="Full";
        j1.closureType="Zip";
        j1.manufacturer="WildCraft";
        j1.productionYear=2024;
        j1.countryOfOrigin="India";
        j1.insulationType="Polyester";
        j1.length=70;
        j1.windproof=true;
        j1.style="Casual";
        j1.rating=5;
        j1.packageType="Box";
        j1.limitedEdition=false;
        j1.discountPercent=10;
        j1.collectionName="WinterClassic";
        j1.seasonType="Winter";
        j1.warrantyMonths=12;
        j1.targetGender="Men";

        j1.display();

        Jacket j2 = new Jacket("UrbanStyle","Denim","Blue","M",3200,0.9,false,false,"Full","Buttons","Levis",2025,"USA","Cotton",65,false,"StreetWear",4,"Cover",false,5,"SummerDrop","Summer",6,"Unisex");

        j2.display();
    }
}