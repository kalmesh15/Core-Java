class LionDatesExecutor {

    public static void main(String[] args) {

        LionDates l1 = new LionDates();
        l1.display();

        System.out.println("----------------------");

        LionDates l2 = new LionDates(2, "Lion Gold", "Dry Fruit", "Super Premium", 650.0, 3, "01-02-2024", "01-02-2026", "Dark Brown", "Extra Sweet", "Lion Dates Impex", "UAE", "Box", "Snacking", 4.9, true, true, 1.5, "All", "Keep refrigerated after opening");
        l2.display();
    }
}