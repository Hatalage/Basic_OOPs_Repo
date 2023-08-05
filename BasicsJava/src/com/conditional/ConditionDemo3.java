package com.conditional;

import java.util.Scanner;

public class ConditionDemo3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the percentage: ");
		int per = sc.nextInt();
		
		if(per>60)
		{
			if(year==2020)
			{
				System.out.println("Selected for interview!!");
			}
			else
			{
				System.out.println("Try next time");
			}
		}
		else
		{
			System.out.println("Not selected");
		}
	}

}
