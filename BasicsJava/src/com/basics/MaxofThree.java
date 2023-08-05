package com.basics;

public class MaxofThree {
	public static void main(String args[])
	{
		int num1 = 20, num2 = 40, num3 = 60;
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("Max number is: "+num1);
		}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.println("Max number is: "+num2);
		}
		else
		{
			System.out.println("Max number is: "+num3);
		}
	}

}
