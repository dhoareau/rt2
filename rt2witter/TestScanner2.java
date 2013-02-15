import java.util.Scanner;

public class TestScanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;

		int x = scanner.nextInt();
		System.out.println("x = " + x);
		String s = scanner.nextLine();
		System.out.println("'" + s + "'");
	}
}

