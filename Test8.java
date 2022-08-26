package youtube;

import java.util.Scanner;

public class Test8 {
   public static void main (String[] args)
   { Scanner s = new Scanner(System.in);
      System.out.println("Enter Number");
     int num = s.nextInt();
    try {
	   System.out.println(10/num);
	  try 
	  {     
		System.out.println("ratan".charAt(2));  
	  }
	  catch(StringIndexOutOfBoundsException ae)
	  {
		  System.out.println("parthit");
		  
	  }
  }
  catch(ArithmeticException ar)
  {
	 System.out.println("soft");
  }
    finally {
    	System.out.println("finally block");
    }
    System.out.println("rest of Application");
    System.out.println("more application);


}
}
