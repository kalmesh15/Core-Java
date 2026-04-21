class TediBarLotionExecutor {

    public static void main(String[] args) {

        TediBarLotion t1 = new TediBarLotion();
        t1.display();

        System.out.println("----------------------");

        TediBarLotion t2 = new TediBarLotion(20, "TediBar Plus", "Curatio", "Dry", 300.0, 40, "01-04-2024", "01-04-2028", "Soft", "Creamy", "Curatio", "India", "Bottle", "External", 4.9, true, true, 250.0, "Kids", "Dry place");
        t2.display();
    }
}