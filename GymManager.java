class GymManager {

    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment) {
        boolean isAdded = false;

        if(equipment != null && !equipment.isEmpty()) {
            if(index < this.equipments.length) {
                this.equipments[index++] = equipment;
                isAdded = true;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Invalid Equipment Name");
        }

        return isAdded;
    }

    public void getEquipments() {
        System.out.println("------ Gym Equipments ------");
        for(String e : equipments) {
            System.out.println("Equipment: " + e);
        }
    }

    public void deleteEquipment(int index) {
        equipments[index] = null;
    }

    public void updateEquipment(int index, String name) {
        if(name != null && !name.isEmpty()) {
            equipments[index] = name;
        }
    }
}