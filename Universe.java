class Universe {

    int universeId;
    String universeName;

    Earth earth;

    public void getUniverseDetail() {

        System.out.println("--------------------------------");
        System.out.println("Universe Details");
        System.out.println("Universe Id: " + this.universeId);
        System.out.println("Universe Name: " + this.universeName);

        this.earth.getEarthDetail();
    }
}