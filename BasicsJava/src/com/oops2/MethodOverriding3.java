package com.oops2;
class Person
{
	protected String name;
	protected int age;
	protected String email;
	protected String contact;
	
	Person(String name,int age, String email,String contact)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.contact=contact;
	}
	public void show()
	{
		System.out.println("Name\t: "+name);
		System.out.println("Age\t: "+age);
		System.out.println("Email\t: "+email);
		System.out.println("Contact\t: "+contact);
	}
}
class Teacher extends Person
{
	String degree;
	double sal;
	Teacher(String name,int age, String email,String contact,String degree, double sal)
	{
		super(name,age,email,contact);
		this.degree=degree;
		this.sal=sal;
	}
	public void show()
	{
		System.out.println("Degree\t: "+degree);
		super.show();
		System.out.println("Salary\t: "+sal);
	}
}
public class MethodOverriding3 {
		public static void main(String args[])
		{
			Person p = new Person("shiv",23,"shiv@gmail.com","6366795345");
			p.show();
			System.out.println(".......................");
			Teacher t = new Teacher("shiv",23,"shiv@gmail.com","6366795345","B.E",45000);
			t.show();
		}
}
