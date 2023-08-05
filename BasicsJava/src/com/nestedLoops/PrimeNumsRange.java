package com.nestedLoops;

import java.util.Scanner;

public class PrimeNumsRange {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		for( num=1; num<=10; num++)
		{
			int count =0;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					count++;
					
				}
				
			}
			if(count==0)
			{
				System.out.println(num);
			}
		}
	}

}
