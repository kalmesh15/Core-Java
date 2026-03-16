class Calendar{
	
	int calendarId;
	
	Day day;
	
	
	
	
	public void getCalendarDetail(){
		System.out.println("---------------------------");
		System.out.println("Calendar Details ");
		System.out.println("Calendar id is  "+calendarId);
		
		this.day.getDayDetail();
	}
}