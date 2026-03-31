class Marvel{
	private int characterId;
	private String name;
	private String power;
	private String team;
	private String movie;
	private String actor;
	private String status;

	public void setCharacterId(int characterId){
		this.characterId=characterId;
	}
	public int getCharacterId(){
		return this.characterId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setPower(String power){
		this.power=power;
	}
	public String getPower(){
		return this.power;
	}

	public void setTeam(String team){
		this.team=team;
	}
	public String getTeam(){
		return this.team;
	}

	public void setMovie(String movie){
		this.movie=movie;
	}
	public String getMovie(){
		return this.movie;
	}

	public void setActor(String actor){
		this.actor=actor;
	}
	public String getActor(){
		return this.actor;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Character Id: "+this.characterId);
		System.out.println("Name: "+this.name);
		System.out.println("Power: "+this.power);
		System.out.println("Team: "+this.team);
		System.out.println("Movie: "+this.movie);
		System.out.println("Actor: "+this.actor);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}