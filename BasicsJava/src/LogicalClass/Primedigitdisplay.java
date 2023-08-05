//package LogicalClass;
//
//import java.util.Scanner;
//public static boolean isPrime(int n)
//{
//	boolean isCheck=true;
//	for(int i=2;i<n;i++)
//	{
//		if(n%i==0)
//		{
//			isCheck=true;
//			break;
//		}
//	}
//	return isCheck;
//}
//public static void main(String args[])
//{
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	while(num>0)
//	{
//		int digit=num%10;
//		boolean b = isPrime(digit);
//		if(b==true)
//		{
//			System.out.println(digit);
//		}
//		num=num/10;
//	}
//}
//}
////public class Primedigitdisplay {
////		public void prime()
////		{
////			Scanner sc = new Scanner(System.in);
////			int num=sc.nextInt();
////			int count=0;
////			while(num>0)
////			{
////				int digit=num%10;
////				for(int i=1;i<num;i++)
////				{
////					if(digit%i==0)
////					{
////					count++;
////				}
////					num=num/10;
////				}
////				System.out.println(digit);
////			}
////		}
////		public static void main(String args[])
////		{
////			Primedigitdisplay p = new Primedigitdisplay();
////			p.prime();
////		}
//
