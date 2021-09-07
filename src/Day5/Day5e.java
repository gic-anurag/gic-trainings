package Day5;

public class Day5e {
	public void PtoO (){  
	  
	int a=20;  
	Integer i=Integer.valueOf(a);  
	Integer j=a;  
	  
	System.out.println(a+" "+i+" "+j);  
	}
	public void OtoP() {
		Integer a=new Integer(3);    
		int i=a.intValue(); 
		int j=a;
		    
		System.out.println(a+" "+i+" "+j); 
	}
	public static void main(String[] args) {
		Day5e d5=new Day5e();
		d5.PtoO();
		d5.OtoP();
	}
	}  




