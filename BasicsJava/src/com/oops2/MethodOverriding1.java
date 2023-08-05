package com.oops2;

class Vehicle {
	public void engine() {
		System.out.println("All Vehicle has engine");
	}
}

class Car extends Vehicle {
	@Override
	public void engine() {
		System.out.println("Car also has engine");
	}
}

public class MethodOverriding1 {
	public static void main(String args[]) {
		Vehicle v = new Vehicle();
		v.engine();
		Car c = new Car();
		c.engine();
	}
}