package com.classTest;

import java.util.Scanner;

public class PowerDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent: ");
		int exponent = sc.nextInt();
		int power = 1;
		
		for(int i=1; i<=exponent; i++)
			{
			  power = power*base;
			}
		System.out.println(power);
	}

}
