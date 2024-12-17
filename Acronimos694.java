import java.util.Scanner;

public class Acronimos694 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		String num = scan.nextLine();
		String palabra = "";

		// Crea un array de chars con las letras del abecedario en mayúscula
		char[] abecedario = new char[26];

		// Llena el array con las letras A-Z
		for (int i = 0; i < 26; i++) {
			abecedario[i] = (char) ('A' + i);
		}

		String[] palabras = num.split(" ");

		for (String i : palabras) {
			if (i.length() > 0) {
				

				for (char j : abecedario) {
					if (i.charAt(0)== j) {
						palabra += i.charAt(0);
						break;
					}
				}
			}
		}
		System.out.println(palabra);

	}

}