class ComedyShowExecutor {

    public static void main(String[] args) {

        ComedyShow c1 = new ComedyShow();
        c1.display();

        System.out.println("----------------------");

        ComedyShow c2 = new ComedyShow(2, "LOL Night", "Kapil Sharma", "Stand-up", 799.0, 150, "15-04-2026", "8:00 PM", "Convention Hall", "Mumbai", true, true, 5, "Hindi", "FunEvents", "Offline", "Family", 800, "BrandY", "Arrive early");
        c2.display();
    }
}