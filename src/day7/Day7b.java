package day7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@SuppressWarnings("unused")
public class Day7b {

public static void main(String[] args) {
	Map<String, String> map=new HashMap<String, String>();
	map.put("sno", "123");
	map.put("sname", "Vivek");
	map.put("sage", "26");
	map.put("spno", "18793487489");
	
	//Gson
	try {	
	//String json = new ObjectMapper().writeValueAsString(map);
	
	//System.out.println(json);
			
	

	//ObjectMapper objectMapper = new ObjectMapper();
		//String json = objectMapper.writeValueAsString(map);
		
		//objectmapper with json node

	JsonNode jsonNode = new ObjectMapper().readTree(new ObjectMapper().writeValueAsString(map));

	System.out.println(jsonNode.get("sno"));
	//object mapper with object node
    OutputStream outputStream = new FileOutputStream(new File("D:\\prac\\Text.txt"));

   // ObjectMapper mapper = new ObjectMapper();//it is use to convert any type in jason object..
   // ObjectNode rootNode = mapper.createObjectNode();
    //rootNode.put("message", "Hi");
    //rootNode.put("lake", "fake");
    //ObjectNode childNode = rootNode.objectNode();
    //childNode.put("name", "World!");
    //mapper.writeValue(outputStream, rootNode);
  //outputStream.write(jsonNode.toString().getBytes());
    int b=0;
 
    	 //outputStream.write(map.toString().getBytes());
    //serialization convert value into object and strore into file.
    	// ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(new File("D:\\prac\\Text.txt")));
    	// ObjectMapper mapper = new ObjectMapper();
    	 //ObjectNode rootNode = mapper.createObjectNode();
    	// rootNode.asText((o.readObject().toString()));
    	 //String s="ram ram";
    	 //o.writeObject(map);
    	//deserialization convert object into value  and show from strored file.
    	 ObjectInputStream obj=new ObjectInputStream(new FileInputStream("D:\\prac\\Text.txt"));
    	 System.out.println(obj.readObject());
    	 
    			 

    	 
		
 
    
		
		


    System.out.println("store");
  // o.close();
   //obj.close();
	
}catch (Exception e) {
	e.printStackTrace();
}
}
}
