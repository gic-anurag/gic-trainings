package day4;

import java.util.Scanner;

public class Day4b extends Day4a implements Day4c{

	public static void main(String[] args) {
		Day4a po=new Day4a();

		Scanner sc=new Scanner(System.in);
	    		  System.out.println("enter roll no");
	       int roll=sc.nextInt();
	      po.setRoll(roll);
	      System.out.println("enter name of student");
	      String name=sc.next();
	      po.setName(name);
	      System.out.println("roll="+ po.getRoll() +"  " +"name="+ po.getName());
	      Day4b d4=new Day4b();
	      d4.m1();
	      d4.m2();
	}
	public void m1() {
  	  System.out.println("example of Interface is working");
    }
    public void m2() {
  	  System.out.println("and it is working properly");
    }
	}


