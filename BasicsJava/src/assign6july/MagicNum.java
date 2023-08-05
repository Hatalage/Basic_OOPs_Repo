package assign6july;

import java.util.Scanner;

public class MagicNum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int magic = 50;
		while(true)
		{
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			if(num>magic)
			{
				System.out.println("Num is greater");
				continue;
			}
			else if(num<magic)
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
	}

}
