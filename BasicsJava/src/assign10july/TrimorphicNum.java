package assign10july;

import java.util.Scanner;

public class TrimorphicNum {
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int cube = num*num*num;
		while(num!=0)
		{
			if(num%10!=cube%10)
			{
				System.out.println("Not a trimorphic");
				break;
			}
			num=num/10;
			cube=cube/10;
		}
		if(num==0)
		{
			System.out.println("Trimorphic number");
		}
	}
}