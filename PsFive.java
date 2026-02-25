class PsFive{

    static String consoleName;
    static String brand;
    static String storageCapacity;
    static String resolution;
    static String price;
    static String controllerType;
    static String color;
    static String processor;
    static String ram;
    static String warranty;

    public static boolean createPsFive(String name, String brandName, String storage, String res, String cost, String controller, String colour, String cpu, String memory, String warrantyPeriod){

        boolean isCreatePsFive = false;

        boolean isNameValid = false;
        boolean isBrandValid = false;
        boolean isStorageValid = false;
        boolean isResolutionValid = false;
        boolean isPriceValid = false;
        boolean isControllerValid = false;
        boolean isColorValid = false;
        boolean isProcessorValid = false;
        boolean isRamValid = false;
        boolean isWarrantyValid = false;

        if(name != null && !name.isEmpty()){
            System.out.println("Console name is valid....");
            consoleName = name;
            isNameValid = true;
        }else{
            System.out.println("Console name is not valid....");
        }

        if(brandName != null && !brandName.isEmpty()){
            System.out.println("Brand is valid....");
            brand = brandName;
            isBrandValid = true;
        }else{
            System.out.println("Brand is not valid....");
        }

        if(storage != null && !storage.isEmpty()){
            System.out.println("Storage is valid....");
            storageCapacity = storage;
            isStorageValid = true;
        }else{
            System.out.println("Storage is not valid....");
        }

        if(res != null && !res.isEmpty()){
            System.out.println("Resolution is valid....");
            resolution = res;
            isResolutionValid = true;
        }else{
            System.out.println("Resolution is not valid....");
        }

        if(cost != null && !cost.isEmpty()){
            System.out.println("Price is valid....");
            price = cost;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(controller != null && !controller.isEmpty()){
            System.out.println("Controller type is valid....");
            controllerType = controller;
            isControllerValid = true;
        }else{
            System.out.println("Controller type is not valid....");
        }

        if(colour != null && !colour.isEmpty()){
            System.out.println("Color is valid....");
            color = colour;
            isColorValid = true;
        }else{
            System.out.println("Color is not valid....");
        }

        if(cpu != null && !cpu.isEmpty()){
            System.out.println("Processor is valid....");
            processor = cpu;
            isProcessorValid = true;
        }else{
            System.out.println("Processor is not valid....");
        }

        if(memory != null && !memory.isEmpty()){
            System.out.println("RAM is valid....");
            ram = memory;
            isRamValid = true;
        }else{
            System.out.println("RAM is not valid....");
        }

        if(warrantyPeriod != null && !warrantyPeriod.isEmpty()){
            System.out.println("Warranty is valid....");
            warranty = warrantyPeriod;
            isWarrantyValid = true;
        }else{
            System.out.println("Warranty is not valid....");
        }

        if(isNameValid && isBrandValid && isStorageValid && isResolutionValid && isPriceValid && isControllerValid && isColorValid && isProcessorValid && isRamValid && isWarrantyValid){
            isCreatePsFive = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreatePsFive;
    }

    public static void getPsFiveDetails(){
        System.out.println("......................................................");
        System.out.println("PS5 details are.....");
        System.out.println("Console Name: " + consoleName);
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storageCapacity);
        System.out.println("Resolution: " + resolution);
        System.out.println("Price: " + price);
        System.out.println("Controller: " + controllerType);
        System.out.println("Color: " + color);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Warranty: " + warranty);
        System.out.println("......................................................");
    }
}