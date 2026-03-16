class Element {

    int elementId;
    String elementName;
    String symbol;
    int atomicNumber;

    public void getElementDetail(){

        System.out.println("Element Details");
        System.out.println("Element Id: " + this.elementId);
        System.out.println("Element Name: " + this.elementName);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Atomic Number: " + this.atomicNumber);

    }
}