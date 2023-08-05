package com.oops2;
class Flower
{
	public static void fragrance()
	{
		System.out.println("Flower Method");
	}
}
class Rose extends Flower
{
	public static void fragrance()
	{
		System.out.println("rose method");
	}
}
public class TestStaticMethod {
	public static void main(String[] args) {
		Flower f = new Rose();
		f.fragrance();
	}
}
