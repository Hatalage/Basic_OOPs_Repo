package lab7julyassignment;

import java.util.Scanner;

public class HarshadNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int sum=0;
		int temp = num;
		do
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		while(num>0);
		if(temp%sum==0)
		{
			System.out.println("it's harshad number");
			
		}
		else
		{
			System.out.println("it's not harshad number");
		}
		sc.close();
		
	}

}
