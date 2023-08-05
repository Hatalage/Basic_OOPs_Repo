package com.oops2;
interface Calculator
{
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
	private void data()
	{
		System.out.println("dafault method ");
	}
	static void shareData()
	{
		System.out.println("static method");
	}
	default void display()
	{
		System.out.println("default method");
	}
}
class BasicCal implements Calculator
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
public interface TestInterfaceDemo4 {
		public static void main(String[] args) {
			BasicCal bc = new BasicCal();
			System.out.println("add: "+bc.add(12, 3));
			System.out.println("add: "+bc.sub(12, 3));
			System.out.println("add: "+bc.mul(12, 3));
			System.out.println("add: "+bc.div(12, 3));
		}
}
