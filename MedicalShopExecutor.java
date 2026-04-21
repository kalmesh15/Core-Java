class MedicalShopExecutor {

    public static void main(String[] args) {

        MedicalShop m1 = new MedicalShop();
        m1.display();

        System.out.println("----------------------");

        MedicalShop m2 = new MedicalShop(2, "City Medico", "Suresh Patil", "Hubli", 75000.0, 300, "7:00 AM", "11:00 PM", "LIC67890", "9123456780", true, true, 4, "Wholesale", "MediSupply", "Cash, Card, UPI", "All", 800.0, "Drug Authority", "Keep medicines in cool and dry place");
        m2.display();
    }
}