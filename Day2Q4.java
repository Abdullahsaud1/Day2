import java.util.Scanner;

public class Day2Q4 {

	public static void main(String[] args) {
		Scanner A = new Scanner (System.in);
		System.out.println("Please enter the first number ");
		int x =A.nextInt();
		System.out.println("Please enter the Second number ");
		int y=A.nextInt();
		System.out.println("Please enter the third number ");
		int z =A.nextInt();
		if (x>y && x>z) {
		    System.out.println(" The largest number is : " + x);
		}
		else if (y>x && y>z) {
		      System.out.println(" The largest number is : " + y);  
		}
		else if(z>x && z>y ) {
		            System.out.println(" The largest number is : "  +z);
		
	}  else if (x == y && x== z) {
		System.out.println("equal number ");
		
	}
		
		
		else {
		System.out.println("no number");
	}
		System.out.println("Please enter the  number");
	}
	}


