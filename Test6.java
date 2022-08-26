package youtube;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 System.out.println(10/0);
		} 
		catch(ArithmeticException ae)
		{
			System.out.println("catach".charAt(10));
		}
		finally {
			int[] a = {1,2,3,4,5};
			System.out.println(a[10]);
			System.out.println("Finally blocks");//AIOBE
		}

	}

}
