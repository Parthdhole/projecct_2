package youtube;

import java.util.Scanner;

public class Test8 {
   public static void main (String[] args)
   { Scanner s = new Scanner(System.in);
      System.out.println("Enter Number");
     int n = s.nextInt();
    try {
	   System.out.println(10/0);
	  try 
	  {
		System.out.println("ratan".charAt(2));  
	  }
	  catch(StringIndexOutOfBoundsException ae)
	  {
		  System.out.println("ratanit");
		  
	  }
  }
  catch(ArithmeticException ar)
  {
	 System.out.println("durgasoft");
  }
    finally {
    	System.out.println("finally block");
    }
    System.out.println("rest of Application");


}
}