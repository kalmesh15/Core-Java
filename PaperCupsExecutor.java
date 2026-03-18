class PaperCupsExecutor {

    public static void main(String[] args) {

        PaperCups p1 = new PaperCups();
        p1.display();

        System.out.println("----------------------");

        PaperCups p2 = new PaperCups(2, "PartyServe", "Paper", "Multicolor", 350.0, 200, 250, "Round", "PartyServe Ltd", "India", true, true, 4, "Printed", "Packet", "Available", "Events", 0.8, "No Warranty", "Store in dry place");
        p2.display();
    }
}