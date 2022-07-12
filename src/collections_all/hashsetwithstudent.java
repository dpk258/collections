package collections_all;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetwithstudent {

	public static void main(String[] args) {

		HashSet<STUDENT> Students = new HashSet<STUDENT>();
		STUDENT std = new STUDENT("jiya", 21, 31, "Bsc");

		STUDENT std1 = new STUDENT("DEEPAK", 27, 07, "B.tech");
		STUDENT std2 = new STUDENT("jiya", 21, 31, "Bsc");
		Students.add(std);
		Students.add(std1);
		Students.add(std2);

		System.out.println(Students); // only work if we override to string
		/*
		 * Iterator<STUDENT> it = Students.iterator(); while(it.hasNext()) { STUDENT S =
		 * it.next() ; System.out.println(S.getName()); System.out.println(S.getAge());
		 * System.out.println(S.getRoll()); System.out.println(S.getCourse()); }
		 */

	}
}