package LabAssignment;

public class DigitsPrint {
		public static void main(String args[])
		{
			int n=12345;
			int count = 0;
			while(n>0)
			{
				int digit = n%10;
				count++;
				n=n/10;
				System.out.println(digit);
				
			}
			
		}
}
