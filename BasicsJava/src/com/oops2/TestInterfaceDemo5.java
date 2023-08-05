package com.oops2;
interface interfaceA
{
	default void show()
	{
		System.out.println("show method of interfaceA");
	}
}
interface interfaceB
{
	default void show()
	{
		System.out.println("show method of interfaceB");
	}
}
class child implements interfaceA,interfaceB
{
	public void show()
	{
		interfaceA.super.show();
		interfaceB.super.show();
	}
}
public interface TestInterfaceDemo5 {
		public static void main(String[] args) {
			child c = new child();
			c.show();
		}
}
