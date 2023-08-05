package assign5july;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count,digit;
		int product=1;
		for(int i=num; num!=0; num=num/10)
		{
			digit=num%10;
			 product = product*digit;
		}
		System.out.println(product);
	}

}
