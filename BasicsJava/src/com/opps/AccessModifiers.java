package com.opps;

public class AccessModifiers {
		private int a = 12;
		protected int b = 13;
		public int c = 14;
		int d = 15;
		private void doprivate()
		{
			System.out.println("Hello");
		}
		protected void doprotected()
		{
			System.out.println("hi");
		}
		public void dopublic()
		{
			System.out.println("Bye");
		}
		public void display()
		{
			System.out.println("Good");
		}
		public static void main(String args[])
		{
			AccessModifiers am = new AccessModifiers();
			System.out.println(am.a);
			am.doprivate();
			System.out.println(am.b);
			am.doprotected();
			System.out.println(am.c);
			am.dopublic();
			System.out.println(am.d);
			am.display();
			
		}
		
}
