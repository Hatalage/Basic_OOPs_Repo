package assign6july;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			int digit = num%10;
			sum = sum*10+digit;
			num = num/10;
		}
		//System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
