package com.basics;

public class LowerUppercase {
	public static void main(String args[])
	{
		char ch = 's';
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Entered char is in Uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Entered char is in Lowercase");
		}
		else
		{
			System.out.println("Enter valid character");
		}
	}

}
