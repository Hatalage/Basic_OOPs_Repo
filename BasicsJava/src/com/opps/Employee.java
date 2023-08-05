package com.opps;

public class Employee {
		int eid;
		String ename;
		int salary;
		public void acceptDetails(int id, String name, int sal)
		{
			eid = id;
			ename = name;
			salary = sal;
		}
		public void display()
		{
			System.out.println(eid+" "+ename+" "+salary);
		}
		public static void main(String args[])
		{
			Employee emp1=new Employee();
			emp1.acceptDetails(101, "neha", 400000);
			emp1.display();
			Employee emp2=new Employee();
			emp2.acceptDetails(102, "puja", 500000);
			emp2.display();
		}
}
