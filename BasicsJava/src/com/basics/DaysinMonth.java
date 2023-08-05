package com.basics;

public class DaysinMonth {
	public static void main(String args[])
	{
		int month = 6;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("There are 31 days in month");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println("There are 30 days in month");
		}
		else if(month==2)
		{
			System.out.println("There are 28/29 days in month");
		}
	}

}
