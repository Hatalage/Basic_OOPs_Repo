package LabAssignment;

public class Barrel {
	public static void main(String args[])
	{
		for(int i=1; i<=20; i++)
		{
			if(i<=10)
			{
			int p1 = i*89;
			System.out.println(p1);
	    	}
		   else
		    {
			int p2 = i*(89-i);
			System.out.println(p2);
		    }
		
	}

}
}
