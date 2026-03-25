class AirAsia {

    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passengerName) {
        boolean isAdded = false;

        if(passengerName != null && !passengerName.isEmpty()) {
            if(index < this.passengers.length) {
                this.passengers[index++] = passengerName;
                isAdded = true;
            } else {
                System.out.println("The passenger list is full. Cannot add more passengers.");
            }
        } else {
            System.out.println("Please enter a valid passenger name.");
        }

        return isAdded;
    }

    public void getPassengers() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of passengers");
        System.out.println("------------------------------------------");

        for(String passenger : passengers) {
            System.out.println("Passenger Name: " + passenger);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deletePassenger(int index) {
        System.out.println("Deleting the passenger at index: " + index);
        passengers[index] = null;
    }

    public void updatePassenger(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the passenger at index: " + index);
            passengers[index] = name;
        } else {
            System.out.println("Please enter a valid passenger name.");
        }
    }
}