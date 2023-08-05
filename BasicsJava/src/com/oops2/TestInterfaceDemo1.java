package com.oops2;
interface Printable
{
	int a = 10;
	void showMsg();
}
class Print implements Printable
{
	public void showMsg()
	{
		System.out.println("Printing msg");
	}
}
public interface TestInterfaceDemo1 {
		public static void main(String args[])
		{
			Printable p1=new Print();
			p1.showMsg();
			Print p=new Print();
			p.showMsg();
		}
}
