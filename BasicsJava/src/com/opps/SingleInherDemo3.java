package com.opps;
class Chocolate
{
	String taste = "Sweet";
}
class KitKat extends Chocolate
{
	public void display()
	{
		System.out.println("The taste of chocolate is: "+taste);
	}
}
public class SingleInherDemo3 {
		public static void main(String args[])
		{
			KitKat kk = new KitKat();
			kk.display();
		}
}
