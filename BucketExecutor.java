class BucketExecutor {

    public static void main(String[] args) {

        Bucket b1 = new Bucket();

        b1.brand="AquaStore";
        b1.material="Plastic";
        b1.color="Blue";
        b1.capacityLiters=20;
        b1.price=250;
        b1.weight=0.9;
        b1.lidAvailable=true;
        b1.handleAvailable=true;
        b1.shape="Round";
        b1.usageType="Household";
        b1.manufacturer="Nilkamal";
        b1.productionYear=2024;
        b1.countryOfOrigin="India";
        b1.height=35;
        b1.diameter=30;
        b1.stackable=true;
        b1.surfaceFinish="Glossy";
        b1.rating=5;
        b1.packageType="PlasticWrap";
        b1.foodGrade=false;
        b1.thickness=2.5;
        b1.designPattern="Plain";
        b1.recyclable=true;
        b1.warrantyMonths=12;
        b1.storagePurpose="Water";

        b1.display();

        Bucket b2 = new Bucket("HomeSafe","Steel","Silver",15,850,1.5,true,true,"Round","Kitchen","Prestige",2025,"India",32,28,true,"Matte",4,"Box",true,3.2,"Striped",true,24,"FoodStorage");

        b2.display();
    }
}