package collections_all;

public class Array_runner {

	public static void main(String[] args) {
		//int arr[] = new int[5];
//	int []arr =new int [5] ;
//		System.out.println(arr.length);
//		arr[0] =20 ;
//		arr[1] =30;
//		arr[2]=40;
//		
		
		int arr[] = { 10, 20 ,30 , 40 };
		System.out.println(arr);
		System.out.println(arr[1]);
		
	

	
	for( int i =0 ; i<arr.length ; i++) {
		System.out.println(arr[i]);
		
	}
	System.out.println("outside for loop");
	System.out.println(arr); // possible in arraylist
}
}