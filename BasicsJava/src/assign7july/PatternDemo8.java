package assign7july;

public class PatternDemo8 {
	public static void main(String args[])
	{
		int n=3;
		for(int i=1; i<=n*2-1; i++)
		{
			if(i!=n)
			{
				for(int j=1; j<=n; j++)
				{
					if(j==n)
					{
						System.out.print("*");
					}
					System.out.print(" ");
				}
			}
					else
					{
						for(int k=1; k<=n*2-1; k++)
						{
							System.out.print("*");
						}
					}
			System.out.println(" ");
		}
	}
}
