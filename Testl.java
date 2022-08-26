package youtube;

public class Testl  {
 void student() throws InterruptedException,ArithmeticException
 { System.out.println("pp is sleeping");
    Thread.sleep(1000);
    System.out.println("pp is sleeping");
    System.out.println(10/0);
	 
 }
	void hod()throws ArithmeticException
  {
	 try {   student();}
	 catch(InterruptedException ae)
	 {System.out.println("exception handling");
		 
	 }
  }
	void principal()throws ArithmeticException
	{
		hod();
	}
	void officeBoy()throws ArithmeticException
	{   principal();
  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Testl  t = new Testl();
           try{t.officeBoy();}
           catch(ArithmeticException ae){
        	   System.out.println("handel"+ae);
           }
	}

}
