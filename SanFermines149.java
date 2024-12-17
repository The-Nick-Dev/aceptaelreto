/**
 * San Fermines / 149
 * 
 * @author Nick
 * @version 07.11.2024
 */
public class SanFermines149 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		if (!entrada.hasNext())
			return false;

		int repeticiones = entrada.nextInt();
		int max = 0;

		for (int i = 0; i < repeticiones; i++) {
			int num = entrada.nextInt();
			if (num > max) {max = num;}
		}

		System.out.println(max);

		return true;
	}
}