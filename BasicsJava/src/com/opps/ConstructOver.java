package com.opps;

public class ConstructOver {
      	public ConstructOver(int a, int b)
      	{
      		int c = a+b;
      		a = c-a;
      		b = c-b;
      		System.out.println("After Swapping: "+a+" "+b);
      	}
      	public ConstructOver()
      	{
      		char ch1 = 'a';
      		char ch2 = 'b';
      		char temp =ch1;
      		ch1 = ch2;
      		ch2 = ch1;
//      		int ch3 = (char) (ch1+ch2);
//      		ch1 = (char) (ch3 - ch1);
//      		ch2 = (char) (ch3-ch2);
      		System.out.println("After swaping: "+ch1+" "+ch2);
      	}
      	public static void main(String args[])
      	{
      		ConstructOver cs = new ConstructOver(2,3);
      		ConstructOver cs1 = new ConstructOver('a','b');
      	}
}
