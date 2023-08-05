package com.nikita_mam_assign;
abstract class Equipment
{
	 abstract void mix();
	public void fill()
	{
		System.out.println("Equipments are good");
	}
	
}
class Cement_mixer extends Equipment
{
	public void mix()
	{
		System.out.println("mix the cement well");
	}
	public void Pour()
	{
		System.out.println("Pour the ciment mixture");
	}
}
public class Example1july20 {
		public static void main(String args[])
		{
			Equipment ep = new Cement_mixer();
			ep.fill();
			ep.mix();
			Cement_mixer cm = new Cement_mixer();
			cm.Pour();
			
		}
}
