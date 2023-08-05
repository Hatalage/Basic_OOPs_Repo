package assign6july;

import java.util.Scanner;

public class AvgofNums {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int count=0;
		int sum=0;
		int avg=0;
		while(num>0)
		{
			num=num/10;
			count++;
			sum=sum+count;
			avg=sum/count;
		}
		System.out.println(count);
		System.out.println(sum);
		System.out.println(avg);
	}

}
