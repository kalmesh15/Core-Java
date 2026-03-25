class ArchitectExecutor {
    public static void main(String[] args) {

        Architect obj = new Architect();

        obj.addDesign("Modern Interior Design");
        obj.addDesign("Minimalist Design");
        obj.addDesign("Contemporary Design");
        obj.addDesign("Industrial Design");
        obj.addDesign("Scandinavian Design");
        obj.addDesign("Traditional Design");
        obj.addDesign("Bohemian Design");
        obj.addDesign("Rustic Design");
        obj.addDesign("Art Deco Design");
        obj.addDesign("Mid-Century Modern");
        obj.addDesign("Coastal Design");

        obj.getDesigns();
    }
}