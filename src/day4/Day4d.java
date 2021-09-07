package day4;

import com.gridPractice.OuterClass;
import com.gridPractice.OuterClass.InnerClass;

public class Day4d {
	
		 String name;
			
			public Day4d(String name) {
				this.name=name;
			}
			
			class InnerClass{
				
				
				public  void discloseSecret() {
					//Day4d outer=new Day4d("Anurag");
					
					if(name=="Anurag")
					System.out.println("Welcome to you in my Secrete");
				else 
					System.out.println("Sorry you are not Allow !!!!");
				}
			}
			
			public static void main(String args[]) {
				
				//Day4d.InnerClass.discloseSecret();
				Day4d.InnerClass outer=new Day4d("Anurag").new InnerClass();
				outer.discloseSecret();
				
				
			}

		}



