class Graveyard{
	private int graveId;
	private String name;
	private String location;
	private String type;
	private String establishedDate;
	private String capacity;
	private String status;

	public void setGraveId(int graveId){
		this.graveId=graveId;
	}
	public int getGraveId(){
		return this.graveId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setLocation(String location){
		this.location=location;
	}
	public String getLocation(){
		return this.location;
	}

	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}

	public void setEstablishedDate(String establishedDate){
		this.establishedDate=establishedDate;
	}
	public String getEstablishedDate(){
		return this.establishedDate;
	}

	public void setCapacity(String capacity){
		this.capacity=capacity;
	}
	public String getCapacity(){
		return this.capacity;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Grave Id: "+this.graveId);
		System.out.println("Name: "+this.name);
		System.out.println("Location: "+this.location);
		System.out.println("Type: "+this.type);
		System.out.println("Established Date: "+this.establishedDate);
		System.out.println("Capacity: "+this.capacity);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}