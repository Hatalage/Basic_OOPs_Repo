package lab7julyassignment;

public class PrimeNumInDigit {
	public static void main(String args[])
	{
		int num = 456789;
		int count = 0;
		int i=2;
		while(num>0)
		{
			int digit = num%10;
			for(i=2; i<num; i++)
			{
	    	if(digit%i==0)
			{
	    		count++;
	    	
			}
	    	
	    	num = num/10;	
			}
			}
		System.out.println("the number has "+count+" prime digits");
}
}
