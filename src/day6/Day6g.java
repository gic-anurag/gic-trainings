package day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Day6g{
	
	public static void main(String[] args) {
		Day6h [] job= {new Day6h("anu"),
				new Day6h("baba"),
				new Day6h("pra"),
				new Day6h("monu"),
				new Day6h("boby"),
				new Day6h("kali")};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for (Day6h day6h : job) {
			service.submit(day6h);
		}
		service.shutdown();
	}
	
}

class Day6h implements Runnable{
	
String name;
public Day6h(String name) {
	this.name=name;
}
public void run() {
	System.out.println(name +"job statred by THread:"+Thread.currentThread().getName());
	try {
		Thread.sleep(5000);
	} catch (Exception e) {

	}
	System.out.println(name +"job complited by THread:"+Thread.currentThread().getName());
}
}
