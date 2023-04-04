import java.util.Scanner;

public class day2Q2 {

	public static void main(String[] args) {
		Scanner A = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name =A.nextLine();
		System.out.println("Enter a letter : ");
		String letter =A.nextLine();
		System.out.println("Enter number");
		int num = A.nextInt();
		
		
		
		
		System.out.println(name.charAt(num));
		System.out.println(name.contains(letter));
	}

}
