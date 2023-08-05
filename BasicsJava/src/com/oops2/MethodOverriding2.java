package com.oops2;
class Bike
{
	String color="black";
	int speed=80;
	public void bikeInfo()
	{
		System.out.println("Bike color is: "+color);
		System.out.println("Bike speed is: "+speed);
	}
}
class Ktm extends Bike
{
	public void bikeInfo()
	{
		System.out.println("KTM color is: "+color);
		System.out.println("KTM speed is: "+speed);
	}
}
public class MethodOverriding2 {
	public static void main(String args[])
	{
		Bike b = new Bike();
		b.bikeInfo();
		Ktm k = new Ktm();
		k.bikeInfo();
}
}
