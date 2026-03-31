class Fertilizer{
	private int id;
	private String name;
	private String type;
	private String company;
	private String quantity;
	private String price;
	private String status;

	public void setId(int id){ this.id=id; }
	public int getId(){ return this.id; }

	public void setName(String name){ this.name=name; }
	public String getName(){ return this.name; }

	public void setType(String type){ this.type=type; }
	public String getType(){ return this.type; }

	public void setCompany(String company){ this.company=company; }
	public String getCompany(){ return this.company; }

	public void setQuantity(String quantity){ this.quantity=quantity; }
	public String getQuantity(){ return this.quantity; }

	public void setPrice(String price){ this.price=price; }
	public String getPrice(){ return this.price; }

	public void setStatus(String status){ this.status=status; }
	public String getStatus(){ return this.status; }

	public void printDetails(){
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Company: "+this.company);
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Price: "+this.price);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}