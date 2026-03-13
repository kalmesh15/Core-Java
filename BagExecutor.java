class BagExecutor {

    public static void main(String[] args) {

        Bag b1 = new Bag(1,20);
        System.out.println("The bag id is " + b1.id);
        System.out.println("The bag capacity is " + b1.capacity);

        Bag b2 = new Bag(1500.5,0.8);
        System.out.println("The bag price is " + b2.price);
        System.out.println("The bag weight is " + b2.weight);

        Bag b3 = new Bag("Skybags","Black","Travel");
        System.out.println("The bag brand is " + b3.brand);
        System.out.println("The bag color is " + b3.color);
        System.out.println("The bag type is " + b3.type);

        Bag b4 = new Bag(true,true);
        System.out.println("The bag waterproof status is " + b4.waterproof);
        System.out.println("The bag laptop compatibility is " + b4.laptopCompatible);

        Bag b5 = new Bag('A');
        System.out.println("The bag size grade is " + b5.sizeGrade);

        Bag b6 = new Bag(987654321L);
        System.out.println("The bag serial number is " + b6.serialNumber);

        Bag b7 = new Bag(12.5f);
        System.out.println("The bag discount is " + b7.discount);

    }
}