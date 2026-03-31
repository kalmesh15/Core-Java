class TicketDetails{
	private int ticketId;
	private String passengerName;
	private String source;
	private String destination;
	private String travelDate;
	private String seatNumber;
	private String status;

	public void setTicketId(int ticketId){
		this.ticketId=ticketId;
	}
	public int getTicketId(){
		return this.ticketId;
	}

	public void setPassengerName(String passengerName){
		this.passengerName=passengerName;
	}
	public String getPassengerName(){
		return this.passengerName;
	}

	public void setSource(String source){
		this.source=source;
	}
	public String getSource(){
		return this.source;
	}

	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return this.destination;
	}

	public void setTravelDate(String travelDate){
		this.travelDate=travelDate;
	}
	public String getTravelDate(){
		return this.travelDate;
	}

	public void setSeatNumber(String seatNumber){
		this.seatNumber=seatNumber;
	}
	public String getSeatNumber(){
		return this.seatNumber;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Ticket Id: "+this.ticketId);
		System.out.println("Passenger Name: "+this.passengerName);
		System.out.println("Source: "+this.source);
		System.out.println("Destination: "+this.destination);
		System.out.println("Travel Date: "+this.travelDate);
		System.out.println("Seat Number: "+this.seatNumber);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}