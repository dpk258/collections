package collections_all;

public class hashcode_equals {

	public static void main(String[] args) {

		String a = "abcd";
		String b = "abcd";
		
		
		 if (a.equals(b)) { System.out.println(a.hashCode()+"uper "+ b.hashCode()); }
		 
		
		 if (!a.equals(b)) {
			System.out.println(a.hashCode()+"neeche "+ b.hashCode());
		}
	
	}

}
