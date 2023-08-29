package com.classTest;

public class Example3Aug6 {
	public static void findDuplicate(int a[])
	{
		int len=a.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("The duplicate element is: "+a[i]);
					count++;
				}
				
			}
			
		}
		System.out.println("Total count of duplicate elments: "+count);
	}
	public static void main(String[] args) {
		int num[]= {34,45,11,34,16,45,12,12,3,3,9};
		findDuplicate(num);
	}
}
