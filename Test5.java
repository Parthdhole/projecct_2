package youtube;

public class Test5 {
	void m3()
	{ try {
		System.out.print(10/0);
	}
	catch(ArithmeticException e){
		System.out.println(e.toString());
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
  void m2()
  { 
	  m3();
	  
  }
	void m1()
	{ 
		m2();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t = new Test5();
		t.m1();
	}

}
