package com.oopsLab;

public class ThisSuper {
	int empid;
	String empname;
	int sal;
	public ThisSuper(int empid, String empname, int sal)
	{
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("Employee id "+this.empid);
		System.out.println("Employee id "+this.empname);
		System.out.println("Employee id "+this.sal);
	}
}
