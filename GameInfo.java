class GameInfo{
	private int gameId;
	private String name;
	private String type;
	private String platform;
	private String releaseDate;
	private String rating;
	private String status;

	public void setGameId(int gameId){
		this.gameId=gameId;
	}
	public int getGameId(){
		return this.gameId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}

	public void setPlatform(String platform){
		this.platform=platform;
	}
	public String getPlatform(){
		return this.platform;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate=releaseDate;
	}
	public String getReleaseDate(){
		return this.releaseDate;
	}

	public void setRating(String rating){
		this.rating=rating;
	}
	public String getRating(){
		return this.rating;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Game Id: "+this.gameId);
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Platform: "+this.platform);
		System.out.println("Release Date: "+this.releaseDate);
		System.out.println("Rating: "+this.rating);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}