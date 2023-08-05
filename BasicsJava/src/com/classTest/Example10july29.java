package com.classTest;

interface Exam
{
	public default void Cal_Percentage()
	{
		System.out.println("Calculate Percentage");
	}
}
class Student implements Exam
{
	String name;
	int Rollno;
	static int marks;
	public Student(String name,int Rollno,int marks)
	{
		this.name=name;
		this.Rollno=Rollno;
		this.marks=marks;
	}
	public void show()
	{
		System.out.println("name: "+name);
		System.out.println("Rollno: "+Rollno);
		System.out.println("marks: "+marks);
	}
}
public class Example10july29 {
	public static void main(String[] args) {
		Student s= new Student("shiv",101,500);
		s.show();
		Exam ex=new Student("shiv",101,500);
		ex.Cal_Percentage();
	}
	
}
