class State {

    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String highwayName) {
        boolean isAdded = false;

        if(highwayName != null && !highwayName.isEmpty()) {
            if(index < this.highwayNames.length) {
                this.highwayNames[index++] = highwayName;
                isAdded = true;
            } else {
                System.out.println("The highway list is full. Cannot add more highways.");
            }
        } else {
            System.out.println("Please enter a valid highway name.");
        }

        return isAdded;
    }

    public void getHighways() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of highways");
        System.out.println("------------------------------------------");

        for(String highway : highwayNames) {
            System.out.println("Highway Name: " + highway);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteHighway(int index) {
        System.out.println("Deleting the highway at index: " + index);
        highwayNames[index] = null;
    }

    public void updateHighway(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the highway at index: " + index);
            highwayNames[index] = name;
        } else {
            System.out.println("Please enter a valid highway name.");
        }
    }
}