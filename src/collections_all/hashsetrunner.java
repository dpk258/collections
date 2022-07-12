package collections_all;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetrunner {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Delhi");
		cities.add("Kolkata");
		cities.add("Patna");

		// System.out.println(cities);

		Iterator<String> IT = cities.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
		}

	}

}
