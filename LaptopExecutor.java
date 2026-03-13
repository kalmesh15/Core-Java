class LaptopExecutor {

    public static void main(String[] args) {

        Laptop l1 = new Laptop(16,512);
        System.out.println("The laptop RAM is " + l1.ram);
        System.out.println("The laptop storage is " + l1.storage);

        Laptop l2 = new Laptop(75000.5,1.8);
        System.out.println("The laptop price is " + l2.price);
        System.out.println("The laptop weight is " + l2.weight);

        Laptop l3 = new Laptop("Dell","Intel i7","Silver");
        System.out.println("The laptop brand is " + l3.brand);
        System.out.println("The laptop processor is " + l3.processor);
        System.out.println("The laptop color is " + l3.color);

        Laptop l4 = new Laptop(true,true);
        System.out.println("The laptop touchscreen support is " + l4.touchscreen);
        System.out.println("The laptop gaming capability is " + l4.gaming);

        Laptop l5 = new Laptop('A');
        System.out.println("The laptop grade is " + l5.grade);

        Laptop l6 = new Laptop(987654321L);
        System.out.println("The laptop serial number is " + l6.serialNumber);

        Laptop l7 = new Laptop(10.5f);
        System.out.println("The laptop discount is " + l7.discount);

    }
}