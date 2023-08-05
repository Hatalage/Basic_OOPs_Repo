package assign7july;

public class PatternDemo5 {
	public static void main(String args[])
	{
		int n=4;
		int num;
		for(int i=1; i<=n; i++)
		{
			num = 1;
			for(int j=n; j>=i; j--)
			{
				System.out.print(num);
				num++;
			}
			System.out.println(" ");
		}
	}

}
