class PlayStoreExecutor {

    public static void main(String[] args) {

        PlayStore ps1 = new PlayStore(1,"Google Play");
        Application a1 = new Application(101,"WhatsApp","Communication",4.5);
		ps1.application =a1;
		ps1.getPlayStoreDetail();
		
       /* ps1.storeId = 1;
        ps1.storeName = "Google Play";
        a1.appId = 101;
        a1.appName = "WhatsApp";
        a1.category = "Communication";
        a1.rating = 4.5;
        ps1.application = a1;
         */


        PlayStore ps2 = new PlayStore(2,"Google play");
        Application a2 = new Application(102,"Instagram","Social",4.3);
		ps2.application = a2;
        ps2.getPlayStoreDetail();
		
        /* ps2.storeId = 2;
        ps2.storeName = "Google Play";
        a2.appId = 102;
        a2.appName = "Instagram";
        a2.category = "Social";
        a2.rating = 4.4; */
        


        PlayStore ps3 = new PlayStore(3,"Google Play");
        Application a3 = new Application(103,"Facebook","Social",4.1);
		
        /*ps3.storeId = 3;
        ps3.storeName = "Google Play";
        a3.appId = 103;
        a3.appName = "Facebook";
        a3.category = "Social";
        a3.rating = 4.1;*/
        ps3.application = a3;
        ps3.getPlayStoreDetail();


        PlayStore ps4 = new PlayStore(4,"Google Play");
        Application a4 = new Application(104, "Telegram","Communication",4.3);
		
        /*ps4.storeId = 4;
        ps4.storeName = "Google Play";
        a4.appId = 104;
        a4.appName = "Telegram";
        a4.category = "Communication";
        a4.rating = 4.6;*/
		
        ps4.application = a4;
        ps4.getPlayStoreDetail();


        PlayStore ps5 = new PlayStore(5,"Google Play");
        Application a5 = new Application(105,"Snapchat","Social",3.5);
        /*ps5.storeId = 5;
        ps5.storeName = "Google Play";
        a5.appId = 105;
        a5.appName = "Snapchat";
        a5.category = "Social";
        a5.rating = 4.2;*/
        ps5.application = a5;
        ps5.getPlayStoreDetail();


        /* PlayStore ps6 = new PlayStore();
        Application a6 = new Application();
        ps6.storeId = 6;
        ps6.storeName = "Google Play";
        a6.appId = 106;
        a6.appName = "YouTube";
        a6.category = "Video";
        a6.rating = 4.7;
        ps6.application = a6;
        ps6.getPlayStoreDetail();


        PlayStore ps7 = new PlayStore();
        Application a7 = new Application();
        ps7.storeId = 7;
        ps7.storeName = "Google Play";
        a7.appId = 107;
        a7.appName = "Spotify";
        a7.category = "Music";
        a7.rating = 4.5;
        ps7.application = a7;
        ps7.getPlayStoreDetail();


        PlayStore ps8 = new PlayStore();
        Application a8 = new Application();
        ps8.storeId = 8;
        ps8.storeName = "Google Play";
        a8.appId = 108;
        a8.appName = "Amazon";
        a8.category = "Shopping";
        a8.rating = 4.3;
        ps8.application = a8;
        ps8.getPlayStoreDetail();


        PlayStore ps9 = new PlayStore();
        Application a9 = new Application();
        ps9.storeId = 9;
        ps9.storeName = "Google Play";
        a9.appId = 109;
        a9.appName = "Flipkart";
        a9.category = "Shopping";
        a9.rating = 4.3;
        ps9.application = a9;
        ps9.getPlayStoreDetail();


        PlayStore ps10 = new PlayStore();
        Application a10 = new Application();
        ps10.storeId = 10;
        ps10.storeName = "Google Play";
        a10.appId = 110;
        a10.appName = "Swiggy";
        a10.category = "Food";
        a10.rating = 4.4;
        ps10.application = a10;
        ps10.getPlayStoreDetail();


        PlayStore ps11 = new PlayStore();
        Application a11 = new Application();
        ps11.storeId = 11;
        ps11.storeName = "Google Play";
        a11.appId = 111;
        a11.appName = "Zomato";
        a11.category = "Food";
        a11.rating = 4.3;
        ps11.application = a11;
        ps11.getPlayStoreDetail();


        PlayStore ps12 = new PlayStore();
        Application a12 = new Application();
        ps12.storeId = 12;
        ps12.storeName = "Google Play";
        a12.appId = 112;
        a12.appName = "Uber";
        a12.category = "Transport";
        a12.rating = 4.2;
        ps12.application = a12;
        ps12.getPlayStoreDetail();


        PlayStore ps13 = new PlayStore();
        Application a13 = new Application();
        ps13.storeId = 13;
        ps13.storeName = "Google Play";
        a13.appId = 113;
        a13.appName = "Ola";
        a13.category = "Transport";
        a13.rating = 4.1;
        ps13.application = a13;
        ps13.getPlayStoreDetail();


        PlayStore ps14 = new PlayStore();
        Application a14 = new Application();
        ps14.storeId = 14;
        ps14.storeName = "Google Play";
        a14.appId = 114;
        a14.appName = "Paytm";
        a14.category = "Finance";
        a14.rating = 4.2;
        ps14.application = a14;
        ps14.getPlayStoreDetail();


        PlayStore ps15 = new PlayStore();
        Application a15 = new Application();
        ps15.storeId = 15;
        ps15.storeName = "Google Play";
        a15.appId = 115;
        a15.appName = "PhonePe";
        a15.category = "Finance";
        a15.rating = 4.5;
        ps15.application = a15;
        ps15.getPlayStoreDetail();


        PlayStore ps16 = new PlayStore();
        Application a16 = new Application();
        ps16.storeId = 16;
        ps16.storeName = "Google Play";
        a16.appId = 116;
        a16.appName = "Google Maps";
        a16.category = "Navigation";
        a16.rating = 4.6;
        ps16.application = a16;
        ps16.getPlayStoreDetail();


        PlayStore ps17 = new PlayStore();
        Application a17 = new Application();
        ps17.storeId = 17;
        ps17.storeName = "Google Play";
        a17.appId = 117;
        a17.appName = "Gmail";
        a17.category = "Email";
        a17.rating = 4.6;
        ps17.application = a17;
        ps17.getPlayStoreDetail();


        PlayStore ps18 = new PlayStore();
        Application a18 = new Application();
        ps18.storeId = 18;
        ps18.storeName = "Google Play";
        a18.appId = 118;
        a18.appName = "Google Drive";
        a18.category = "Productivity";
        a18.rating = 4.5;
        ps18.application = a18;
        ps18.getPlayStoreDetail();


        PlayStore ps19 = new PlayStore();
        Application a19 = new Application();
        ps19.storeId = 19;
        ps19.storeName = "Google Play";
        a19.appId = 119;
        a19.appName = "Zoom";
        a19.category = "Meeting";
        a19.rating = 4.4;
        ps19.application = a19;
        ps19.getPlayStoreDetail();


        PlayStore ps20 = new PlayStore();
        Application a20 = new Application();
        ps20.storeId = 20;
        ps20.storeName = "Google Play";
        a20.appId = 120;
        a20.appName = "Netflix";
        a20.category = "Entertainment";
        a20.rating = 4.6;
        ps20.application = a20;
        ps20.getPlayStoreDetail();
              */
    }
}