import java.util.Scanner;

public class TestScanner3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		int x = scanner.nextInt();
		scanner.nextLine();  // consume the newline after the nextInt
		System.out.println("x = " + x);
		String s = scanner.nextLine();
		System.out.println("'" + s + "'");
	}
}

