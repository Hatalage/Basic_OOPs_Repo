package com.classTest;

public class Example8july21 {
		static int count=0;
		public Example8july21()
		{
			count++;
		}
		public static void main(String args[])
		{
			Example8july21 ex1 = new Example8july21();
			Example8july21 ex2 = new Example8july21();
			Example8july21 ex3 = new Example8july21();
			System.out.println("No. of instances created: "+count);
		}
}
