class Forever24Executor{
    public static void main(String[] args){

        boolean isCreate;

        isCreate = Forever24.createCloth("Tshirt","Zara","M","Black","Casual","Cotton","999","Men","Solid","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth(null,"Zara","M","Black","Casual","Cotton","999","Men","Solid","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Tshirt","","M","Black","Casual","Cotton","999","Men","Solid","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Tshirt","Zara","","Black","Casual","Cotton","999","Men","Solid","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Tshirt","Zara","M","","Casual","Cotton","999","Men","Solid","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("","","","","","","","","","","","");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth(null,null,null,null,null,null,null,null,null,null,null,null);
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Jeans","Levis","L","Blue","Denim","Cotton","1999","Men","Plain","Slim","AllSeason","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Shirt","H&M","S","White","Formal","Linen","1499","Men","Striped","Regular","Summer","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Dress","Zara","M","Red","Party","Silk","2999","Women","Floral","Slim","Winter","OutStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("","","","","","","","","","","","");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Jacket","Puma","XL","Black","Winter","Leather","3999","Men","Solid","Regular","Winter","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Kurta","FabIndia","L","Green","Ethnic","Cotton","1299","Men","Printed","Regular","Festive","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("","","","","","","","","","","","");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Hoodie","Nike","M","Grey","Casual","Fleece","2499","Men","Solid","Loose","Winter","InStock");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("","","","","","","","","","","","");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = Forever24.createCloth("Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test","Test");
        if(isCreate){
            Forever24.getCloth();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}