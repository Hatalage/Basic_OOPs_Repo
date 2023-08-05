package assign6july;

import java.util.Scanner;

public class BreakWhileDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range: ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			if(i%3==0)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
