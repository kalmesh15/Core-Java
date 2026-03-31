class BroadCastDetails{
	private int id;
	private String channel;
	private String program;
	private String time;
	private String language;
	private String host;
	private String status;

	public void setId(int id){ this.id=id; }
	public int getId(){ return this.id; }

	public void setChannel(String channel){ this.channel=channel; }
	public String getChannel(){ return this.channel; }

	public void setProgram(String program){ this.program=program; }
	public String getProgram(){ return this.program; }

	public void setTime(String time){ this.time=time; }
	public String getTime(){ return this.time; }

	public void setLanguage(String language){ this.language=language; }
	public String getLanguage(){ return this.language; }

	public void setHost(String host){ this.host=host; }
	public String getHost(){ return this.host; }

	public void setStatus(String status){ this.status=status; }
	public String getStatus(){ return this.status; }

	public void printDetails(){
		System.out.println("Id: "+this.id);
		System.out.println("Channel: "+this.channel);
		System.out.println("Program: "+this.program);
		System.out.println("Time: "+this.time);
		System.out.println("Language: "+this.language);
		System.out.println("Host: "+this.host);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}