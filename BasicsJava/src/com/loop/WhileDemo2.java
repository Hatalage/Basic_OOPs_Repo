package com.loop;

import java.util.Scanner;

public class WhileDemo2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println(sum);
	}

}
