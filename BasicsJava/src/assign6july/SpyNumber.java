package assign6july;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int sum=0;
		int product=1;
		while(num>0)
		{	
			int digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
		}
			if(sum==product)
			{
				System.out.println("The given num is Spy number");
				
			
			}
			else 
			{
					System.out.println("The num is not Spy");
					
			}
		
			
		}
	}

			

