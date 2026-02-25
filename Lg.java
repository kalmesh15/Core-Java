class Lg{

    static String brand;
    static String model;
    static String capacity;
    static String type;
    static String energyRating;
    static String color;
    static String price;
    static String compressor;
    static String doorType;
    static String warranty;

    public static boolean createRefrigerator(String b, String m, String cap, String t, String rating, String col, String cost, String comp, String door, String war){

        boolean isCreateRefrigerator = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isEnergyValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isCompressorValid = false;
        boolean isDoorValid = false;
        boolean isWarrantyValid = false;

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
            isEnergyValid = true;
        }else{
            System.out.println("Energy rating is not valid....");
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

        if(comp != null && !comp.isEmpty()){
            System.out.println("Compressor is valid....");
            compressor = comp;
            isCompressorValid = true;
        }else{
            System.out.println("Compressor is not valid....");
        }

        if(door != null && !door.isEmpty()){
            System.out.println("Door type is valid....");
            doorType = door;
            isDoorValid = true;
        }else{
            System.out.println("Door type is not valid....");
        }

        if(war != null && !war.isEmpty()){
            System.out.println("Warranty is valid....");
            warranty = war;
            isWarrantyValid = true;
        }else{
            System.out.println("Warranty is not valid....");
        }

        if(isBrandValid && isModelValid && isCapacityValid && isTypeValid && isEnergyValid && isColorValid && isPriceValid && isCompressorValid && isDoorValid && isWarrantyValid){
            isCreateRefrigerator = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateRefrigerator;
    }

    public static void getRefrigeratorDetails(){
        System.out.println("......................................................");
        System.out.println("Refrigerator details are.....");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Compressor: " + compressor);
        System.out.println("Door Type: " + doorType);
        System.out.println("Warranty: " + warranty);
        System.out.println("......................................................");
    }
}