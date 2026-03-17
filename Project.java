class Project {

    int projectId;
    String projectName;
    String technology;
	
	public Project(int projectId,String projectName,String technology){
		this.projectId=projectId;
		this.projectName=projectName;
		this.technology=technology;
		
	}

    public void getProjectDetail(){

        System.out.println("Project Details");
        System.out.println("Project Id: " + this.projectId);
        System.out.println("Project Name: " + this.projectName);
        System.out.println("Technology: " + this.technology);

    }
}