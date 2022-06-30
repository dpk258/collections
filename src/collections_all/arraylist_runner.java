package collections_all;

import java.util.*;

public class arraylist_runner {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList () ;
        arr.add(10);
        arr.add(20);
        arr.add(30);
        
//        System.out.println(arr);
//        System.out.println(arr.size());
//        
//        arr.set(0, 50);
//        System.out.println(arr);
//        
//        arr.remove(2);
//        System.out.println(arr);
//        
//        arr.add(0, 25);
//	    System.out.println(arr);
        
        Iterator it = arr.iterator();
        while(it.hasNext())
        	System.out.println(it.next());
        
	}


}
