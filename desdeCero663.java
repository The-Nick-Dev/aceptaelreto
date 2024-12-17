import java.util.Scanner;

public class desdeCero663 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int entrada = scan.nextInt();

		if (entrada > 0) {
			entrada-=1;
		}
		System.out.println(entrada);
	}

}
