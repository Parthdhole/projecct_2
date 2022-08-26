package youtube;

import java.util.Scanner;

public class Test3 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:"); 
			int n = sc.nextInt();
		System.out.println(10/n);
		System.out.println("ratan".charAt(12));
		}
		catch(ArithmeticException|NumberFormatException ae)
		{
			System.out.println("tata"+ae);
			
		}
		catch(NullPointerException|StringIndexOutOfBoundsException|ClassCastException aae)
		{
			System.out.println("durgasoft");
		}
		/*catch(StringIndexOutOfBoundsException ar)
		{
			System.out.println("exception");
		}*/
		System.out.println("rest of the apllication");

		FielInputStream fid  = new FileInputStream("abs.txt");
		

	}
  
}
