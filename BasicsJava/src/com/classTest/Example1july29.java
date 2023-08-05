package com.classTest;
interface Camera
{
	public void Photographs();
}
class DigitalCamera implements Camera
{
	@Override
	public void Photographs() {
		System.out.println("DigitalCamera takes 20000 photographs");
		
	}
	public String msg(String a)
	{
		return a;
	}
}
class PolaroidCamera implements Camera
{

	@Override
	public void Photographs() {
		System.out.println("PolaroidlCamera takes 10 photographs");
		
	}
	public String msg(String b)
	{
		return b;
	}
}
class PhoneCamera implements Camera
{

	@Override
	public void Photographs() {
		System.out.println("PhoneCamera takes 12600 photographs");
	}
}
public class Example1july29 {
public static void main(String[] args) {
	Camera c= new DigitalCamera();
	c.Photographs();
	DigitalCamera dc = new DigitalCamera();
	System.out.println(dc.msg("Taking a picture on my digital camera"));
	c= new PolaroidCamera();
	c.Photographs();
	PolaroidCamera pc = new PolaroidCamera();
	System.out.println(pc.msg("Taking a picture on my polaroid camera"));
	c= new PhoneCamera();
	c.Photographs();
}
}
