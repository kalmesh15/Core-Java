class PenExecutor {

    public static void main(String[] args) {

        Pen p1 = new Pen(1,80);
        System.out.println("The pen id is " + p1.id);
        System.out.println("The pen ink level is " + p1.inkLevel);

        Pen p2 = new Pen(25.5,14.2);
        System.out.println("The pen price is " + p2.price);
        System.out.println("The pen length is " + p2.length);

        Pen p3 = new Pen("Reynolds","Blue","Ballpoint");
        System.out.println("The pen brand is " + p3.brand);
        System.out.println("The pen color is " + p3.color);
        System.out.println("The pen type is " + p3.type);

        Pen p4 = new Pen(true,true);
        System.out.println("The pen refillable status is " + p4.refillable);
        System.out.println("The pen waterproof status is " + p4.waterproof);

        Pen p5 = new Pen('A');
        System.out.println("The pen grade is " + p5.grade);

        Pen p6 = new Pen(456789123L);
        System.out.println("The pen serial number is " + p6.serialNumber);

        Pen p7 = new Pen(5.5f);
        System.out.println("The pen discount is " + p7.discount);

    }
}