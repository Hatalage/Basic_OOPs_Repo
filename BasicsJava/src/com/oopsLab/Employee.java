package com.oopsLab;
class Department
{
	private int deptid;
	private String deptname;
	private double salary;
	public void setDeptid(int deptid)
	{
		this.deptid=deptid;
	}
	public void setDeptname(String deptname)
	{
		this.deptname=deptname;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getDeptid()
	{
		return deptid;
	}
	public String getDeptname()
	{
		return deptname;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return deptid+" "+deptname+" "+salary;
	}
}
public class Employee {
		private int empid;
		private String empname;
		private Department dept;
		public void setEmpid(int empid)
		{
			this.empid=empid;
		}
		public void setEmpname(String empname)
		{
			this.empname=empname;
		}
		public void setDepartment(Department dept)
		{
			this.dept=dept;
		}
		public int getEmpid()
		{
			return empid;
		}
		public String getEmpname()
		{
			return empname;
		}
		public Department getDept()
		{
			return dept;
		}
		public String toString()
		{
			return empid+" "+empname;
		}
		public static void main(String args[])
		{
			Employee emp = new Employee();
			emp.setEmpid(101);
			emp.setEmpname("Shiv");
			System.out.println("The id of employee: "+emp.getEmpid());
			System.out.println("The name of employee: "+emp.getEmpname());
			
			emp.setDepartment(new Department());
			Department dept = emp.getDept();
			dept.setDeptid(102);
			dept.setDeptname("HR");
			dept.setSalary(450000);
			System.out.println("The department id is: "+dept.getDeptid());
			System.out.println("The department name is: "+dept.getDeptname());
			System.out.println("The salary of Departmnet is: "+dept.getSalary());
		}
}
