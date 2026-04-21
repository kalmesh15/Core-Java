class CombExecutor {

    public static void main(String[] args) {

        Comb c1 = new Comb();
        c1.display();

        System.out.println("----------------------");

        Comb c2 = new Comb(2, "Philips", "Carbon", "Blue", 120.0, 50, "Large", "Wide", "Philips India", "India", true, true, 5, "Premium", "Box", "Available", "Hair Care", 0.2, "6 Months", "Store safely");
        c2.display();
    }
}