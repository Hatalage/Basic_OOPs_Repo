package LogicalClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCode2 {
	public static void findalternateEle(int a[])
	{
		
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
				
			}
			
			
		}
		
		
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n=sc.nextInt();
		int num[]=new int[n];
	
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			num[i]=sc.nextInt();
			
		}
		findalternateEle(num);
}
}
