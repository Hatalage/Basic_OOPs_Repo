package com.loop;

import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
	}

}
