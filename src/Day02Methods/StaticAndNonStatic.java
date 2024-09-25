package Day02Methods;

public class StaticAndNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	myMethod1 (2,1);
	
	StaticAndNonStatic StaticAndNonStaticObj = new StaticAndNonStatic();    //creation or object
	
	StaticAndNonStaticObj.myMethod2(2, 2);
	StaticAndNonStaticObj.myMethod3(0, 0);
	}
	
	
	public static void  myMethod1 (int a, int b) {   // static method
		
		int c = a +  b;
		
		System.out.println (c);
	}


     public void myMethod2 (int a, int b) {          // non static
	
   int c = a + b;
   System.out.println (c);
   
     }
     
     public void myMethod3 (int a, int b) {          // non static
    		
    	   int c = a + b;
    	   System.out.println (c);
    	   
    	     }


}
