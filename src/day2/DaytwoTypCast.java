package day2;

public class DaytwoTypCast {

	private static Object[] ar;
	private int i;
	// this method shows typ casting.
	//typ casting: coverting data types bigger to smaller and smaller to bigger is called typ casting
	//there r two typs of typ casting which are implicit and explisit typ casting.
	//implicit casting is also known as automatic typ casting or narrowing.
	// and explicit casting is also known as dynamic casting. the one main thing here is doing explicit typ casting may cause loose of data.
	     public void cast() {
	    byte b=10;
	    int a=b,i;
	    double h=69.9;
	    int[] ar=new int[10];
	    System.out.println("cast a="+a);
	    
	    a=407;
	    System.out.println("new value assined="+ a);
	    byte c=(byte)a;
	    System.out.println(c);
	    System.out.println("math adj"+Math.abs(h));
	    System.out.println(Math.addExact(a,b));
	    System.out.println(Math.min(10,20));
	    System.out.println(Math.max(10,20)); 
	     }
	    public  void  loop() {
	    	for (i = 0; i <10; i++) {
				 ar[i]=i;
				 }
	    	for(i=0;i<ar.length;i++) {
	    		System.out.println(ar[i]);
	    	}
	    
	     }
	     }

	

