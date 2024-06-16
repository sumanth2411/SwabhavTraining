package com.techlabs.model;

public class Thermostat implements SmartDevice,Controllable,Monitorable {
	private String deviceID;
    private String name;
    private boolean on;
    private double temperature;
    

	public Thermostat(String deviceID, String name,double initialTemperature) {
		super();
		this.deviceID = deviceID;
		this.name = name;
		this.on = false;
		this.temperature = initialTemperature;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "Thermostat [Temperature=" + temperature + "]";
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		on = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		on = false;
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

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return on;
	}

	@Override
	public String toString() {
		return "Thermostat [deviceID=" + deviceID + ", name=" + name + ", on=" + on + ", temperature=" + temperature
				+ "]";
	}
	
	

}
