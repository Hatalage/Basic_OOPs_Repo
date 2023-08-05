package com.classTest;
class Vehicle
{
	protected int regNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	Vehicle(int regNumber,int speed,String color,String ownerName)
	{
		this.regNumber=regNumber;
		this.speed=speed;
		this.color=color;
		this.ownerName=ownerName;
	}
	public void showData()
	{
		System.out.println("This is a vehicle class--");
		System.out.println("regNumber\t: "+regNumber);
		System.out.println("speed\t: "+speed);
		System.out.println("color\t: "+color);
		System.out.println("ownerName\t: "+ownerName);
	}
}
class Bus extends Vehicle
{
	int routeNum;
	Bus(int regNumber,int speed,String color,String ownerName,int routeNum)
	{
		super(regNumber,speed,color,ownerName);
		this.routeNum=routeNum;
	}
	public void showData()
	{
		super.showData();
		System.out.println("Route Number\t: "+routeNum);
	}
}
class Car extends Vehicle
{
	String manufacturerName;
	Car(int regNumber,int speed,String color,String ownerName,String manufacturerName)
	{
		super(regNumber,speed,color,ownerName);
		this.manufacturerName=manufacturerName;
	}
	public void showData()
	{
		super.showData();
		System.out.println("manufacturerName\t: "+manufacturerName);
	}
}
public class Example1july21 {
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(102,120,"black","john");
		v.showData();
		System.out.println(".................");
		Bus b = new Bus(101,80,"black","shiv",112);
		b.showData();
		System.out.println(".................");
		Car c = new Car(102,80,"black","shrey","TATA");
		c.showData();
	}
}