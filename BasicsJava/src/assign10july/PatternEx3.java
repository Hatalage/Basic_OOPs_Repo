package assign10july;

public class PatternEx3 {
		public static void main(String args[])
		{
		int n =5;
		int x=1;
		int y=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==1)
				{
					System.out.print(" "+x++);
				}
				else
				{
					System.out.print(" "+(char)(y+64));
					y++;
				}
			}
			System.out.println();
		}
		}
}
