package com.oops2;
interface MobileDemo
{
	void call();
}
interface DemoBasic extends MobileDemo
{
	void msg();
}
class Nokia implements DemoBasic
{
	public void msg()
	{
		System.out.println("Nokia phone msg Method");
	}

	@Override
	public void call() {
		System.out.println("nokia phone call method");
		
	}
	
}
public interface TestInterfaceDemo3 {
	public static void main(String args[])
	{
		Nokia n = new Nokia();
		n.call();
		n.msg();
}
}
