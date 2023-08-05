package com.lab10julyassignment;

import java.util.Scanner;

public class NalphaPattern {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num: ");
			int num = sc.nextInt();
			int count=0;
			for(int i=0;i<num;i++)
			{
				System.out.print("*");
				for(int j=0; j<=num; j++)
				{
					if(j==num)
					{
						System.out.print("*");
					}
					else if(j==count)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				count=count+1;
				System.out.println(" ");
			}
		}
}
