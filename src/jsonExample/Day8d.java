package jsonExample;

import java.io.FileInputStream;
import java.io.InputStream;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Day8d {
	 public static void main(String[] args) throws Exception {
	    	InputStream in=new FileInputStream("D:\\prac\\InputJson (2).json");
			int i=0;
			String s="";
			while ((i=in.read())!=-1) {
				System.out.print((char)i);
				s+=(char)i;
				ObjectMapper mapper = new ObjectMapper();
			      String fetch=null;
			      JsonNode node=mapper.readTree(fetch);
			      System.out.println(node);
			      ArrayNode arrayNode = (ArrayNode) mapper.readTree(s).get("data");
			      if(arrayNode.isArray()) {
				         for(JsonNode jsonNode : arrayNode) {
				            System.out.println("123::: "+jsonNode.get("taskSpecs"));
				            fetch=jsonNode.get("taskSpecs").toString();
				            }
				         String objJson="";
				     	objJson+="\"multiEngineResults\": {\"suspectResult\": \"\",\"cbvutvi4vResult\": \" \", \"wellknownResult\": \" \",\"uniqueResult\": \"\"}";
				     	JSONParser parser = new JSONParser();  
				     	JSONObject json = (JSONObject) parser.parse(objJson);  
				     	//JsonNode node2=new ObjectMapper().readTree(objJson);
				     	//System.out.println(node2);
				     	
			}
			}
	 }
}

		
	    
