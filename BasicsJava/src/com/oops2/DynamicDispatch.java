package com.oops2;
class Fruit
{
	public void color()
	{
		System.out.println("Fruit has different color");
	}
}
class Apple extends Fruit
{
	public void color()
	{
		System.out.println("Apple is red");
	}
}
class Banana extends Fruit
{
	public void color()
	{
		System.out.println("Banana is yellow");
	}
}
public class DynamicDispatch {
  public static void main(String[] args) {
	Fruit f = new Fruit();
	Apple a  = new Apple();
	Banana b = new Banana();
	Fruit ft;
	ft=f;
	f.color();
	ft=a;
	ft.color();
	ft=b;
	b.color();
	
}
}
