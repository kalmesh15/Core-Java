class Museum {

    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monumentName) {
        boolean isAdded = false;

        if(monumentName != null && !monumentName.isEmpty()) {
            if(index < this.historicalMonuments.length) {
                this.historicalMonuments[index++] = monumentName;
                isAdded = true;
            } else {
                System.out.println("The monument list is full. Cannot add more monuments.");
            }
        } else {
            System.out.println("Please enter a valid monument name.");
        }

        return isAdded;
    }

    public void getMonuments() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of historical monuments");
        System.out.println("------------------------------------------");

        for(String monument : historicalMonuments) {
            System.out.println("Monument Name: " + monument);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteMonument(int index) {
        System.out.println("Deleting the monument at index: " + index);
        historicalMonuments[index] = null;
    }

    public void updateMonument(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the monument at index: " + index);
            historicalMonuments[index] = name;
        } else {
            System.out.println("Please enter a valid monument name.");
        }
    }
}