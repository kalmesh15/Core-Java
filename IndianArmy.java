class IndianArmy{
	private int soldierId;
	private String name;
	private String rank;
	private String unit;
	private String location;
	private String weapon;
	private String status;

	public void setSoldierId(int soldierId){ this.soldierId=soldierId; }
	public int getSoldierId(){ return this.soldierId; }

	public void setName(String name){ this.name=name; }
	public String getName(){ return this.name; }

	public void setRank(String rank){ this.rank=rank; }
	public String getRank(){ return this.rank; }

	public void setUnit(String unit){ this.unit=unit; }
	public String getUnit(){ return this.unit; }

	public void setLocation(String location){ this.location=location; }
	public String getLocation(){ return this.location; }

	public void setWeapon(String weapon){ this.weapon=weapon; }
	public String getWeapon(){ return this.weapon; }

	public void setStatus(String status){ this.status=status; }
	public String getStatus(){ return this.status; }

	public void printDetails(){
		System.out.println("Soldier Id: "+this.soldierId);
		System.out.println("Name: "+this.name);
		System.out.println("Rank: "+this.rank);
		System.out.println("Unit: "+this.unit);
		System.out.println("Location: "+this.location);
		System.out.println("Weapon: "+this.weapon);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}