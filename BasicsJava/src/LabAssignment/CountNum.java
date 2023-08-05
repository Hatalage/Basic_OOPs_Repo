package LabAssignment;

import java.util.Scanner;

public class CountNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number: ");
		int luckynum = sc.nextInt();
		int num = 87655466;
		int count=0;
		while(luckynum>0)
		{
		  num=num/10;
		  count++;
		  if(luckynum%5==0)
		  {
			  System.out.println("Correct");
			  break;
		  }
		  else
		  {
			  System.out.println("Try once");
			  break;
		  }
		}
	}

}
