package lab7julyassignment;

import java.util.Scanner;

public class SumofEvennums {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int sum=0;
		while(n!=0)
		{ 
			int digit=n%10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			n=n/10;
		}
		System.out.println("the sum is: "+sum);
		sc.close();
	}

}