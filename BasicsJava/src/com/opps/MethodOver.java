package com.opps;

public class MethodOver {
		public void Area(float rad)
		{
			float pi=3.142f;
			float circlearea = pi*rad*rad;
			System.out.println("Area of Circle: "+circlearea);
		}
		public void Area(float length, float breadth)
		{
			float rectanglearea = length*breadth;
			System.out.println("Area of Rectangle is: "+rectanglearea);
		}
		public void Area(int side)
		{
			int squarearea = side *side;
			System.out.println("Area of Square is: "+squarearea);
		}
		public void Area(float base, int height)
		{
			float trianglearea = 1/2*base*height;
			System.out.println("Area of Trianlge is: "+trianglearea);
		}
		public static void main(String args[])
		{
				MethodOver md = new MethodOver();
				md.Area(2.4f);
				md.Area(2.3f, 4.5f);
				md.Area(5);
				md.Area(3.4f,6.7f);
				
		}
}
