package assign5july;

import java.util.Scanner;

public class InterExample {
      public static void main(String args[])
      {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter number: ");
    	  int num = sc.nextInt();
    	  
    	  for(int i=1; i<=20; i++)
    	  {
    		  if(i%5==0 && i%3==0)
    		  {
    			  System.out.println("OnexTel");
    			  break;
    		  }
    		  
    		  else if(i%3==0)
    		  {
    			  System.out.println("Onex"); 
    			  break;
    		  }
    		  else //if(i%5==0)
    		  {
    			  System.out.println("Tel");
    			  break;
    		  }
    	  }
      }
}

