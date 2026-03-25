class PetShop {

    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessoryName) {
        boolean isAdded = false;

        if(accessoryName != null && !accessoryName.isEmpty()) {
            if(index < this.petAccessories.length) {
                this.petAccessories[index++] = accessoryName;
                isAdded = true;
            } else {
                System.out.println("The accessory list is full. Cannot add more items.");
            }
        } else {
            System.out.println("Please enter a valid accessory name.");
        }

        return isAdded;
    }

    public void getAccessories() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of pet accessories");
        System.out.println("------------------------------------------");

        for(String item : petAccessories) {
            System.out.println("Accessory Name: " + item);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteAccessory(int index) {
        System.out.println("Deleting the accessory at index: " + index);
        petAccessories[index] = null;
    }

    public void updateAccessory(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the accessory at index: " + index);
            petAccessories[index] = name;
        } else {
            System.out.println("Please enter a valid accessory name.");
        }
    }
}