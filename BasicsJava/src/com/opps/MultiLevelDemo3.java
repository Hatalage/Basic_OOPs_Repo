package com.opps;
class Home
{
	String name = "ShivShrey";
}
class Bedroom extends Home
{
	int rooms;
	public void show()
	{
		System.out.println(name);
	}
}
class Bathroom extends Bedroom
{
	public void input()
	{
		rooms = 4;
	}
	public void display()
	{
		System.out.println(rooms);
	}
}
public class MultiLevelDemo3 {
	public static void main(String args[])
	{
		Bathroom bt = new Bathroom();
		bt.input();
		bt.display();
		bt.show();
		System.out.println(bt.name);
	}
}
