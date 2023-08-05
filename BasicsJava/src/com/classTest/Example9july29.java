package com.classTest;
abstract class S
{
	public S()
	{
		System.out.println("This is constructor of abstract class");
	}
	public abstract void a_method();
	public void b_method()
	{
		System.out.println("This is a normal method of abstract class");
	}
}
class SubClass extends S
{

	public SubClass() {
		super();
		System.out.println("This is constrctor of SubClass");
	}

	@Override
	public void a_method() {
		System.out.println("This is abstract method of SubClass");
	}
	
}
public class Example9july29 {
public static void main(String[] args) {
	S s= new SubClass();
	s.a_method();
	s.b_method();
}
}
