class Cloth{
	private int clothId;
	private String name;
	private String type;
	private String size;
	private String color;
	private String price;
	private String status;

	public void setClothId(int clothId){
		this.clothId=clothId;
	}
	public int getClothId(){
		return this.clothId;
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

	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return this.size;
	}

	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return this.price;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Cloth Id: "+this.clothId);
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Size: "+this.size);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}