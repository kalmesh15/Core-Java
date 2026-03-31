class Player{
	private int playerId;
	private String name;
	private String team;
	private String role;
	private String matches;
	private String runs;
	private String status;

	public void setPlayerId(int playerId){
		this.playerId=playerId;
	}
	public int getPlayerId(){
		return this.playerId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setTeam(String team){
		this.team=team;
	}
	public String getTeam(){
		return this.team;
	}

	public void setRole(String role){
		this.role=role;
	}
	public String getRole(){
		return this.role;
	}

	public void setMatches(String matches){
		this.matches=matches;
	}
	public String getMatches(){
		return this.matches;
	}

	public void setRuns(String runs){
		this.runs=runs;
	}
	public String getRuns(){
		return this.runs;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Player Id: "+this.playerId);
		System.out.println("Name: "+this.name);
		System.out.println("Team: "+this.team);
		System.out.println("Role: "+this.role);
		System.out.println("Matches: "+this.matches);
		System.out.println("Runs: "+this.runs);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}