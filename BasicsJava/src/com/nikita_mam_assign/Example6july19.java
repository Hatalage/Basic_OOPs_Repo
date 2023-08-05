package com.nikita_mam_assign;
class DemoRectangle
{
	protected double length;
	protected double breadth;
	DemoRectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		double area=length*breadth;
		System.out.println("Area is: "+area);
	}
	public void show()
	{
		System.out.println("length\t: "+length);
		System.out.println("breadth\t: "+breadth);
	}
}
class Box extends DemoRectangle
{
	double depth;
	Box(double length,double breadth,double depth)
	{
		super(length,breadth);
		this.depth=depth;
	}
	public void show()
	{
		super.show();
		System.out.println("depth\t: "+depth);
		}
}
public class Example6july19 {
		public static void main(String[] args) {
			DemoRectangle R = new DemoRectangle(22.33,33.44);
			R.show();
			R.area();
			System.out.println("...........");
			Box b = new Box(44.33,34.56,77.66);
			b.show();
			b.area();
		}
}
