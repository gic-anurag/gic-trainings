package Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Day4d  {
	
	
	public static void main(String args[]) {
		Map<String,String> map=new HashMap<>();
		map.put("name","Vivek");
		map.put("add","Beur");
		map.put("Role","Developer");
		map.put("Salary","100000000");
		
		System.out.println(map);
		//List<String> employeeByKey = new ArrayList<>(map.keySet());
		//Collections.sort(employeeByKey);
		TreeMap<String, String> sort=new TreeMap<>(map);
		System.out.println(sort);
	}

	
	

}
