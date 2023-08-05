package LabAssignment;

import java.util.Scanner;

public class Automorphicnum {
	public static void main(String args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num=sc.nextInt();
		int sqaure=num*num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			if(num%10==0 && sqaure%10==0)
			{
				System.out.println("Automorphic!!");
			}
			else
			{
				System.out.println(" Not Automorphic!!");
			}
		}
		}

}
