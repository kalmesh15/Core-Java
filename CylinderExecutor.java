class CylinderExecutor {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.display();

        System.out.println("----------------------");

        Cylinder c2 = new Cylinder(2, "HP Gas", "LPG", 19.0, 35.0, "Blue", 1500.0, "Commercial", "Hindustan Petroleum", "India", true, true, 5, 350.0, "Metal Body", "Available", "ISO", "Advanced Valve", "7 Years", "Store in open ventilated space");
        c2.display();
    }
}