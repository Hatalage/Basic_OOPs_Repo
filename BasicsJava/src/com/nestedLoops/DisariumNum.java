package com.nestedLoops;

import java.util.Scanner;

public class DisariumNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=temp;
		while(num>0)
		{
			int digit = num%10;
			int power =1;
			for(int i=1; i<=count; i++)
			{
				power = power*digit;
			}
			sum=sum+power;
			count--;
			num=num/10;
		}
		System.out.println(sum);
		num=temp;
		if(sum==num)
		{
			System.out.println("Num is Disarium");
		}
		else
		{
			System.out.println("Num is not Disarium");
		}
	}

}
