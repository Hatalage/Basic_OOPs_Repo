package com.opps;


class Pen {
	String name;
	int prise;
	String color;
	public Pen(String name, int prise, String color)
	{
		this.name=name;
		this.prise=prise;
		this.color=color;
	}
	public void showPen()
	{
		System.out.println(name+" "+prise+" "+color);
	}
	public String toString()
	{
		return name+" "+prise+" "+color;
	}
}
public class Bag {
		String name;
		int prise;
		String color;
		Pen pn;
		public Bag(String name, int prise, String color, Pen pn)
		{
			this.name = name;
			this.prise = prise;
			this.color = color;
			this.pn = pn;
		}
		public void showbag()
		{
			System.out.println(name+" "+prise+" "+color);
			pn.showPen();
		}
		public String toString()
		{
			return name+" "+prise+" "+color;
		}
		public static void main(String args[])
		{
			Bag b = new Bag("Skybag", 1000,"black", new Pen("Reynolds",100,"black"));
			b.showbag();
		}
}
