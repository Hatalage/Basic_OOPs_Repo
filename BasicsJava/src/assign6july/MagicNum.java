package assign6july;

import java.util.Scanner;

public class MagicNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int magic = 50;
		int count=0;
		while(true)
		{
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			if(num>magic)
			{
				System.out.println("Num is greater");
				count++;
				continue;
			}
			else if(num<magic)
			{
				System.out.println("Num is smaller");
				count++;
				continue;
			}
			else
			{
				System.out.println("Correct!!");
				count++;
				break;
			}
		}
		System.out.println("The number of guessing: "+count);
	}

}
