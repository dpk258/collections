package hashmapwithstudent;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<student, Integer> map = new HashMap<student, Integer>() ;
		
		student std = new student("Deepak", 27, 01, "Rajeev");
		student std1 = new student("Sonam", 27, 02, "Rajeev");
		student std2 = new student("Choti", 27, 03, "Rajeev");
		student std3 = new student("Deepak", 27, 04, "Rajeev");
		
		map.put(std, 1);
		map.put(std1, 2);
		map.put(std2, 3);
		map.put(std3, 4);

		//System.out.println(map);
		
		for (student x : map.keySet() ) {
			System.out.println(x);
			System.out.println(x.name);

		}
		System.out.println(map.containsKey(std3));
		System.out.println(map.containsValue(std3));
	}
	

}
