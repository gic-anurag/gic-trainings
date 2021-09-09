package day6;

public class Day6a {
public void m1() {
	try {
	int a=10;
	int c=a/0;
	System.out.println(c);
	}
	catch (ArithmeticException e) {
		System.out.println("Exception in thread main devided by 0");
	}
	
}
public static void main(String[] args) {
	Day6a d6=new Day6a();
	d6.m1();
}
}
