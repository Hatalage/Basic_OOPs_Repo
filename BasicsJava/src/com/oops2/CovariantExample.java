package com.oops2;
class calc
{
	public Object add()
	{
		return 12;
	}
}
class simplecalc extends calc
{
	public String add()
	{
		return "Shiv";
	}
}
public class CovariantExample {
	public static void main(String args[])
	{
		calc c = new calc();
		c.add();
		simplecalc sc = new simplecalc();
		String m = sc.add();
		System.out.println(m);
		
	}
}
