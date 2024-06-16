package com.techlabs.model;

public class SecurityCamera implements SmartDevice,Monitorable {
	private String deviceID;
    private String name;
    private boolean recording;
    
    

	public SecurityCamera(String deviceID, String name) {
		super();
		this.deviceID = deviceID;
		this.name = name;
		this.recording = false;
	}

	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return "SecurityCamera [Recording=" + (recording ? "Yes" : "No") + "]";
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
		return recording;
	}
	
	public void startRecording() {
        recording = true;
    }

    public void stopRecording() {
        recording = false;
    }

	@Override
	public String toString() {
		return "SecurityCamera [deviceID=" + deviceID + ", name=" + name + ", recording=" + recording + "]";
	}
	
    

}
