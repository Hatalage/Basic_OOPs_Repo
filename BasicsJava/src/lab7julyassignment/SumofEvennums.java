package lab7julyassignment;

import java.util.Scanner;

public class SumofEvennums {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum=0;
		while(num!=0)
		{ 
			int digit=num%10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println("the sum is: "+sum);
		sc.close();
	}

}
