package com.opps;
class School
{
	int classrooms = 12;
}
class Greenboard extends School
{
	int boards;
	public void show()
	{
		System.out.println(classrooms);
	}
}
class Chalk extends Greenboard
{
	public void input()
	{
	  boards = 12;
	}
	public void display()
	{
		System.out.println(boards);
	}
}
public class MultiLevelDemo2 {
	public static void main(String args[])
	{
		Chalk c = new Chalk();
		c.input();
		c.display();
		c.show();
		System.out.println(c.classrooms);
	}
}
