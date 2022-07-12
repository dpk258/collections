package hashcode_withequals;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		
		HashSet<Employee> emp = new HashSet<Employee>();
		Employee obj = new Employee("jiya", 12, 10);
		//System.out.println("Hashcode" + obj.hashCode());
		emp.add(obj);
		Employee obj1 = new Employee("Jiya", 2, 10);
		emp.add(obj1);
		
		Iterator<Employee> IT = emp.iterator() ;
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}

		//System.out.println(emp);
	}
		
		
	}
		
	


