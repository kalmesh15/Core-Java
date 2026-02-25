class LgExecutor{
    public static void main(String[] args){

        boolean isCreate;

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator(null,"GL-T292","260L","Double Door","5 Star","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","","260L","Double Door","5 Star","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","","Double Door","5 Star","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","","5 Star","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","","Silver","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","","30000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","Silver","","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","Silver","30000","","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","Silver","30000","Inverter","","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("LG","GL-T292","260L","Double Door","5 Star","Silver","30000","Inverter","Double","");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("","","","","","","","","","");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator(null,null,null,null,null,null,null,null,null,null);
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("Samsung","RT28","253L","Double Door","4 Star","Black","28000","Digital","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("Whirlpool","IF305","300L","Double Door","5 Star","Grey","32000","Inverter","Double","1Y");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("","","","","","","","","","");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Lg.createRefrigerator("Test","Test","Test","Test","Test","Test","Test","Test","Test","Test");
        if(isCreate){
            Lg.getRefrigeratorDetails();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}