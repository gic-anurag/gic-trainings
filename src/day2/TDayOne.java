
//Day2: Syntax,variables,Data types, type casting, operators,Strings,Math,Booleans

package day2;
import java.util.Scanner;

public class TDayOne {                            //class name always starts with uppercase.variable starts with lower case bt both of then use camel rule nameing convension.
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	
	//Syntax: set of rules and regulations by useing which we write programs are called syntax.
	
    	int a=10,b=20;
	    int c=25;
	
	
	//variable: a named memory location which hold the address of value.
	// Data type: the types of data are called Data type.
	//Literals: the constant value wchich are inisialised in the variable are litrals .
	System.out.println("choose any operation 1 for add, 2 for sub, 3 for mul, 4 for div");
	int option=sc.nextInt();
	switch(option)
	{
	case 1:
		System.out.println("add="+  a+b);
		break;
	case 2:
		System.out.println("sub="+  (a-b));
		break;
	case 3:
		System.out.println("mul="+ a*b);
       break;
	case 4:
		System.out.println("div="+ a/2);
		break;
		default:
			System.out.println("wrong option");
			break;
			
	}
	DaytwoTypCast d2t =new  DaytwoTypCast();
	d2t.cast();
	d2t.loop();
	    
    }
	
}
