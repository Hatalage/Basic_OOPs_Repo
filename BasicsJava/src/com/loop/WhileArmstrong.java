package com.loop;

import java.util.Scanner;

public class WhileArmstrong {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		while(num>0)
		{
			int digit  = num%10;
			int cube = digit*digit*digit;
			 sum = sum + cube;
			num = num/10;
		}
		num=temp;
		System.out.println(num+" = "+sum);
		if(num==sum)
		{
			System.out.println("Number is Armstrong!!");
		}
		else
		{
			System.out.println("Not Armstrong!!");
		}
	}

}
