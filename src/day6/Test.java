package day6;


import java.util.ArrayList;
import java.util.List;

public class Test {
	public Test(int a,int b) {
		System.out.println("beta constructor me ho tum"+(a+b));
	}
	 void m2(int a,int b) {
		System.out.println("dekha ham hai m2");
	}
	
	public static void main(String args[]) {
		
//		Day6d d=new Day6d() {
//			
//			@Override
//			 public void m1() {
//				System.out.println("meri jaan ho tum");
//				
//			}
//		};
//		d.m1();
		//lamda functional interface impl...
//		Day6d d=(a,b)->
//		System.out.println("Addition"+(a+b));
//			
//		
//		d.m1(10, 20);
		//static method refernece
//		Day6d d=Test::m2;
//		d.m1(0, 0);
//		
		
		//instance method refernce
//		Test t1=new Test();
//		Day6d d=t1::m2;
//		d.m1(0, 0);
		
	
		List<String> l=new ArrayList<>();
		l.add("Anurag");
		l.add("pahar");
		l.add("baba");
		l.forEach(
				
			(name)->{
				System.out.println("name :"+name);
			});
		//constructor method refernec
		Day6d d=Test::new;
		d.m1(10, 20);
		
		
		

}
}
