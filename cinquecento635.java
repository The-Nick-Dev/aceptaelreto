import java.util.Scanner;

public class cinquecento635 {

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
		
		double siglo = (double) entrada / 100;
		siglo = Math.ceil(siglo);
		
		System.out.println((int) siglo);
	}

}
