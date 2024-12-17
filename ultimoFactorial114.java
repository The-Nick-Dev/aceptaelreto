import java.util.Scanner;

public class ultimoFactorial114 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int entrada = scan.nextInt();
		int total = 0;

		switch (entrada) {
		case 0:
			total = 1;
			break;
		case 1:
			total = 1;
			break;
		case 2:
			total = 2;
			break;
		case 3:
			total = 6;
			break;
		case 4:
			total = 4;
			break;
		default:
			total = 0;
			break;
		}

		System.out.println(total);
	}

}
