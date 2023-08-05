package assign6july;

import java.util.Scanner;

public class WhileSq {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int sq=i*i;
			System.out.println(sq);
			i++;
		}
		
	}

}
