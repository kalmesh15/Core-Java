class TheoBromaExecutor {

    public static void main(String[] args) {

        TheoBroma t1 = new TheoBroma();
        t1.display();

        System.out.println("----------------------");

        TheoBroma t2 = new TheoBroma(2, "TheoBroma", "Red Velvet Cake", "Cake", 1200.0, 1, "12-04-2026", "13-04-2026", "Red Velvet", "2kg", "TheoBroma Bakery", "India", "Premium Box", "Online Delivery", 4.9, true, true, 2.0, "All", "Keep refrigerated");
        t2.display();
    }
}