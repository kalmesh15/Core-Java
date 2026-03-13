class MobilePhoneExecutor {

    public static void main(String[] args) {

        MobilePhone m1 = new MobilePhone(101,128);
        System.out.println("The mobile id is " + m1.id);
        System.out.println("The mobile storage is " + m1.storage);

        MobilePhone m2 = new MobilePhone(25000.5,6.5);
        System.out.println("The mobile price is " + m2.price);
        System.out.println("The mobile screen size is " + m2.screenSize);

        MobilePhone m3 = new MobilePhone("Samsung","Galaxy S23","Black");
        System.out.println("The mobile brand is " + m3.brand);
        System.out.println("The mobile model is " + m3.model);
        System.out.println("The mobile color is " + m3.color);

        MobilePhone m4 = new MobilePhone(true,true);
        System.out.println("The mobile dual sim support is " + m4.dualSim);
        System.out.println("The mobile 5G support is " + m4.supports5G);

        MobilePhone m5 = new MobilePhone('A');
        System.out.println("The mobile grade is " + m5.grade);

        MobilePhone m6 = new MobilePhone(987654321012345L);
        System.out.println("The mobile IMEI number is " + m6.imeiNumber);

        MobilePhone m7 = new MobilePhone(5000.0f);
        System.out.println("The mobile battery capacity is " + m7.batteryCapacity);

    }
}