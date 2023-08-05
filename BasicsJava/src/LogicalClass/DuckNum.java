package LogicalClass;

import java.util.Scanner;

public class DuckNum {
    public void duck()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the num");
    	int num = sc.nextInt();
    	for(int i=1;i<=num; i++)
    	{
    		int count=0;
    		while(num>0)
    		{
    		int digit = num%10;
    		if(digit==0)
    		{
    			count++;
    		}
    		num=num/10;
    		}
    		if(count==1)
    		{
    			System.out.println("duck num");
    			break;
    		}
    		else
    		{
    			System.out.println("not a duck num");
    			break;
    		}
    		
    	}
    }
    public static void main(String[] args) {
    	DuckNum dn = new DuckNum();
    	dn.duck();
	}
}
