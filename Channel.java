class Channel {

    int channelId;
    String channelName;
    String category;
	
	public Channel(int channelId,String channelName,String category){
		this.channelId=channelId;
		this.channelName=channelName;
		this.category=category;
	}

    public void getChannelDetail() {

        System.out.println("Channel Details");
        System.out.println("Channel Id: " + this.channelId);
        System.out.println("Channel Name: " + this.channelName);
        System.out.println("Category: " + this.category);

    }
}