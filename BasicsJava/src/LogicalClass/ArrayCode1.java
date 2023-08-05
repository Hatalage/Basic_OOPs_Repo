package LogicalClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCode1 {
	public static int findevensum(int a[])
	{
		int sum=0;
		int length=a.length;
		for(int i=0;i<length;i++) {
			if(a[i]%2==0)
			{
			sum=sum+a[i];
		}
		}
		System.out.println(Arrays.toString(a));
		return sum;
		}
	public static int findevenposition(int a[])
	{
		int sum=0;
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int num[]=new int[10];
		int i,len=num.length,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		n=sc.nextInt();
		
	
		for(i=0;i<n;i++) {
			System.out.println("Enter element:");
			num[i]=sc.nextInt();
		}
		
		int ans=findevensum(num);
		System.out.println("sum of even element:"+ans);
		int res=findevenposition(num);
		System.out.println("sum of even position: "+res);
}
}
