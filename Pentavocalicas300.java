import java.util.Scanner;

public class Pentavocalicas300 {

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
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};

		int contador = 0;
		for (int i = 0; i < vocales.length; i++) {
			if (entrada.contains(String.valueOf(vocales[i]))) {
				contador++;
			}
		}

		if (contador == 5) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
