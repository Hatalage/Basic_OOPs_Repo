package LogicalClass;

import java.util.Scanner;

public class CountOfDigit {
	public void Frequency()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		int temp=num;
		for(int i=1;i<=num;i++)
		{
			int count=0;
			while(num>0)
			{
				int digit = num%10;
				if(digit==i)
				{
					count++;
				}
				num=num/10;
			}
			if(count>0)
			{
			System.out.println(i+" "+count);
			num=temp;
			}
		}
		}
	public static void main(String args[])
	{
		CountOfDigit cd = new CountOfDigit();
		cd.Frequency();
	}
}
