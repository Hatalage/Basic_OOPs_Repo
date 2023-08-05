package com.classTest;
interface Player
{
	public abstract void play();
}
class Child implements Player
{
	public void play()
	{
		System.out.println("A child plays a Music");
	}
}
class Musician implements Player
{
	public void play()
	{
		System.out.println("A Musician plays a Music");
	}
}
class Actor implements Player
{
	public void play()
	{
		System.out.println("An Actor plays a Music");
	}
}
public interface Example9july21 {
		public static void main(String args[])
		{
			Player py = new Child();
			py.play();
			py=new Musician();
			py.play();
			py=new Actor();
			py.play();
		}
}
