class CalendarExecutor{
	public static void main(String[] cal){
		
		Calendar calendar = new Calendar();
		
		calendar.calendarId =76;
		
		Day day = new Day();
		
		calendar.day = day;
		
		day.dayId =65;
		day.dayName = "Monday";
		
		
		calendar.getCalendarDetail();
		
		
	}
}