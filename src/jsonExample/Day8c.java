package jsonExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Day8c {
public static void main(String[] args, char[] result) throws IOException, ParseException {
	JSONParser jsonpar=new JSONParser();
	FileReader reader=new FileReader("D:\\InputJson.JSON");
	Object obj=jsonpar.parse(reader);
   JSONObject epj=(JSONObject)obj;
   for (int i = 0; i < epj.size(); i++) {
	   String s=(String) epj.get("result");
	System.out.println(result);
}
	}
}
