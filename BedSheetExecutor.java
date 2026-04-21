class BedSheetExecutor {

    public static void main(String[] args) {

        BedSheet b1 = new BedSheet();
        b1.display();

        System.out.println("----------------------");

        BedSheet b2 = new BedSheet(2, "SleepWell", "Silk", "White", 1500.0, 5, "King", "Plain", "SleepWell Ltd", "India", false, true, 500, "Luxury", "Box", "Available", "Bedroom", 2.0, "2 Years", "Keep in clean dry place");
        b2.display();
    }
}