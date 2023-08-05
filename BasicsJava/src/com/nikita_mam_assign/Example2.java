package com.nikita_mam_assign;
class company
{
	String address = "Pune";
	public void address()
	{
		System.out.println(address+" this is company's address");
	}
}
class eBay extends company
{
//	public void address()
//	{
//		System.out.println(address);
//	}
}
class child extends eBay
{
	
}
public class Example2 {
		public static void main(String args[])
		{
			company c = new company();
			c.address();
			eBay b = new eBay();
			b.address();
			child c1 = new child();
		}
}
