package prueba;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int x =2;
		boolean f = (x==2 && x >=3)? true:false;
		
		
         System.out.println("f: " + f );
         
          int ax =0;
	    	  while (ax<200) {
			 Random r = new Random();
			 int mov_escogido= r.nextInt(3);
			 System.out.println("mov_escogido: " + mov_escogido );
			 ax++;
	    	  }
         
	    
	    
		String fracasadas[] = new String[300000];
		 System.out.println(fracasadas.length);

		

}
}