package com.loop;

import java.util.Scanner;

public class PrimeDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=2; i<num; i++) {
			if(num%i==0)
			{
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("the number is Prime");
		}
		else
		{
			System.out.println("the number is not Prime");
		}
	}

}
