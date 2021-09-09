package day7;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Day7c {
	//jacson
public static void main(String[] args) {
	
try {
	Map<String, String> map=new HashMap<String, String>();
	map.put("sno", "123");
	map.put("sname", "Vivek");
	map.put("sage", "26");
	//json node
	map.put("spno", "18793487489");
	String json=new ObjectMapper().writeValueAsString(map);
	JsonNode node=new ObjectMapper().readTree(json);
	System.out.println("value based on key :"+node.get("sname"));
	System.out.println("value of node :"+node);
	
	
	//object node
	
	ObjectNode objectNode = new ObjectMapper().convertValue(map, ObjectNode.class);
	System.out.println("value based on key :"+objectNode.get("sname"));
	System.out.println("object node value:\n"+objectNode);
	
	//Array node
	
    ArrayNode arrayNode =  new ObjectMapper().createArrayNode();
    arrayNode.add(node);
    System.out.println("arraynode value:\n"+arrayNode);
	
	
	
}catch (Exception e) {
	e.printStackTrace();
}
}
}


