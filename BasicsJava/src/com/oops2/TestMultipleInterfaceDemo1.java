package com.oops2;
interface intA{
	void m1();
}
interface intB{
	void m2();
}
class SimpleChild implements intA,intB{
	public void m1()
	{
		System.out.println("m1 method from intA");
	}

	@Override
	public void m2() {
		System.out.println("m2 method from intB");
		
	}
}
public class TestMultipleInterfaceDemo1 {
	public static void main(String args[])
	{
		SimpleChild s = new SimpleChild();
		s.m1();
		s.m2();
	}
}
