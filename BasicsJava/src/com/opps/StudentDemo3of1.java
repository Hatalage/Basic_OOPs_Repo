package com.opps;

public class StudentDemo3of1 {
		public static void main(String args[])
		{
			StudentDemo3 sd = new StudentDemo3();
			sd.setSid(101);
			sd.setSname("raj");
			sd.setMarks(250);
			sd.setIsplace(true);
			
			System.out.println(sd.getSid());
			System.out.println(sd.getSname());
			float per = 250f/300f*100f;
			System.out.println(per);
			if(sd.getMarks()>=80)
			{
				
				System.out.println("Excellent");
				
			}
			else if(sd.getMarks()>=60)
			{
				System.out.println("first class");
			}
			else
			{
				System.out.println("fail");
			}
			//System.out.println(sd.getMarks());
			//System.out.println(sd.getIsplace());
			if(sd.getIsplace()==true)
			{
				System.out.println("You are placed!!!!");
			}
		}
}
