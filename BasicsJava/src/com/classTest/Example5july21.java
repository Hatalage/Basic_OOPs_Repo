package com.classTest;

import java.util.Scanner;

public class Example5july21 {
	int emp_id;
	String emp_name;
	double basic_salary;
	public void acceptDetails(int id,String name,double salary)
	{
		emp_id=id;
		emp_name=name;
		basic_salary=salary;
	}
	public void Gross_salary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter HRA: ");
		double hra=sc.nextDouble();
		System.out.println("Enter Allowances: ");
		double da = sc.nextDouble();
		double gross_sal = basic_salary+hra+da;
		System.out.println("Gross Salary is : "+gross_sal);
	}
	public static void main(String args[])
	{
		Example5july21 ex = new Example5july21();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp id: ");
		System.out.println("Enter Emp name: ");
		System.out.println("Enter basic salary: ");
		ex.acceptDetails(sc.nextInt(), sc.next(), sc.nextDouble());
		ex.Gross_salary();
	}
}
