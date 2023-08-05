package com.nikita_mam_assign;
class vehicle
{
	public void Accelerate(long mph)
	{
		System.out.println(mph);
	}
	public String stop()
	{
		return "stop";
	}
	public String run()
	{
		return "run";
	}
}
class car extends vehicle
{
	public void Accelerate(long mph)
	{
		System.out.println(mph);
	}
}
public class Example3 {
	public static void main(String args[])
	{
		vehicle v = new vehicle();
		v.Accelerate(120);
		String s=v.stop();
		System.out.println(s);
		String d=v.run();
		System.out.println(d);
		car c = new car();
		c.Accelerate(150);
	}
}
