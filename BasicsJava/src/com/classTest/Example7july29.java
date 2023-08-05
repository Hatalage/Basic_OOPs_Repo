package com.classTest;
class DemoParent
{
	public void Print()
	{
		System.out.println("Parent");
	}
}
class DemoChild extends DemoParent
{
	public void Print()
	{
		System.out.println("Child");
	}
}
public class Example7july29 {
public static void PrintMain(DemoParent o) {
	o.Print();
}
public static void main(String[] args) {
	DemoParent x=new DemoParent();
	DemoParent y=new DemoChild();
	DemoChild z=new DemoChild();
	PrintMain(x);
	PrintMain(y);
	PrintMain(z);
}
}
