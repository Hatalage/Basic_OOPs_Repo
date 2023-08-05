package LabAssignment;

import java.util.Scanner;

public class PrimeNumsRange {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print prime nums: ");
		int num = sc.nextInt();
		int count=0;
		for(int i=2; i<num; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
