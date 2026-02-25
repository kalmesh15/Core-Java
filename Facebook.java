class Facebook{
	static String firstName;
	static String lastName;
	static String dateOfBirth;
	static String email;
	static String gender;
	static String password;
	
	
	public static boolean createAccount(String fName,String lName,String dob,String eId,String sex,String pswd){
		
		boolean isAccountCreated=false;
		boolean isfNameValid =false;
		boolean islNameValid =false;
		boolean isDobValid =false;
		boolean isEmailValid =false;
		boolean isSexValid =false;
		boolean isPasswordValid =false;
		
		if(fName !=null && !fName.isEmpty()){
			System.out.println("First Name validate....");
			firstName=fName;
			isfNameValid=true;
		}else{
			System.out.println("Invalid First Name....");
		}
		
		if(lName !=null && !lName.isEmpty()){
			System.out.println("Last Name validate....");
			lastName=lName;
			islNameValid=true;
		}else{
			System.out.println("Invalid Last Name....");
		}
		
		if(dob !=null && !dob.isEmpty()){
			System.out.println("Date of birth  validate....");
			dateOfBirth=dob;
			isDobValid=true;
		}else{
			System.out.println("Invalid Date of birth....");
		}
		
		if(eId !=null && !eId.isEmpty()){
			System.out.println("Email validate....");
			email=eId;
			isEmailValid=true;
		}else{
			System.out.println("Invalid Email....");
		}
		if(sex !=null && !sex.isEmpty()){
			System.out.println("Gender validate....");
			gender=sex;
			isSexValid=true;
		}else{
			System.out.println("Enter valid Gender....");
		}
		
		if(pswd !=null && !pswd.isEmpty()){
			System.out.println("password validate....");
			password=pswd;
			isPasswordValid=true;
		}else{
			System.out.println("Invalid Password....");
		}
		
		
		if(isfNameValid && islNameValid && isDobValid && isEmailValid && isSexValid && isPasswordValid){
			isAccountCreated = true;
		}else{
			System.out.println("Invalid credentials..");
		}
		return isAccountCreated;
	}
	
	
	
	
	public static void getAccontDetails(){
		System.out.println("Accont details are.....");
		System.out.println("User first name is "+firstName);
		System.out.println("User Last name is "+lastName);
		System.out.println("User date of Birth  is "+dateOfBirth);
		System.out.println("User Email  is "+email);
		System.out.println("User Gender is "+gender);
		System.out.println("User password is "+password);
		
		
		
	}


}