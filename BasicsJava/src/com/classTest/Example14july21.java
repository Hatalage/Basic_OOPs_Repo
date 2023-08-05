package com.classTest;
class Parent
{
	public void Print()
	{
		System.out.println("parent");
	}
}
class Children extends Parent
{
	public void Print()
	{
		System.out.println("child");
	}
}
public class Example14july21 {
	public static void PrintMain(Parent o)
	{
		o.Print();
	}
	public static void main(String args[])
	{
		Parent x = new Parent();
		Parent y = new Children();
		Children z = new Children();
		PrintMain(x);
		PrintMain(y);
		PrintMain(z);
	}
}
