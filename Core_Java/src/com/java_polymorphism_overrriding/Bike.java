package com.java_polymorphism_overrriding;

class Vehicle{
	void run() {
		System.out.println("Vehicle is Running");
	}
}
public class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
           Bike bike=new Bike();
           bike.run();

	}

}
