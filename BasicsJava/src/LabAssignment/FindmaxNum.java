package LabAssignment;

import java.util.Scanner;

public class FindmaxNum {
	public static void main(String args[])
	{
		
		int num = 8976;
		
		int count=0;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			count++;
			if(digit==count)
			{
				System.out.println("Correct");
				break;
			}
			else
			{
				System.out.println(" Not Correct");
				break;
			}
		}
	}

}
