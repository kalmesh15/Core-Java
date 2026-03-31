class GpsDetails{
	private int gpsId;
	private String deviceName;
	private String latitude;
	private String longitude;
	private String locationName;
	private String lastUpdated;
	private String status;

	public void setGpsId(int gpsId){
		this.gpsId=gpsId;
	}
	public int getGpsId(){
		return this.gpsId;
	}

	public void setDeviceName(String deviceName){
		this.deviceName=deviceName;
	}
	public String getDeviceName(){
		return this.deviceName;
	}

	public void setLatitude(String latitude){
		this.latitude=latitude;
	}
	public String getLatitude(){
		return this.latitude;
	}

	public void setLongitude(String longitude){
		this.longitude=longitude;
	}
	public String getLongitude(){
		return this.longitude;
	}

	public void setLocationName(String locationName){
		this.locationName=locationName;
	}
	public String getLocationName(){
		return this.locationName;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated=lastUpdated;
	}
	public String getLastUpdated(){
		return this.lastUpdated;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("GPS Id: "+this.gpsId);
		System.out.println("Device Name: "+this.deviceName);
		System.out.println("Latitude: "+this.latitude);
		System.out.println("Longitude: "+this.longitude);
		System.out.println("Location Name: "+this.locationName);
		System.out.println("Last Updated: "+this.lastUpdated);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}