class MedixaLabsRunner{
    public static void main(String[] args){

        boolean isCreate;

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","500mg","50","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine(null,"Cipla","Tablet","500mg","50","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","","Tablet","500mg","50","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","","500mg","50","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","","50","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","500mg","","12/2026","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","500mg","50","","B123","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","500mg","50","12/2026","","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Paracetamol","Cipla","Tablet","500mg","50","12/2026","B123","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine(null,null,null,null,null,null,null,null);
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Dolo","MicroLabs","Tablet","650mg","60","11/2026","B456","RoomTemp");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Azithromycin","Sun","Capsule","250mg","120","10/2026","B789","Dry");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Test","Test","Test","Test","Test","Test","Test","Test");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Ibuprofen","Abbott","Tablet","400mg","80","09/2026","B999","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Amoxicillin","Cipla","Capsule","500mg","90","08/2026","B222","Dry");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Cetirizine","Sun","Tablet","10mg","30","07/2026","B333","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Aspirin","Bayer","Tablet","75mg","40","06/2026","B444","Dry");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("VitaminC","HealthCorp","Tablet","500mg","100","05/2026","B555","Cool");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Zinc","Nutra","Tablet","50mg","70","04/2026","B666","Dry");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("Insulin","Novo","Injection","10ml","500","03/2026","B777","Cold");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

        isCreate = MedixaLabs.createMedicine("","","","","","","","");
        if(isCreate){
            MedixaLabs.getMedicine();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}