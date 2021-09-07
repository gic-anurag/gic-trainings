//  Java: Enums, ArrayList, LinkedList, HashMap, HashSet, Iterator, Wrapper Classes, TreeMap


package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Day5b {
  /*                   ArrayList
   * It uses Growable array as its data structure.
   * Duplicates are allowed.
   * insertion order is preserved
   * Null insertion allowed.
   *         Constructor
   *   there r 3 constructor for ArrayList
   *   1>  ArrayList <String> al=new ArrayList();
   *   2>  ArrayList l=new ArrayList(int initial capacity);
   *   3>ArrayList l= new ArrayList(collection);
   */
	 
	public static void main(String[] args) {
	List<String> arrList=new ArrayList<>();
	
	arrList.add("Apple");
	arrList.add("Guava");
	arrList.add("Orange");
	arrList.add("Banana");
	System.out.println("without sorted");
	System.out.println(arrList);
	Collections.sort(arrList);
	System.out.println("sorted");
	int count=0;
	for (String fruit : arrList) {
		count++;
		
		if(fruit.equals("Banana")) {
			arrList.set(count, "Strawbarry");
		}
		System.out.println(fruit);
	}
	System.out.println("fetching through list iterator");
	ListIterator<String> li=arrList.listIterator();
	//Iterator<String> li=arrList.iterator();
			
	while (li.hasNext()) {
		System.out.println(li.next());
		if(li.next().equals("Banana")) {
			li.set("Strawbarry");
		}
		
	}
	System.out.println("after modify through list iterator");
	System.out.println(arrList);
}
}
