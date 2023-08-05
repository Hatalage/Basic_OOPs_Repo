package LabAssignment;

import java.util.Scanner;

public class ChocoDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chocolates: ");
		int choco = sc.nextInt();
		int count=0;
		while(choco>0)
		{
			choco=choco/10;
			count++;
			if(count==3)
			{
				int total=choco+1;
				System.out.println(total);
			}
		}
	}

}
