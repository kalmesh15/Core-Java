class Universe {

    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxyName) {
        boolean isAdded = false;

        if(galaxyName != null && !galaxyName.isEmpty()) {
            if(index < this.galaxies.length) {
                this.galaxies[index++] = galaxyName;
                isAdded = true;
            } else {
                System.out.println("The galaxy list is full. Cannot add more galaxies.");
            }
        } else {
            System.out.println("Please enter a valid galaxy name.");
        }

        return isAdded;
    }

    public void getGalaxies() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of galaxies");
        System.out.println("------------------------------------------");

        for(String galaxy : galaxies) {
            System.out.println("Galaxy Name: " + galaxy);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteGalaxy(int index) {
        System.out.println("Deleting the galaxy at index: " + index);
        galaxies[index] = null;
    }

    public void updateGalaxy(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the galaxy at index: " + index);
            galaxies[index] = name;
        } else {
            System.out.println("Please enter a valid galaxy name.");
        }
    }
}