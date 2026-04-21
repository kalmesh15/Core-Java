class SunscreamExecutor {

    public static void main(String[] args) {

        Sunscream s1 = new Sunscream();
        s1.display();

        System.out.println("----------------------");

        Sunscream s2 = new Sunscream(2, "Ultra SPF70", "Lakme", "Oily Skin", 450.0, 30, "01-03-2024", "01-03-2028", 70, "Gel", "Lakme India", "India", "Tube", "External", 4.8, true, true, 120.0, "Women", "Store in cool place");
        s2.display();
    }
}