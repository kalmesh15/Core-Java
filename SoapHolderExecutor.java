class SoapHolderExecutor {

    public static void main(String[] args) {

        SoapHolder s1 = new SoapHolder();
        s1.display();

        System.out.println("----------------------");

        SoapHolder s2 = new SoapHolder(2, "BathStyle", "Steel", "Silver", 300.0, 15, "Oval", "Large", "BathStyle Pvt Ltd", "India", true, true, 5, "Premium", "Box", "Available", "Bathroom", 0.8, "1 Year", "Keep clean and dry");
        s2.display();
    }
}