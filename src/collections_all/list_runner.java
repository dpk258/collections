package collections_all;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class list_runner {

	public static void main(String[] args) {
		List <String> A = new LinkedList<String>();
	     A.add("Deepak");
	     A.add("Jiya");
	     A.add("jayshree");
	     
	    System.out.println(A);
	System.out.println(A.set(1, "Dev"));    
	System.out.println(A);

	     Iterator<String> IT = A.iterator();
	     while(IT.hasNext());
	     System.out.println(IT.next());
	}

}
