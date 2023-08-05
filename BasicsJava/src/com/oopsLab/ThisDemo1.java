package com.oopsLab;

public class ThisDemo1 {
		String bikeName;
		String color;
		int prise;
		ThisDemo1(String bikeName, String color, int prise)
		{
			this.bikeName = bikeName;
			this.color = color;
			this.prise = prise;
		}
		public void display()
		{
			System.out.println("bike Num: "+bikeName);
			System.out.println("bike Num: "+color);
			System.out.println("bike Num: "+prise);
		}
		public static void main(String args[])
		{
			ThisDemo1 t = new ThisDemo1("KTM","BLACK",600000);
			t.display();
		}
}
