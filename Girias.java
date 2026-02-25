class Girias{

    static String brand;
    static String model;
    static String capacity;
    static String type;
    static String energyRating;
    static String spinSpeed;
    static String color;
    static String price;
    static String warranty;
    static String drumType;

    public static boolean createWashingMachine(String b, String m, String cap, String t, String rating, String spin, String col, String cost, String war, String drum){

        boolean isCreateWashingMachine = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isEnergyRatingValid = false;
        boolean isSpinSpeedValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isWarrantyValid = false;
        boolean isDrumTypeValid = false;

        if(b != null && !b.isEmpty()){
            System.out.println("Brand is valid....");
            brand = b;
            isBrandValid = true;
        }else{
            System.out.println("Brand is not valid....");
        }

        if(m != null && !m.isEmpty()){
            System.out.println("Model is valid....");
            model = m;
            isModelValid = true;
        }else{
            System.out.println("Model is not valid....");
        }

        if(cap != null && !cap.isEmpty()){
            System.out.println("Capacity is valid....");
            capacity = cap;
            isCapacityValid = true;
        }else{
            System.out.println("Capacity is not valid....");
        }

        if(t != null && !t.isEmpty()){
            System.out.println("Type is valid....");
            type = t;
            isTypeValid = true;
        }else{
            System.out.println("Type is not valid....");
        }

        if(rating != null && !rating.isEmpty()){
            System.out.println("Energy rating is valid....");
            energyRating = rating;
            isEnergyRatingValid = true;
        }else{
            System.out.println("Energy rating is not valid....");
        }

        if(spin != null && !spin.isEmpty()){
            System.out.println("Spin speed is valid....");
            spinSpeed = spin;
            isSpinSpeedValid = true;
        }else{
            System.out.println("Spin speed is not valid....");
        }

        if(col != null && !col.isEmpty()){
            System.out.println("Color is valid....");
            color = col;
            isColorValid = true;
        }else{
            System.out.println("Color is not valid....");
        }

        if(cost != null && !cost.isEmpty()){
            System.out.println("Price is valid....");
            price = cost;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(war != null && !war.isEmpty()){
            System.out.println("Warranty is valid....");
            warranty = war;
            isWarrantyValid = true;
        }else{
            System.out.println("Warranty is not valid....");
        }

        if(drum != null && !drum.isEmpty()){
            System.out.println("Drum type is valid....");
            drumType = drum;
            isDrumTypeValid = true;
        }else{
            System.out.println("Drum type is not valid....");
        }

        if(isBrandValid && isModelValid && isCapacityValid && isTypeValid && isEnergyRatingValid && isSpinSpeedValid && isColorValid && isPriceValid && isWarrantyValid && isDrumTypeValid){
            isCreateWashingMachine = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateWashingMachine;
    }

    public static void getWashingMachineDetails(){
        System.out.println("......................................................");
        System.out.println("Washing Machine details are.....");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Spin Speed: " + spinSpeed);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty);
        System.out.println("Drum Type: " + drumType);
        System.out.println("......................................................");
    }
}