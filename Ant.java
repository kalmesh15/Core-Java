class Ant {

    String species;
    String color;
    int legsCount;
    double bodyLength;
    double weight;
    String habitat;
    boolean poisonous;
    int colonySize;
    String foodType;
    String movementType;
    double speed;
    boolean winged;
    String antennaType;
    String defenseMechanism;
    String roleInColony;
    int lifeSpanDays;
    String activityTime;
    String nestType;
    boolean aggressive;
    String continent;
    double biteStrength;
    String discoveryScientist;
    int discoveryYear;
    String scientificName;
    boolean endangered;

    Ant() {

    }

    Ant(String species, String color, int legsCount, double bodyLength, double weight, String habitat, boolean poisonous, int colonySize, String foodType, String movementType, double speed, boolean winged, String antennaType, String defenseMechanism, String roleInColony, int lifeSpanDays, String activityTime, String nestType, boolean aggressive, String continent, double biteStrength, String discoveryScientist, int discoveryYear, String scientificName, boolean endangered) {

        this.species = species;
        this.color = color;
        this.legsCount = legsCount;
        this.bodyLength = bodyLength;
        this.weight = weight;
        this.habitat = habitat;
        this.poisonous = poisonous;
        this.colonySize = colonySize;
        this.foodType = foodType;
        this.movementType = movementType;
        this.speed = speed;
        this.winged = winged;
        this.antennaType = antennaType;
        this.defenseMechanism = defenseMechanism;
        this.roleInColony = roleInColony;
        this.lifeSpanDays = lifeSpanDays;
        this.activityTime = activityTime;
        this.nestType = nestType;
        this.aggressive = aggressive;
        this.continent = continent;
        this.biteStrength = biteStrength;
        this.discoveryScientist = discoveryScientist;
        this.discoveryYear = discoveryYear;
        this.scientificName = scientificName;
        this.endangered = endangered;
    }

    void display() {

        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Legs Count: " + legsCount);
        System.out.println("Body Length: " + bodyLength);
        System.out.println("Weight: " + weight);
        System.out.println("Habitat: " + habitat);
        System.out.println("Poisonous: " + poisonous);
        System.out.println("Colony Size: " + colonySize);
        System.out.println("Food Type: " + foodType);
        System.out.println("Movement Type: " + movementType);
        System.out.println("Speed: " + speed);
        System.out.println("Winged: " + winged);
        System.out.println("Antenna Type: " + antennaType);
        System.out.println("Defense Mechanism: " + defenseMechanism);
        System.out.println("Role In Colony: " + roleInColony);
        System.out.println("Life Span Days: " + lifeSpanDays);
        System.out.println("Activity Time: " + activityTime);
        System.out.println("Nest Type: " + nestType);
        System.out.println("Aggressive: " + aggressive);
        System.out.println("Continent: " + continent);
        System.out.println("Bite Strength: " + biteStrength);
        System.out.println("Discovery Scientist: " + discoveryScientist);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Scientific Name: " + scientificName);
        System.out.println("Endangered: " + endangered);
    }
}