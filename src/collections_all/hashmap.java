package collections_all;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hvjhv");
		map.put(2, "ggvgvg");
		map.put(3, "hbbhbhb");
		map.put(4, "hbhbhb");
		map.put(5, "nbnnn");//if we provide same key but different value it will overwrite the new value
		
		/*
		 * System.out.println(map);
		 * 
		 * System.out.println(map.get(5)); System.out.println(map.keySet());
		 * System.out.println(map.values()); map.replace(1, "jiya");
		 * System.out.println(map);
		 */
		System.out.println();
	}

}
