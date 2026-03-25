class TravelAgency {

    private String places[] = new String[17];
    int index;

    public boolean addPlace(String placeName) {
        boolean isAdded = false;

        if(placeName != null && !placeName.isEmpty()) {
            if(index < this.places.length) {
                this.places[index++] = placeName;
                isAdded = true;
            } else {
                System.out.println("The places list is full. Cannot add more places.");
            }
        } else {
            System.out.println("Please enter a valid place name.");
        }

        return isAdded;
    }

    public void getPlaces() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of travel destinations");
        System.out.println("------------------------------------------");

        for(String place : places) {
            System.out.println("Place Name: " + place);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deletePlace(int index) {
        System.out.println("Deleting the place at index: " + index);
        places[index] = null;
    }

    public void updatePlace(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the place at index: " + index);
            places[index] = name;
        } else {
            System.out.println("Please enter a valid place name.");
        }
    }
}