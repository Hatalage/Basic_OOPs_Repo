package com.oopsLab;

public class OopsDemo1 {
		int itemid=12;
		int itemprise=100;
		String itemname="Chocolate";
		public void display()
		{
			System.out.println(itemid+" "+itemprise+" "+itemname);
		}
		
		public static void main(String args[])
		{

			OopsDemo1 item = new OopsDemo1();
			item.display();
		
			
		}
}
