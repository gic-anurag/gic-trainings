package day7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Day7d {
	//FILE IO
	public static void main(String[] args) {
		
		
		
		try {
			//for save the file into hdd or other palce...
		File filepath=new File("D:\\prac\\Text1.txt");
	OutputStream out=new FileOutputStream(filepath);
	
	String msg="my first document";
	out.write(msg.getBytes());
	
		out.close();
		
		//for gate or read  the file from hdd or other palce...
		
	FileInputStream in=new FileInputStream("D:\\prac\\Text1.txt");
	int i=0;
	while((i=in.read())!=-1) {
	System.out.print((char)i);
	}
	in.close();
	
	System.out.println("\ndata save :"+filepath.getName());
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
