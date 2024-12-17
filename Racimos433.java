/**
 * Racimos de uvas / 433
 * 
 * @author Nick
 * @version 28.11.2024
 */
public class Racimos433 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int uvas = entrada.nextInt();
		if (uvas== 0) {
			return false;
		}

		int alturas = 0;
		int total = 0;
		while (total < uvas) {
			alturas++;
			total += alturas;
		}
		
		System.out.println(alturas);
		
		
		return true;
	}
}