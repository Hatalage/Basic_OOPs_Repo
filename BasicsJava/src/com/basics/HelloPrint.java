package com.basics;

import java.util.Scanner;

public class HelloPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		if(num%3==0)
		{
			System.out.println("Hi...");
		}
		else if(num%5==0)
		{
			System.out.println("Hello...");
		}
		else if(num%3==0 && num%5==0)
		{
			System.out.println("Welcome...");
		}
		else
		{
			System.out.println("Enter valid input!");
		}

	}

}
