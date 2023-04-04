import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		Scanner day2 = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num =day2.nextInt();
		
		if(num == 0) {
			System.out.println("0");
		}else if (num>=0) {
			System.out.println("The number is positive");
			
		}else if(num <= -1) {
			System.out.println("The number is negative");
		}else {
			System.out.println("Please enter a number");
		}
	}

}
