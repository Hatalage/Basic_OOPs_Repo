package com.lab111314julyassignment;

import java.util.Scanner;

public class ArithmeticMethod {
		float num1;
		float num2;
		public void acceptDetails(float n1, float n2)
		{
			num1=n1;
			num2=n2;
		}
//		public void display()
//		{
//			System.out.println(num1);
//			System.out.println(num2);
//		}
		public void add()
		{
			float addition = num1+num2;
			System.out.println("Addition is "+addition);
		}
		public void sub()
		{
			float subtraction = num1-num2;
			System.out.println("Subtraction is "+subtraction);
		}
		public void mul()
		{
			float multiplication = num1*num2;
			System.out.println("Multiplication is "+multiplication);
		}
		public void div()
		{
			float division = num1/num2;
			System.out.println("Division is "+division);
		}
		public static void main(String args[])
		{
			ArithmeticMethod am = new ArithmeticMethod();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number and second number ");
			
			am.acceptDetails(sc.nextFloat(),sc.nextFloat());
//			am.num1 = 12;
//			am.num2 = 12;
			am.add();
			am.sub();
			am.mul();
			am.div();
		}
}
