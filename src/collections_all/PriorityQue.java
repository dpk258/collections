package collections_all;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQue {

	public static void main(String[] args) {
		//Priorityquecomparator obj = new Priorityquecomparator();
	//	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new pqcomparator());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(4);
		pq.add(7);
		pq.add(8);
		pq.add(1);
		
		Iterator IT = pq.iterator();
		while(IT.hasNext())
			System.out.println(IT.next());
		
		System.out.println(pq);
		

	}
}

/*
 * class pqcomparator implements Comparator<Integer>{
 * 
 * @Override public int compare(Integer num1, Integer num2) {
 * System.out.println("compare called"); if (num1>num2) { return -1; } else
 * if(num1<num2) { return 1 ; } else return 0; }
 * 
 * }
 */