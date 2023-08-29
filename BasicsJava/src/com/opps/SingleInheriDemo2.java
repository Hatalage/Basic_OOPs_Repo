package com.opps;
class Tree
{
	String rootclr = "brown";
}
class MangoTree extends Tree
{
	public void display()
	{
		System.out.println(rootclr);
	}
}
public class SingleInheriDemo2 {
	public static void main(String args[])
	{
		MangoTree mt = new MangoTree();
		mt.display();
	}
}
