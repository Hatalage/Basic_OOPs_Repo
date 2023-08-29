package assign6july;

import java.util.Scanner;

public class PrimeWhile {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int count=0;
		int i=2;
		while(i<num)
		{
			
			if(num%i==0)
			{
				count++;
			}
			i++;
		if(count==0)
		{
			System.out.println("num is Prime");
			break;
		}
		else
		{
			System.out.println("No prime");
			break;
		}
		}
	}

}
