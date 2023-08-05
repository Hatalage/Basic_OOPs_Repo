package com.classTest;
class Time
{
	private int hour;
	private int min;
	private int sec;
	Time(int hour,int min,int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public void show()
	{
		System.out.println("Hour\t: "+hour+"O clock");
		System.out.println("Minute\t: "+min+"min");
		System.out.println("Seconds\t: "+sec+"secs");
	}
	public void add(int time)
	{
		time=hour;
		System.out.println("Time is: "+time+" 'O clock");
	}
}
public class Example2july21 {
		public static void main(String args[])
		{
			Time t1 = new Time(2,25,44);
			t1.show();
			Time t2 = new Time(2,45,66);
			t2.add(2);
		}
}
