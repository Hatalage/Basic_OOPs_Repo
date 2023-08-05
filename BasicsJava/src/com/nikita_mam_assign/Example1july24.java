package com.nikita_mam_assign;
interface shape
{
	public abstract void draw();
	public abstract void erase();
}
class Circle implements shape
{
	public void draw()
	{
		System.out.println("draw the circle");
	}
	public void erase()
	{
		System.out.println("erase the circle");
	}
}
class Triangle implements shape
{
	public void draw()
	{
		System.out.println("draw the triangle");
	}
	public void erase()
	{
		System.out.println("erase the triangle");
	}
}
class Square implements shape
{
	public void draw()
	{
		System.out.println("draw the square");
	}
	public void erase()
	{
		System.out.println("erase the square");
	}
}
public interface Example1july24 {
	public static void main(String[] args) {
		shape s = new Circle();
		s.draw();
		s.erase();
		s=new Triangle();
		s.draw();
		s.erase();
		s=new Square();
		s.draw();
		s.erase();
				
	}
}
