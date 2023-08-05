package com.opps;
class Mobile
{
	String memory = "64GB";
}
class Apple extends Mobile
{
	public void show()
	{
		System.out.println(memory);
	}
}
public class SingleInheriDemo1 {
		public static void main(String args[])
		{
			Apple a = new Apple();
			a.show();
		}
}
