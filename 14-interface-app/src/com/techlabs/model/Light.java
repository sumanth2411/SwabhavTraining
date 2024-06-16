package com.techlabs.model;

public class Light implements SmartDevice,Controllable {
	private String deviceID;
    private String name;
    private boolean on;

	public Light(String deviceID, String name) {
		super();
		this.deviceID = deviceID;
		this.name = name;
		this.on = false;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		on=true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		on=false;
	}

	@Override
	public String getDeviceID() {
		// TODO Auto-generated method stub
		return deviceID;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return on;
	}

	@Override
	public String toString() {
		return "Light [deviceID=" + deviceID + ", name=" + name + ", on=" + on + "]";
	}
	
	

}
