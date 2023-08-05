package com.oops2;
abstract class DemoMobile
{
	private String modelName;
	private double price;
	
	public abstract void call();
	public void display()
	{
		System.out.println("Mobile display method");
	}
}
class Samsung extends DemoMobile
{
	public void call()
	{
		System.out.println("Samsung mobile calling");
	}
}
abstract class Redmi extends DemoMobile{
	public abstract void call();
}
class Oneplus extends Redmi {
	public void call()
	{
		System.out.println("Oneplus calling method");
	}
}
public class TestAbstractDemo2 {
	public static void main(String[] args) {
		DemoMobile dm = new Samsung();
		dm.call();
		dm=new Oneplus();
		dm.call();
	}
}
