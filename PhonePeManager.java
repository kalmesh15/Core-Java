class PhonePeManager {

    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String insuranceName) {
        boolean isAdded = false;

        if(insuranceName != null && !insuranceName.isEmpty()) {
            if(index < this.insuranceNames.length) {
                this.insuranceNames[index++] = insuranceName;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid Insurance Name");
        }

        return isAdded;
    }

    public void getInsurance() {
        System.out.println("------ Insurance List ------");
        for(String s : insuranceNames) {
            System.out.println("Insurance: " + s);
        }
    }

    public void deleteInsurance(int index) {
        insuranceNames[index] = null;
    }

    public void updateInsurance(int index, String name) {
        if(name != null && !name.isEmpty()) {
            insuranceNames[index] = name;
        }
    }
}