package com.basics;

import java.util.Scanner;

public class SimpleCalsi {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second num: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the operation: ");
		System.out.println("for addition + ");
		System.out.println("for subtraction - ");
		System.out.println("for multiplication * ");
		System.out.println("for division / ");
		
		char op = sc.next().charAt(0);
		
		if(op=='+')
		{
			System.out.println(num1+num2);
		}
		else if(op=='-')
		{
			System.out.println(num1-num2);
		}
		else if(op=='*')
		{
			System.out.println(num1*num2);
		}
		else if(op=='/')
		{
			System.out.println(num1/num2);
		}
		else
		{
			System.out.println("Invalid iput!!");
		}
	}

}
