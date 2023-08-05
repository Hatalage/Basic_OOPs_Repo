package com.nikita_mam_assign;
class Student
{
	protected String name;
	protected int rno;
	protected float marks;
	Student(String name,int rno,float marks)
	{
		this.name=name;
		this.rno=rno;
		this.marks=marks;
	}
	public void show()
	{
		System.out.println("Name\t: "+name);
		System.out.println("rno\t: "+rno);
		System.out.println("marks\t: "+marks);
	}
}
class MyRecord extends Student
{
	float percentage;

	MyRecord(String name,int rno,float marks,float percentage)
	{
		super(name,rno,marks);
		this.percentage=percentage;
	}
	public void show()
	{
		System.out.println("Percentage: "+percentage+"%");
		super.show();
	}
}

public class Example1july19 {
	public static void main(String args[])
	{
		Student s = new Student("Shiv",12,580);
		s.show();
		System.out.println("_____________________");
		MyRecord mr = new MyRecord("Shiv",12,580,90);
		mr.show();
	}
}
