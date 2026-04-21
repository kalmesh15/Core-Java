class ZanduBalmExecutor {

    public static void main(String[] args) {

        ZanduBalm z1 = new ZanduBalm();   // calls default → chaining
        z1.display();

        ZanduBalm z2 = new ZanduBalm(10, "Zandu Balm Strong", "Zandu", "Pain Relief", 150.0, 60, "01-03-2024", "01-03-2028", "Brown", "Strong", "Zandu Pharma", "India", "Jar", "External", 4.8, true, true, 30.0, "Adults", "Cool place");
        z2.display();
    }
}