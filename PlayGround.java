class PlayGround{
	private int groundId;
	private String name;
	private String location;
	private String type;
	private String capacity;
	private String openedDate;
	private String status;

	public void setGroundId(int groundId){
		this.groundId=groundId;
	}
	public int getGroundId(){
		return this.groundId;
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

	public void setCapacity(String capacity){
		this.capacity=capacity;
	}
	public String getCapacity(){
		return this.capacity;
	}

	public void setOpenedDate(String openedDate){
		this.openedDate=openedDate;
	}
	public String getOpenedDate(){
		return this.openedDate;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Ground Id: "+this.groundId);
		System.out.println("Name: "+this.name);
		System.out.println("Location: "+this.location);
		System.out.println("Type: "+this.type);
		System.out.println("Capacity: "+this.capacity);
		System.out.println("Opened Date: "+this.openedDate);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}