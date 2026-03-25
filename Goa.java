class Goa {

    private String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String beachName) {
        boolean isAdded = false;

        if(beachName != null && !beachName.isEmpty()) {
            if(index < this.beachNames.length) {
                this.beachNames[index++] = beachName;
                isAdded = true;
            } else {
                System.out.println("The beach list is full. Cannot add more beaches.");
            }
        } else {
            System.out.println("Please enter a valid beach name.");
        }

        return isAdded;
    }

    public void getBeaches() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of beaches in Goa");
        System.out.println("------------------------------------------");

        for(String beach : beachNames) {
            System.out.println("Beach Name: " + beach);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteBeach(int index) {
        System.out.println("Deleting the beach at index: " + index);
        beachNames[index] = null;
    }

    public void updateBeach(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the beach at index: " + index);
            beachNames[index] = name;
        } else {
            System.out.println("Please enter a valid beach name.");
        }
    }
}