package com.conditional;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a': System.out.println("Vowel");
		break;
		case 'e': System.out.println("Vowel");
		break;
		case 'i': System.out.println("Vowel");
		break;
		case 'o': System.out.println("Vowel");
		break;
		case 'u': System.out.println("Vowel");
		break;
		default: System.out.println("Consonent");
		}
	}

}
