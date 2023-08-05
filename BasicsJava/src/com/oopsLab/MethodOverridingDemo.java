package com.oopsLab;
class Person
{
	protected String name;
	protected int id;
	Person(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void show()
	{
		System.out.println("Name\t: "+name);
		System.out.println("Id\t: "+id);
	}
}
class DemoEmployee extends Person
{
	String designation;
	DemoEmployee(String name,int id,String designation)
	{
		super(name,id);
		this.designation=designation;
	}
	public void show()
	{
		super.show();
		System.out.println("Desig\t: "+designation);
	}
}
public class MethodOverridingDemo {
	public static void main(String args[])
	{
		Person p = new Person("john",123);
		p.show();
		System.out.println("...............");
		DemoEmployee e = new DemoEmployee("john",123,"HR");
		e.show();
		
	}
}
