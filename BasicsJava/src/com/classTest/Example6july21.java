package com.classTest;

import java.util.Scanner;

public class Example6july21 {
		int num;
		public void acceptDetails(int n)
		{
			num=n;
		}
		public void printnuminWord()
		{
			if(num==1)
			{
				System.out.println("ONE");
			}
			else if(num==2)
			{
				System.out.println("TWO");
			}
			else if(num==3)
			{
				System.out.println("THREE");
			}
			else if(num==4)
			{
				System.out.println("FOUR");
			}
			else if(num==5)
			{
				System.out.println("FIVE");
			}
			else if(num==6)
			{
				System.out.println("SIX");
			}
			else if(num==7)
			{
				System.out.println("SEVEN");
			}
			else if(num==8)
			{
				System.out.println("EIGHT");
			}
			else if(num==9)
			{
				System.out.println("NINE");
			}
			else 
			{
				System.out.println("ZERO");
			}
			}
		public static void main(String args[])
		{
			Example6july21 ex = new Example6july21();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a num: ");
			ex.acceptDetails(sc.nextInt());
			ex.printnuminWord();
			sc.close();
		}
}
