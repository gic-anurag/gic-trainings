package jsonExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class Day8a {
public static void main(String[] args) {
		
		
		try {
			InputStream in=new FileInputStream("D:\\prac\\InputJson (2).json");
			int i=0;
			String s="";
			while ((i=in.read())!=-1) {
				System.out.print((char)i);
				s+=(char)i;
				
			}
			JsonNode node=new ObjectMapper().readTree(s);
			System.out.println("json node data:  "+node);
			ArrayNode arnode=new ObjectMapper().createArrayNode();
			arnode.add(node);
			System.out.println("Array node data :"+arnode);
		for (JsonNode jsonNode : arnode) {
			System.out.println("1 by 1");
			System.out.println(jsonNode.get("result"));
			
		}
			//System.out.println(arnode.);
			in.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

}
}


