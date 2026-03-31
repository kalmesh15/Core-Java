class Nasa{
	private int missionId;
	private String missionName;
	private String launchDate;
	private String rocket;
	private String destination;
	private String crew;
	private String status;

	public void setMissionId(int missionId){
		this.missionId=missionId;
	}
	public int getMissionId(){
		return this.missionId;
	}

	public void setMissionName(String missionName){
		this.missionName=missionName;
	}
	public String getMissionName(){
		return this.missionName;
	}

	public void setLaunchDate(String launchDate){
		this.launchDate=launchDate;
	}
	public String getLaunchDate(){
		return this.launchDate;
	}

	public void setRocket(String rocket){
		this.rocket=rocket;
	}
	public String getRocket(){
		return this.rocket;
	}

	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return this.destination;
	}

	public void setCrew(String crew){
		this.crew=crew;
	}
	public String getCrew(){
		return this.crew;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Mission Id: "+this.missionId);
		System.out.println("Mission Name: "+this.missionName);
		System.out.println("Launch Date: "+this.launchDate);
		System.out.println("Rocket: "+this.rocket);
		System.out.println("Destination: "+this.destination);
		System.out.println("Crew: "+this.crew);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}