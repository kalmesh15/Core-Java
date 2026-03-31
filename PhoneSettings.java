class PhoneSettings{
	private int settingId;
	private String mode;
	private String brightness;
	private String volume;
	private String wifiStatus;
	private String bluetoothStatus;
	private String theme;

	public void setSettingId(int settingId){
		this.settingId=settingId;
	}
	public int getSettingId(){
		return this.settingId;
	}

	public void setMode(String mode){
		this.mode=mode;
	}
	public String getMode(){
		return this.mode;
	}

	public void setBrightness(String brightness){
		this.brightness=brightness;
	}
	public String getBrightness(){
		return this.brightness;
	}

	public void setVolume(String volume){
		this.volume=volume;
	}
	public String getVolume(){
		return this.volume;
	}

	public void setWifiStatus(String wifiStatus){
		this.wifiStatus=wifiStatus;
	}
	public String getWifiStatus(){
		return this.wifiStatus;
	}

	public void setBluetoothStatus(String bluetoothStatus){
		this.bluetoothStatus=bluetoothStatus;
	}
	public String getBluetoothStatus(){
		return this.bluetoothStatus;
	}

	public void setTheme(String theme){
		this.theme=theme;
	}
	public String getTheme(){
		return this.theme;
	}

	public void printDetails(){
		System.out.println("Setting Id: "+this.settingId);
		System.out.println("Mode: "+this.mode);
		System.out.println("Brightness: "+this.brightness);
		System.out.println("Volume: "+this.volume);
		System.out.println("WiFi: "+this.wifiStatus);
		System.out.println("Bluetooth: "+this.bluetoothStatus);
		System.out.println("Theme: "+this.theme);
		System.out.println("----------------------");
	}
}