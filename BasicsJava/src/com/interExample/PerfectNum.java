package com.interExample;

import java.util.Scanner;

public class PerfectNum {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num: ");
			int num = sc.nextInt();
			int sum=0;
			for(int i=1; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
					sum=sum+i;
				}
			}
			if(sum==num)
			{
				System.out.println("The number is perfect number");
			}
			else
			{
				System.out.println("The number is not perfect number");
			}
			sc.close();
		}
}
