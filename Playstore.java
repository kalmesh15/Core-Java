class Playstore{

    static String appName;
    static String developer;
    static String category;
    static String rating;
    static String downloads;
    static String size;
    static String version;
    static String price;

    public static boolean createApp(String name, String dev, String cat, String rate, String down, String sizeMb, String ver, String cost){

        boolean isCreateApp = false;

        boolean isNameValid = false;
        boolean isDeveloperValid = false;
        boolean isCategoryValid = false;
        boolean isRatingValid = false;
        boolean isDownloadsValid = false;
        boolean isSizeValid = false;
        boolean isVersionValid = false;
        boolean isPriceValid = false;

        if(name != null && !name.isEmpty()){
            System.out.println("App name is valid....");
            appName = name;
            isNameValid = true;
        }else{
            System.out.println("App name is not valid....");
        }

        if(dev != null && !dev.isEmpty()){
            System.out.println("Developer is valid....");
            developer = dev;
            isDeveloperValid = true;
        }else{
            System.out.println("Developer is not valid....");
        }

        if(cat != null && !cat.isEmpty()){
            System.out.println("Category is valid....");
            category = cat;
            isCategoryValid = true;
        }else{
            System.out.println("Category is not valid....");
        }

        if(rate != null && !rate.isEmpty()){
            System.out.println("Rating is valid....");
            rating = rate;
            isRatingValid = true;
        }else{
            System.out.println("Rating is not valid....");
        }

        if(down != null && !down.isEmpty()){
            System.out.println("Downloads are valid....");
            downloads = down;
            isDownloadsValid = true;
        }else{
            System.out.println("Downloads are not valid....");
        }

        if(sizeMb != null && !sizeMb.isEmpty()){
            System.out.println("Size is valid....");
            size = sizeMb;
            isSizeValid = true;
        }else{
            System.out.println("Size is not valid....");
        }

        if(ver != null && !ver.isEmpty()){
            System.out.println("Version is valid....");
            version = ver;
            isVersionValid = true;
        }else{
            System.out.println("Version is not valid....");
        }

        if(cost != null && !cost.isEmpty()){
            System.out.println("Price is valid....");
            price = cost;
            isPriceValid = true;
        }else{
            System.out.println("Price is not valid....");
        }

        if(isNameValid && isDeveloperValid && isCategoryValid && isRatingValid && isDownloadsValid && isSizeValid && isVersionValid && isPriceValid){
            isCreateApp = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateApp;
    }

    public static void getAppDetails(){
        System.out.println("......................................................");
        System.out.println("App details are.....");
        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
        System.out.println("Downloads: " + downloads);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("Price: " + price);
        System.out.println("......................................................");
    }
}