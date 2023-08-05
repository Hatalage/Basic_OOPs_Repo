package assign6july;

import java.util.Scanner;

public class SumOfDigitNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int evensum=0;
		int oddsum=0;
		int digit;
		while(num!=0)
		{
			digit=num%10;
			if(digit%2==0)
			{
				evensum=evensum+digit;
				
				
			}
			else
			{
				oddsum=oddsum+digit;
			}
			num=num/10;
		}
		System.out.println("Sum of even digits is "+evensum);
		System.out.println("Sum of odd digits is "+oddsum);
	}

}
