class ApplicationExecutor{
	public static void main(String[] ap){
		ApplicationInfo info = new ApplicationInfo();
		
		info.setAppId(1);
		info.setAppName("WhatsApp");
		info.setVersion("2.3V");
		info.setDownloads("5M+");
		info.setReleaseOn("22-10-2004");
		info.setUpdatedOn("30-03-2026");
		info.setInAppPurchase("40$");
		System.out.println("The app id is "+info.getAppId());
		System.out.println("The app name is "+info.getAppName());
		System.out.println("The app current version is "+info.getVersion());
		System.out.println("The app downloads are "+info.getDownloads());
		System.out.println("The app release on  "+info.getReleaseOn());
		System.out.println("The app Updated on  "+info.getUpdatedOn());
		System.out.println("The app in purchases are started from  "+info.getInAppPurchase());
	}
}