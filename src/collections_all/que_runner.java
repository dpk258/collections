package collections_all;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class que_runner {

	public static void main(String[] args) {
     Queue<String> A = new LinkedList<String>();
     A.offer("Deepak");
     A.offer("Jiya");
     A.offer("jayshree");
     
    System.out.println(A);
//System.out.println(A.element());     

     Iterator<String> IT = A.iterator();
     while(IT.hasNext());
     System.out.println(IT.next());// why its not printing anything

	}

}
