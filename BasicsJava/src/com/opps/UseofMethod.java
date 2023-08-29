package com.opps;

import java.util.Scanner;

public class UseofMethod {
		
		int num;
		boolean isPresent=false;
		public void acceptDetail(int n)
		{
			num=n;
		}
		
		public void Isnegative()
		{
			if(num<0)
			{
				isPresent=false;
			}
			else if(num>0)
			{
				for(int i=1; i<=num; i=i/10)
				{
					int digit = i%10;
					if(digit==3)
					{
						isPresent=true;
					}
				}
			}
			System.out.println(isPresent);
		}
		public void display()
		{
			System.out.println(num);
		}
		public static void main(String args[])
		{
			UseofMethod m = new UseofMethod();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number");
			 int num = sc.nextInt();
			m.display();
			m.Isnegative();
			
		}
}
