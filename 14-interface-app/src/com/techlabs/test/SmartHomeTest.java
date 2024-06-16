package com.techlabs.test;

import com.techlabs.model.Light;
import com.techlabs.model.SecurityCamera;
import com.techlabs.model.SmartHome;
import com.techlabs.model.Thermostat;

public class SmartHomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartHome smartHome = new SmartHome(10);

        Light light1 = new Light("1", "Living Room Light");
        Thermostat thermostat1 = new Thermostat("2", "Living Room Thermostat", 22.0);
        SecurityCamera camera1 = new SecurityCamera("3", "Front Door Camera");

        smartHome.addDevice(light1);
        smartHome.addDevice(thermostat1);
        smartHome.addDevice(camera1);

        smartHome.controlDevice("1", true);
        smartHome.controlDevice("2", true);
        thermostat1.setTemperature(24.0);
        camera1.startRecording();

        smartHome.listAllDevices();

	}

}
