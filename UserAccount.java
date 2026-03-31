class UserAccount{
	private int userId;
	private String userName;
	private String email;
	private String password;
	private String phone;
	private String createdOn;
	private String status;

	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return this.userId;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getUserName(){
		return this.userName;
	}

	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return this.email;
	}

	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return this.phone;
	}

	public void setCreatedOn(String createdOn){
		this.createdOn=createdOn;
	}
	public String getCreatedOn(){
		return this.createdOn;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("User Id: " + this.userId);
		System.out.println("User Name: " + this.userName);
		System.out.println("Email: " + this.email);
		System.out.println("Phone: " + this.phone);
		System.out.println("Status: " + this.status);
		System.out.println("---------------------------");
	}
}