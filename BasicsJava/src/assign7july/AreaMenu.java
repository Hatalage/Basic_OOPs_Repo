package assign7july;

import java.util.Scanner;

public class AreaMenu {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" 1.Area of circle\n 2.Area of rectangle\n 3.Area of Triangle\n 3.Area of Square");
			System.out.println("Enter the choice: ");
			int ch = sc.nextInt();
		
			switch(ch)
			{
			case 1: System.out.println("Enter radius: ");
			        float rad = sc.nextFloat();
			        float pi= 3.142f;
			        float Carea = pi*rad*rad;
			        System.out.println("Area of circle is: "+Carea);
			        break;
			case 2: System.out.println("Enter length: ");
					float length = sc.nextFloat();
					System.out.println("Enter breadth: ");
					float breadth = sc.nextFloat();
					float Rarea = length*breadth;
					System.out.println("Area of circle is: "+Rarea);
					break;
			case 3: System.out.println("Enter base: ");
					float base = sc.nextFloat();
					System.out.println("Enter height: ");
					float height = sc.nextFloat();
					float Tarea = 1/2*(base*height);
					System.out.println("Area of circle is: "+Tarea);
					break;
			case 4: System.out.println("Enter side: ");
					float side = sc.nextFloat();
					float Sarea = side*side;
					System.out.println("Area of circle is: "+Sarea);
					break;
			}
		}
	}

}
