package lab7julyassignment;

import java.util.Scanner;

public class IcreasingNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		boolean isIncreasing = true;
		int digit=num%10;
		num=num/10;
		while(num>0)
		{
			if(digit<=num%10)
			{
				isIncreasing = false;
				break;
			}
			digit=num%10;
			num=num/10;
		}
		if(!isIncreasing)
		{
			System.out.println("digits are not in increasing order");
		}
		else
		{
			System.out.println("digits are in increasing order");
		}
		sc.close();
	}

}
