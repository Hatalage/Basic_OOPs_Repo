package com.oopsLab;

public class Test {
		public void add(int a,float b)
		{
			System.out.println("Add-int,float");
		}
		public void add(float a,int b)
		{
			
		}
		public void add(int a,int b)
		{
			
		}
		public static void main(String[] args) {
			Test t = new Test();
			t.add(2, 2);
		}
}
