class TraineeInfo{
	private int traineeId;
	private String name;
	private String course;
	private String trainerName;
	private String joiningDate;
	private String duration;
	private String status;

	public void setTraineeId(int traineeId){
		this.traineeId=traineeId;
	}
	public int getTraineeId(){
		return this.traineeId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setCourse(String course){
		this.course=course;
	}
	public String getCourse(){
		return this.course;
	}

	public void setTrainerName(String trainerName){
		this.trainerName=trainerName;
	}
	public String getTrainerName(){
		return this.trainerName;
	}

	public void setJoiningDate(String joiningDate){
		this.joiningDate=joiningDate;
	}
	public String getJoiningDate(){
		return this.joiningDate;
	}

	public void setDuration(String duration){
		this.duration=duration;
	}
	public String getDuration(){
		return this.duration;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Trainee Id: "+this.traineeId);
		System.out.println("Name: "+this.name);
		System.out.println("Course: "+this.course);
		System.out.println("Trainer Name: "+this.trainerName);
		System.out.println("Joining Date: "+this.joiningDate);
		System.out.println("Duration: "+this.duration);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}