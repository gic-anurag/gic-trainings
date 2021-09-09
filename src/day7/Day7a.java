package day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Day7a implements Serializable {
	
	private String msg;
	public Day7a(String msg) {
		this.msg=msg;
	}

	
	
	//Object serialization and deserializatiomain
	public static void main(String[] args) {
		
	
	try {
	
	ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(new File("D:\\prac\\object.txt")));
	Day7a a=new Day7a("hello i am available for you");
	
	out.writeObject(a);
	System.out.println("object serlized and store AS object in file");
	out.close();
	System.out.println("object deserlized and converted AS object from file");
	ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\prac\\object.txt"));
	Day7a a1=(Day7a)in.readObject();
	System.out.println(a1.msg);
	in.close();
	
}catch (Exception e) {
	e.printStackTrace();
}
	}
}
