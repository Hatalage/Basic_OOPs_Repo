package com.nikita_mam_assign;
class DemoShape
{
	public void shape()
	{
		System.out.println("Diffrent shapes are:");
	}
}
class DemoCircle extends DemoShape
{
	public void shape()
	{
		System.out.println("Circle is a shape");
	}
}
class SqDemo extends DemoShape
{
	public void shape()
	{
		System.out.println("Rectangle is a shape");
	}
}
public class Example8july19 {
	public static void main(String[] args) {
		DemoShape s = new DemoShape();
		DemoCircle c  = new DemoCircle();
		SqDemo b = new SqDemo();
		DemoShape sp;
		sp=s;
		sp.shape();
		sp=c;
		sp.shape();
		sp=b;
		sp.shape();
}
}
