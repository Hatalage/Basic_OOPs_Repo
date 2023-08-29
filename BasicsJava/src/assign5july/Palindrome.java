package assign5july;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp,sum;
		temp = n;
		for(sum=0; n>0; n=n/10)
		{
			int digit = n%10;
			sum = (sum*10)+digit;
		}
		if(sum==temp)
		{
			System.out.println(sum+" is a palindrome");
		}
		else
		{
			System.out.println(sum+" is not a palindrome");
		}
	}

}
