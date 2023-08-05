package com.opps;
class Flowers
{
	int petals = 4;
	String name;
}
class Rose extends Flowers
{
	public void showPetals1() {
		name = "Rose";
		System.out.println(petals+ " " + name);
}
}
class Jasmine extends Flowers
{
	public void showPetals2() {
		name = "Jasmine";
		System.out.println(petals + " " + name);
}
}
public class HierachicalDemo2 
{
	public static void main(String args[])
	{
		Rose r = new Rose();
		r.showPetals1();
		Jasmine j = new Jasmine();
		j.showPetals2();
				
	}
}
