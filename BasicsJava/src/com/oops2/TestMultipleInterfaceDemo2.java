package com.oops2;
interface Cng_car
{
	void drive();
	void cng_car_kit();
}
interface Petrol_car
{
	void drive();
	void petrol_car_kit();
}
class HybridCar implements Cng_car, Petrol_car
{

	public void petrol_car_kit() {
		System.out.println("driving a hybrid car");
		}
	public void drive() {
		System.out.println("Petrol kit");	
	}
	public void cng_car_kit() {
		System.out.println("cng kit");
	}
	
}
public interface TestMultipleInterfaceDemo2 {
		public static void main(String[] args) {
			HybridCar h = new HybridCar();
     		h.drive();
			h.petrol_car_kit();
			h.cng_car_kit();
		}
}
