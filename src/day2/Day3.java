package day2;
import java.util.Scanner;
public class Day3 {
	
public void add(int a,int b) {
	System.out.println("add= "+  a+b);
}

public void sub(int a,int b) {
	System.out.println("sub= "+  (a-b));
}

public void mul(int a,int b) {
	System.out.println("add= "+  a*b);
}

public void div(int a,int b) {
	System.out.println("add= "+  a/b);
}
public static void main(String[] args) {
	Day3 d3=new Day3();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two no");
	int op=sc.nextInt();
	switch(op) {
	case 1:
		d3.add(10,20);
		break;
	case 2:
		d3.sub(20,10);
		break;
	case 3:
		d3.mul(10,20);
		break;
	case 4:
		d3.div(20,10);
		break;
		default:
			System.out.println("invalid option");
			break;
	}
}

}
