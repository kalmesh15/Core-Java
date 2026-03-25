class ElectricalShop {

    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String applianceName) {
        boolean isAdded = false;

        if(applianceName != null && !applianceName.isEmpty()) {
            if(index < this.appliances.length) {
                this.appliances[index++] = applianceName;
                isAdded = true;
            } else {
                System.out.println("The appliance list is full. Cannot add more items.");
            }
        } else {
            System.out.println("Please enter a valid appliance name.");
        }

        return isAdded;
    }

    public void getAppliances() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of electrical appliances");
        System.out.println("------------------------------------------");

        for(String appliance : appliances) {
            System.out.println("Appliance Name: " + appliance);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteAppliance(int index) {
        System.out.println("Deleting the appliance at index: " + index);
        appliances[index] = null;
    }

    public void updateAppliance(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the appliance at index: " + index);
            appliances[index] = name;
        } else {
            System.out.println("Please enter a valid appliance name.");
        }
    }
}