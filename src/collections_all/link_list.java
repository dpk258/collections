package collections_all;

import java.util.Iterator;
import java.util.LinkedList;

public class link_list {

	public static void main(String[] args) {

   LinkedList<Integer> linklist = new LinkedList<Integer>();
   linklist.add(50);
   linklist.add(20);
   linklist.add(30);
   linklist.add(40);
   linklist.add(10);
   
   System.out.println(linklist.getLast());
   Iterator<Integer> it = linklist.iterator(); 
   while(it.hasNext())
   System.out.println(it.next());

	}

}
