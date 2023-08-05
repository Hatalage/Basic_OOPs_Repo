package assign10july;

import java.util.Scanner;

public class PrimeNumsSum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum=0;
		for( num=1; num<=10; num++)
		{
			int count =0;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}	
			}
			if(count==0)
			{
				sum=sum+num;
				System.out.println(num);
			}
		}
		System.out.println(sum);
	}
}
