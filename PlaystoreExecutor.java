class PlaystoreExecutor{
    public static void main(String[] args){

        boolean isAppCreate;

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","4.5","5B","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp(null,"Meta","Communication","4.5","5B","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","","Communication","4.5","5B","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","","4.5","5B","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","","5B","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","4.5","","50MB","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","4.5","5B","","2.23","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","4.5","5B","50MB","","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("WhatsApp","Meta","Communication","4.5","5B","50MB","2.23","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("","","","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp(null,null,null,null,null,null,null,null);
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Instagram","Meta","Social","4.6","2B","60MB","3.1","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("YouTube","Google","Video","4.7","10B","70MB","18.2","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Maps","Google","Navigation","4.3","5B","100MB","11.0","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Spotify","Spotify","Music","4.5","1B","80MB","9.0","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("","","Communication","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp(null,"Meta","","4.5","",null,"","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("App","Dev","Cat","Rate","Down","Size","Ver","Cost");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("","","","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Game","Dev","","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Tool","Dev","Utility","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp(null,"","","","","","","");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Mail","Google","Communication","4.2","5B","30MB","10.1","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Drive","Google","Storage","4.4","5B","40MB","11.2","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Docs","Google","Productivity","4.3","1B","35MB","12.0","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Sheets","Google","Productivity","4.2","1B","33MB","12.1","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isAppCreate = Playstore.createApp("Slides","Google","Productivity","4.1","1B","32MB","12.2","Free");
        if(isAppCreate){
            Playstore.getAppDetails();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}