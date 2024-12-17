import java.util.Scanner;

public class bandurria634 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		String entrada = scan.nextLine();
		int puntTotal = 0;
		int contador = 0;
		
		for (int i = 0; i < entrada.length(); i++) {

			if (entrada.charAt(i) == 'O') {
				contador += 10;
			} else {
				contador = 0;
			}
			puntTotal += contador;

		}

		System.out.println(puntTotal);
	}

}
