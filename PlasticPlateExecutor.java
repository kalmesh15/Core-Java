class PlasticPlateExecutor {

    public static void main(String[] args) {

        PlasticPlate p1 = new PlasticPlate();
        p1.display();

        System.out.println("----------------------");

        PlasticPlate p2 = new PlasticPlate(2, "DinnerPro", "Plastic", "Black", 500.0, 100, "Square", "Large", "DinnerPro Pvt Ltd", "India", true, true, 5, "Premium", "Box", "Available", "Events", 1.5, "1 Year", "Wash and store properly");
        p2.display();
    }
}