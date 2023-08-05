package com.nikita_mam_assign;
class programmer
{
	int hours=8;
	public void workingHours()
	{
		System.out.println("Programmer's working hours is: "+hours);
	}
}
class employee extends programmer
{
	public void workingHours()
	{
		System.out.println("Employee's working hours is: "+hours);
	}
}
public class Example6 {
	public static void main(String args[])
	{
		programmer p = new programmer();
		p.workingHours();
		employee e = new employee();
		e.workingHours();
	}
}
