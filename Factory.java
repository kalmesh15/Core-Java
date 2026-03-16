class Factory {

    int factoryId;
    String factoryName;

    Machine machine;

    public void getFactoryDetail(){

        System.out.println("--------------------------------");
        System.out.println("Factory Details");
        System.out.println("Factory Id: " + this.factoryId);
        System.out.println("Factory Name: " + this.factoryName);

        this.machine.getMachineDetail();

    }
}