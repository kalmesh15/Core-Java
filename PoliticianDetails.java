class PoliticianDetails{
	private int politicianId;
	private String name;
	private String party;
	private String constituency;
	private String age;
	private String position;
	private String status;

	public void setPoliticianId(int politicianId){
		this.politicianId=politicianId;
	}
	public int getPoliticianId(){
		return this.politicianId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setParty(String party){
		this.party=party;
	}
	public String getParty(){
		return this.party;
	}

	public void setConstituency(String constituency){
		this.constituency=constituency;
	}
	public String getConstituency(){
		return this.constituency;
	}

	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return this.age;
	}

	public void setPosition(String position){
		this.position=position;
	}
	public String getPosition(){
		return this.position;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Politician Id: "+this.politicianId);
		System.out.println("Name: "+this.name);
		System.out.println("Party: "+this.party);
		System.out.println("Constituency: "+this.constituency);
		System.out.println("Age: "+this.age);
		System.out.println("Position: "+this.position);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}