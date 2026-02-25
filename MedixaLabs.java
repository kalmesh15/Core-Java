class MedixaLabs{

    static String medicineName;
    static String manufacturer;
    static String type;
    static String dosage;
    static String price;
    static String expiryDate;
    static String batchNumber;
    static String storage;

    public static boolean createMedicine(String name, String manu, String t, String dose, String cost, String exp, String batch, String store){

        boolean isCreateMedicine = false;

        boolean isNameValid = false;
        boolean isManufacturerValid = false;
        boolean isTypeValid = false;
        boolean isDosageValid = false;
        boolean isPriceValid = false;
        boolean isExpiryValid = false;
        boolean isBatchValid = false;
        boolean isStorageValid = false;

        if(name != null && !name.isEmpty()){
            System.out.println("Medicine name is valid....");
            medicineName = name;
            isNameValid = true;
        }else{
            System.out.println("Medicine name is not valid....");
        }

        if(manu != null && !manu.isEmpty()){
            System.out.println("Manufacturer is valid....");
            manufacturer = manu;
            isManufacturerValid = true;
        }else{
            System.out.println("Manufacturer is not valid....");
        }

        if(t != null && !t.isEmpty()){
            System.out.println("Type is valid....");
            type = t;
            isTypeValid = true;
        }else{
            System.out.println("Type is not valid....");
        }

        if(dose != null && !dose.isEmpty()){
            System.out.println("Dosage is valid....");
            dosage = dose;
            isDosageValid = true;
        }else{
            System.out.println("Dosage is not valid....");
        }

        if(cost != null && !cost.isEmpty()){
            System.out.println("Price is valid....");
            price = cost;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(exp != null && !exp.isEmpty()){
            System.out.println("Expiry date is valid....");
            expiryDate = exp;
            isExpiryValid = true;
        }else{
            System.out.println("Expiry date is not valid....");
        }

        if(batch != null && !batch.isEmpty()){
            System.out.println("Batch number is valid....");
            batchNumber = batch;
            isBatchValid = true;
        }else{
            System.out.println("Batch number is not valid....");
        }

        if(store != null && !store.isEmpty()){
            System.out.println("Storage is valid....");
            storage = store;
            isStorageValid = true;
        }else{
            System.out.println("Storage is not valid....");
        }

        if(isNameValid && isManufacturerValid && isTypeValid && isDosageValid && isPriceValid && isExpiryValid && isBatchValid && isStorageValid){
            isCreateMedicine = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateMedicine;
    }

    public static void getMedicine(){
        System.out.println("......................................................");
        System.out.println("Medicine details are.....");
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Type: " + type);
        System.out.println("Dosage: " + dosage);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Storage: " + storage);
        System.out.println("......................................................");
    }
}