package day6;
import java.util.Scanner;
import java.util.regex.*;  
public class Day6b2{  
	
	public static void main(String[] aregs) {
		Day6b2 d6=new Day6b2();
		d6.m1();
		d6.m2();
	}
	
public void m1(){  
System.out.println("by character classes and quantifiers ...");  
System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7979765096")); 
System.out.println(Pattern.matches("[789][0-9]{9}", "9955240069"));//  
  
System.out.println(Pattern.matches("[789][0-9]{9}", "9060707325"));  
System.out.println(Pattern.matches("[789][0-9]{9}", "9836563949"));  
System.out.println(Pattern.matches("[789][0-9]{9}", "5673838949"));
  
System.out.println("by metacharacters ...");  
System.out.println(Pattern.matches("[789]{1}\\d{9}", "9876543210"));
System.out.println(Pattern.matches("[789]{1}\\d{9}", "9764867849"));  
  
}

public void m2() {
	   
	        Scanner sc=new Scanner(System.in);  
	        while (true) {    
	            System.out.println("Enter regex pattern:");  
	            Pattern pattern = Pattern.compile(sc.nextLine());    
	            System.out.println("Enter text:");  
	            Matcher matcher = pattern.matcher(sc.nextLine());    
	            boolean found = false;    
	            while (matcher.find()) {    
	                System.out.println("I found the text "+matcher.group()+" starting at index "+    
	                 matcher.start()+" and ending at index "+matcher.end());    
	                found = true;    
	            }    
	            if(!found){    
	                System.out.println("No match found.");    
	            }    
	        }    
	    }    
   }
