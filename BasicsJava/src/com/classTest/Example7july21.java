package com.classTest;

import com.oopsLab.ThisDemo1;

public class Example7july21 {
		String bikeName;
		String color;
		int prise;
		Example7july21(String bikeName, String color, int prise)
		{
			this.bikeName = bikeName;
			this.color = color;
			this.prise = prise;
		}
		public void display()
		{
			System.out.println("bike Name: "+bikeName);
			System.out.println("bike color: "+color);
			System.out.println("bike prise: "+prise);
		}
		public static void main(String args[])
		{
			Example7july21 t = new Example7july21("KTM","BLACK",600000);
			t.display();
		}
}
