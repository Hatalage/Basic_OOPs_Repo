package assign5july;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int temp,sum;
		temp = num;
		for(sum=0; num>0; num=num/10)
		{
			int digit = num%10;
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
