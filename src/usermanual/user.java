package usermanual;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Selection = 1;		
		
		while(Selection!=4) {
		System.out.println("choose any option to implement");
		System.out.println("1. to implement add");
		System.out.println("2. to implement remove");
		System.out.println("3. to implement quit");
		
	    int Selection1 = input.nextInt() ;
		
		switch(Selection1) {
		case 1 :
              System.out.println("input 1 selcted ");
              break;
		case 2 :
			System.out.println("input 2 selcted ");
            break;
        case 3 :
            System.out.println("input 3 selcted ");
            break;
        case 4:
            System.exit(0);
        break;
        default: System.out.println("wrong input ");
            break;
			
		}
        }
		
	}
}

