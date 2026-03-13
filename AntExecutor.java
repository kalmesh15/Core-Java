class AntExecutor {

    public static void main(String[] args) {

        Ant a1 = new Ant();

        a1.species="Fire Ant";
        a1.color="Red";
        a1.legsCount=6;
        a1.bodyLength=5.2;
        a1.weight=0.003;
        a1.habitat="Soil";
        a1.poisonous=true;
        a1.colonySize=50000;
        a1.foodType="Omnivore";
        a1.movementType="Crawling";
        a1.speed=2.1;
        a1.winged=false;
        a1.antennaType="Bent";
        a1.defenseMechanism="Sting";
        a1.roleInColony="Worker";
        a1.lifeSpanDays=60;
        a1.activityTime="Day";
        a1.nestType="Underground";
        a1.aggressive=true;
        a1.continent="Asia";
        a1.biteStrength=0.5;
        a1.discoveryScientist="Linnaeus";
        a1.discoveryYear=1758;
        a1.scientificName="Solenopsis";
        a1.endangered=false;

        a1.display();

        Ant a2 = new Ant("Carpenter Ant","Black",6,6.5,0.004,"Wood",false,20000,"Omnivore","Crawling",1.8,true,"Straight","Bite","Soldier",90,"Night","WoodNest",true,"NorthAmerica",0.7,"Fabricius",1775,"Camponotus",false);

        a2.display();
    }
}