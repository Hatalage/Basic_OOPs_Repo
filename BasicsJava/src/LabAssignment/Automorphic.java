package LabAssignment;

import java.util.Scanner;

public class Automorphic {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int square;
		int count=0;
		square = num*num;
		
		for(int i = num; num>0; num=num/10)
		{
			if(num%10 == square%10)
			{
				count++;
				square = square/10;
			}
		}
		if(count>0)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automorphic");
		}
	}

}
