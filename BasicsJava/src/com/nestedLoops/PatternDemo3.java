package com.nestedLoops;

public class PatternDemo3 {
	public static void main(String args[])
	{
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}