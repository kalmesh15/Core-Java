class Architect {

    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String designName) {
        boolean isAdded = false;

        if(designName != null && !designName.isEmpty()) {
            if(index < this.interiorDesignNames.length) {
                this.interiorDesignNames[index++] = designName;
                isAdded = true;
            } else {
                System.out.println("The design list is full. Cannot add more designs.");
            }
        } else {
            System.out.println("Please enter a valid design name.");
        }

        return isAdded;
    }

    public void getDesigns() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of interior designs");
        System.out.println("------------------------------------------");

        for(String design : interiorDesignNames) {
            System.out.println("Design Name: " + design);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteDesign(int index) {
        System.out.println("Deleting the design at index: " + index);
        interiorDesignNames[index] = null;
    }

    public void updateDesign(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the design at index: " + index);
            interiorDesignNames[index] = name;
        } else {
            System.out.println("Please enter a valid design name.");
        }
    }
}