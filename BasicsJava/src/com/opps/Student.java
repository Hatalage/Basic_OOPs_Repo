package com.opps;

public class Student {
	int id;
	String name;
	double per;
	public static void main(String args[])
	{
		Student stud = new Student();
		stud.id = 102;
		stud.name = "Amit";
		stud.per = 70.89;
		System.out.println(stud.id+" "+stud.name+" "+stud.per);
	}
}
