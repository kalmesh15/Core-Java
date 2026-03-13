class RacketExecutor {

    public static void main(String[] args) {

        Racket r1 = new Racket();

        r1.brand="Yonex";
        r1.sportType="Badminton";
        r1.material="CarbonFiber";
        r1.color="Black";
        r1.weight=85;
        r1.length=67;
        r1.gripType="Rubber";
        r1.gripSize=4.5;
        r1.stringCount=22;
        r1.stringMaterial="Nylon";
        r1.headSize=95;
        r1.balanceType="HeadHeavy";
        r1.professionalUse=true;
        r1.playerLevel="Advanced";
        r1.manufacturingYear=2024;
        r1.manufacturer="YonexCo";
        r1.countryOfOrigin="Japan";
        r1.rating=5;
        r1.price=8500;
        r1.discountPercent=10;
        r1.limitedEdition=false;
        r1.frameShape="Oval";
        r1.coverType="FullCover";
        r1.warrantyMonths=12;
        r1.usageSurface="IndoorCourt";

        r1.display();

        Racket r2 = new Racket("Wilson","Tennis","Graphite","Red",300,68,"Cushion",4.3,18,"Polyester",100,"EvenBalance",true,"Professional",2025,"WilsonSport","USA",5,12000,5,false,"Isometric","HalfCover",24,"HardCourt");

        r2.display();
    }
}