package youtube;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           EmpBean eb1= new EmpBean();
           eb1.seteid(111);
           eb1.setename("ratan");
           
          int eid = eb1.geteid();
          System.out.println(eid);
          String ename = eb1.getename();
          System.out.println(ename);
          
	}

}
