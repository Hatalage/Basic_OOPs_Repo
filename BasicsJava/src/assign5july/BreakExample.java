package assign5july;

public class BreakExample {
	public static void main(String args[])
	{
		for(int i=1; i<=20; i++)
		{
			System.out.println(i);
			if(i%3==0 && i%9==0)
			{
				break;
			}
		}
	}

}
