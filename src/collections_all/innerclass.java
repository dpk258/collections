package collections_all;

class outer{
	private int x =10 ;
	
	class inner{
		void show () {
			System.out.println("value of x :-" + x);
		}
	}
}

public class innerclass {

	public static void main(String[] args) {
		outer obj = new outer();
		outer.inner in = obj.new inner () ;
		in.show();

	}

}
