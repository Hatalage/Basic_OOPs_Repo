package com.opps;

public class StudentDemo2 {
		int id;
		String name;
		double marks;
		public StudentDemo2(int sid, String sname, double mk)
		{
			id=sid;
			name=sname;
			marks=mk;
		}
		public void display()
		{
			System.out.println(id+" "+name+" "+marks);
		}
		public static void main(String args[])
		{
			StudentDemo2 stud = new StudentDemo2(11,"neha",90);
			stud.display();
			
		}
}
