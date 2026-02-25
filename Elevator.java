class Elevator{

    static String brand;
    static String capacity;
    static String speed;
    static String floors;
    static String type;
    static String power;
    static String safetySystem;

    public static boolean createElevator(String b, String cap, String sp, String fl, String t, String p, String safe){

        boolean isCreateElevator = false;

        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isSpeedValid = false;
        boolean isFloorsValid = false;
        boolean isTypeValid = false;
        boolean isPowerValid = false;
        boolean isSafetyValid = false;

        if(b != null && !b.isEmpty()){
            System.out.println("Brand is valid....");
            brand = b;
            isBrandValid = true;
        }else{
            System.out.println("Brand is not valid....");
        }

        if(cap != null && !cap.isEmpty()){
            System.out.println("Capacity is valid....");
            capacity = cap;
            isCapacityValid = true;
        }else{
            System.out.println("Capacity is not valid....");
        }

        if(sp != null && !sp.isEmpty()){
            System.out.println("Speed is valid....");
            speed = sp;
            isSpeedValid = true;
        }else{
            System.out.println("Speed is not valid....");
        }

        if(fl != null && !fl.isEmpty()){
            System.out.println("Floors is valid....");
            floors = fl;
            isFloorsValid = true;
        }else{
            System.out.println("Floors is not valid....");
        }

        if(t != null && !t.isEmpty()){
            System.out.println("Type is valid....");
            type = t;
            isTypeValid = true;
        }else{
            System.out.println("Type is not valid....");
        }

        if(p != null && !p.isEmpty()){
            System.out.println("Power is valid....");
            power = p;
            isPowerValid = true;
        }else{
            System.out.println("Power is not valid....");
        }

        if(safe != null && !safe.isEmpty()){
            System.out.println("Safety system is valid....");
            safetySystem = safe;
            isSafetyValid = true;
        }else{
            System.out.println("Safety system is not valid....");
        }

        if(isBrandValid && isCapacityValid && isSpeedValid && isFloorsValid && isTypeValid && isPowerValid && isSafetyValid){
            isCreateElevator = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateElevator;
    }

    public static void getElevatorDetails(){
        System.out.println("......................................................");
        System.out.println("Elevator details are.....");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed);
        System.out.println("Floors: " + floors);
        System.out.println("Type: " + type);
        System.out.println("Power: " + power);
        System.out.println("Safety System: " + safetySystem);
        System.out.println("......................................................");
    }
}