import java.util.Scanner;

public class HaySuficientes715 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int uvas = scan.nextInt();
		int personas = scan.nextInt();

		if (uvas >= personas * 12) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}