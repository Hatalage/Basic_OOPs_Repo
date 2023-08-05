package lab7julyassignment;

import java.util.Scanner;

public class Example5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int givennum = 4;
		while(true)
		{
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			if(num>givennum)
			{
				System.out.println("Num is greater");
				continue;
			}
			else if(num<givennum)
			{
				System.out.println("Num is smaller");
				continue;
			}
			else
			{
				System.out.println("Correct!!");
				break;
			}
		}
		sc.close();
	}
}
