package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(null, i, i);
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Company Name: ");
            cars[i].setCompanyName(scanner.nextLine());
            System.out.print("Mileage: ");
            cars[i].setMileage(scanner.nextDouble());
            System.out.print("Price: ");
            cars[i].setPrice(scanner.nextDouble());
            scanner.nextLine();
        }

        System.out.println("Details of all cars:");
        for (int i = 0; i < n; i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars[i].displayDetails();
        }
	}

}
