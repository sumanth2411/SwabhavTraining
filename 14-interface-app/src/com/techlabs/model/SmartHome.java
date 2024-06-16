package com.techlabs.model;

public class SmartHome {
	private SmartDevice[] devices;
    private int count;

    public SmartHome(int capacity) {
        devices = new SmartDevice[capacity];
        count = 0;
    }

    public void addDevice(SmartDevice device) {
        if (count < devices.length) {
            devices[count++] = device;
        } else {
        	
        System.out.println("No more space to add new devices.");
        }
        
    }

    public void controlDevice(String deviceID, boolean turnOn) {
        for (int i = 0; i < count; i++) {
            if (devices[i].getDeviceID().equals(deviceID) && devices[i] instanceof Controllable) {
                if (turnOn) {
                    ((Controllable) devices[i]).turnOn();
                } 
                else {
                    ((Controllable) devices[i]).turnOff();
                }
                return;
            }
        }
        System.out.println("Device not found or not controllable.");
    }

    public void listAllDevices() {
        for (int i = 0; i < count; i++) {
            System.out.println(devices[i]);
        }
    }

}
