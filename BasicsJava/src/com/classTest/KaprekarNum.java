package com.classTest;

import java.util.Scanner;

public class KaprekarNum {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			int square=num*num;
			System.out.println(square);
			int sq=square;
			int count=0;
			int sum=0;
			for(;square>0;square=square/10)
			{
				count++;
			}
			int k=(int)Math.pow(10, (count/2));
			for(;sq>0;sq=sq/k)
			{
				sum=sum+(sq%k);
			}
			if(sum==num)
			{
				System.out.println(num+" is a kaprekar");
			}
			else
			{
				System.out.println(num+" is not kaprekar");
			}
		}
}
