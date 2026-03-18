class WireExecutor {

    public static void main(String[] args) {

        Wire w1 = new Wire();
        w1.display();

        System.out.println("----------------------");

        Wire w2 = new Wire(2, "Polycab", "Aluminium", 20.0, 3.0, "Blue", 700.0, "Industrial", "Polycab India", "India", true, true, 4, 440.0, "Coil", "Available", "ISI", 2.0, "2 Years", "Store in dry place");
        w2.display();
    }
}