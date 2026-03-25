class UniverseExecutor {
    public static void main(String[] args) {

        Universe obj = new Universe();

        obj.addGalaxy("Milky Way");
        obj.addGalaxy("Andromeda");
        obj.addGalaxy("Triangulum");
        obj.addGalaxy("Whirlpool");
        obj.addGalaxy("Sombrero");
        obj.addGalaxy("Pinwheel");
        obj.addGalaxy("Cartwheel");
        obj.addGalaxy("Black Eye Galaxy");
        obj.addGalaxy("Messier 81");
        obj.addGalaxy("Messier 82");
        obj.addGalaxy("Centaurus A");
        obj.addGalaxy("NGC 1300");
        obj.addGalaxy("NGC 4993");
        obj.addGalaxy("Large Magellanic Cloud");
        obj.addGalaxy("Small Magellanic Cloud");
        obj.addGalaxy("Hoag's Object");
        obj.addGalaxy("IC 1101");

        obj.getGalaxies();
    }
}