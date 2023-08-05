package assign7july;

public class Tableupto5 {
	public static void main(String args[])
	{
		for(int table = 1; table<=10; table++)
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("      "+table+"*"+i+"="+(table*i));
			}
			System.out.println("----------------");
		}
	}

}
