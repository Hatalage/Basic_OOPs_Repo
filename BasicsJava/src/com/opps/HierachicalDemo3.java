package com.opps;
class MobileNames
{
	int prise = 100000;
	String name;
}
class Redmi extends MobileNames
{
	public void showPrise1() {
		name = "Redmi";
		System.out.println(prise+ " " + name);
}
}
class Vivo extends MobileNames
{
	public void showPrise2() {
		name = "Vivo";
		System.out.println(prise + " " + name);
}
}
public class HierachicalDemo3 
{
	public static void main(String args[])
	{
		Redmi r = new Redmi();
		r.showPrise1();
		Vivo v = new Vivo();
		v.showPrise2();
				
	}
}

		

