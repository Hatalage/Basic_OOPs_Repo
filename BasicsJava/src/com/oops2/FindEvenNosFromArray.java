package com.oops2;

public class FindEvenNosFromArray {
	public static void findEvenNum(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) {
		int number[] = {12,10,7,9,24,15};
		System.out.println("even number from array");
		findEvenNum(number);
	}
}
