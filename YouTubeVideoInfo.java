class YouTubeVideoInfo{
	private int videoId;
	private String title;
	private String channelName;
	private String views;
	private String likes;
	private String uploadDate;
	private String status;

	public void setVideoId(int videoId){
		this.videoId=videoId;
	}
	public int getVideoId(){
		return this.videoId;
	}

	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}

	public void setChannelName(String channelName){
		this.channelName=channelName;
	}
	public String getChannelName(){
		return this.channelName;
	}

	public void setViews(String views){
		this.views=views;
	}
	public String getViews(){
		return this.views;
	}

	public void setLikes(String likes){
		this.likes=likes;
	}
	public String getLikes(){
		return this.likes;
	}

	public void setUploadDate(String uploadDate){
		this.uploadDate=uploadDate;
	}
	public String getUploadDate(){
		return this.uploadDate;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Video Id: "+this.videoId);
		System.out.println("Title: "+this.title);
		System.out.println("Channel: "+this.channelName);
		System.out.println("Views: "+this.views);
		System.out.println("Likes: "+this.likes);
		System.out.println("Upload Date: "+this.uploadDate);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}