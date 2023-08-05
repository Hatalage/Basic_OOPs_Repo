package com.nikita_mam_assign;
interface Flyable
{
	public abstract void fly_obj();
}
class Spacecraft implements Flyable
{

	@Override
	public void fly_obj() {
		System.out.println("Spacecraft is flying");
	}
	
}
class Airplane implements Flyable
{

	@Override
	public void fly_obj() {
		System.out.println("Airplane is flying");
	}
	
}
class Helicopter implements Flyable
{

	@Override
	public void fly_obj() {
		System.out.println("Helicopter is flying");
	}
	
}
public interface Example5july24 {
	public static void main(String[] args) {
		Flyable fy = new Spacecraft();
		fy.fly_obj();
		fy=new Airplane();
		fy.fly_obj();
		fy=new Helicopter();
		fy.fly_obj();
	}
}
