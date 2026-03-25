class GymExecutor {
    public static void main(String[] args) {

        GymManager gym = new GymManager();

        gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbells");
        gym.addEquipment("Barbell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Squat Rack");
        gym.addEquipment("Leg Press Machine");
        gym.addEquipment("Cable Machine");
        gym.addEquipment("Pull-Up Bar");
        gym.addEquipment("Lat Pulldown Machine");
        gym.addEquipment("Elliptical Trainer");
        gym.addEquipment("Stationary Bike");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Ab Crunch Machine");
        gym.addEquipment("Resistance Bands");

        gym.getEquipments();
    }
}