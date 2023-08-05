package LogicalClass;

import java.util.Scanner;

public class SumoffirstlastDigit {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();
		int first=0;
		int last = num%10;
		int sum=0;
		while(num>0)
		{
			first = num%10;
			num=num/10;
		}
		System.out.println("The sum of first and last digit is: "+(last+first));
}
}
//	public void sum()
//	{
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		int sum;
//		while(num>0)
//		{
//			int digit = num%10;
//			if(digit==3)
//			{
//				int temp1=digit;
//				break;
//			}
//			num=num/10;
//			if(num==7)
//			{
//				
//				int temp=num;
//				sum=temp+temp1;
//				System.out.println(sum);
//				break;
//				
//			}
//			
//		}
//		
	
	
