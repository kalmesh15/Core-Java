class PeriodicTable {

    int tableId;
    String tableName;

    Element element;

    public void getPeriodicTableDetail(){

        System.out.println("--------------------------------");
        System.out.println("Periodic Table Details");
        System.out.println("Table Id: " + this.tableId);
        System.out.println("Table Name: " + this.tableName);

        this.element.getElementDetail();

    }
}