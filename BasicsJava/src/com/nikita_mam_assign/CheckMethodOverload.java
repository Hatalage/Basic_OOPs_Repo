package com.nikita_mam_assign;

public class CheckMethodOverload {
		public void add(float a,int b)
		{
			a=12;
			b=12;
			System.out.println(a+b);
		}
		public void add(int x, float y)
		{
			x=13;
			y=13;
			System.out.println(x+y);
		}
		public static void main(String args[])
		{
			CheckMethodOverload mo = new CheckMethodOverload();
			mo.add(10f,10);
			mo.add(10,10f);
		}
}
