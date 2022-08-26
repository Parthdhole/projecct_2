package youtube;

public class Test7 {
    int m1()
    {
    	try
    	{
    		return 10;
    	}
    	catch(ArithmeticException ae)
    	{
    		return 20;
    	}
    	finally
    	{
    		return 30;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Test7 t = new Test7();
     int a= t.m1();
     System.out.println(a);
	}

}
