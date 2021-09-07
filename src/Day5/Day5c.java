package Day5;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day5c {
	/*                   AListList
	   * It uses Doubly LinkedList as its data structure.
	   * Duplicates are  allowed.
	   * insertion order is  preserved
	   * Null insertion allowed.
	   *         Constructor
	   *   there r 3 constructor for ArrayList
	   *   1>  LinkedList <String> al=new LinkedList();
	   *   2>  LinkedList l=new LinkedList(int initial capacity);
	   *   3>LinkedList l= new LinkedList(collection);
	   *
	   */
	//List<String> linkedList=null;
	public static void main(String[] args) {
		
		List<String> linkedList=new LinkedList<>();
		linkedList.add("Anurag");
		linkedList.add("Boby");
		linkedList.add("Pahar");
		linkedList.add("Vivek");
		for (String name : linkedList) {
			System.out.println(name);
			//linkedList.add("Vk");
			
		}
		ListIterator<String> lt=linkedList.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			//linkedList.add("Vk");
			
			
		}
		CopyOnWriteArrayList<String> copy=new CopyOnWriteArrayList<>(linkedList)	;
		int count=0;
		for (String string : copy) {
			count++;
			System.out.println(string);
			if(count==2)
			copy.add(2,"VK");
			
		}
				System.out.println(copy);
	}
	
}
