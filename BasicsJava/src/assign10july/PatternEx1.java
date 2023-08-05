package assign10july;

public class PatternEx1 {
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++) 
		{
			char ch='A';
			for(int j=1; j<=5-i; j++)
			{
//				char ch=(char)j;
				System.out.print((ch++)+" ");
			}
			for(int j=1; j<=i; j++)
			{
			System.out.print(j+" ");
		}
			System.out.println();
	}
	}
}
