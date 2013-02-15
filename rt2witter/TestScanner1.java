import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		String s1 = scanner.nextLine();
		System.out.println("'" + s1 + "'");
		String s2 = scanner.nextLine();
		System.out.println("'" + s2 + "'");
		String s3 = scanner.nextLine();
		System.out.println("'" + s3 + "'");
	}
}

