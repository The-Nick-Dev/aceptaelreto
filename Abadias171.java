/**
 * Abadías pirenáicas / 171
 * 
 * @author Nick
 * @version 07.11.2024
 */
public class Abadias171 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int montanas = entrada.nextInt();
		if (montanas == 0) {
			return false;
		}

		int[] array = new int[montanas];

		for (int i = 0; i < montanas; i++) {
			array[i] = entrada.nextInt();
		}

		int contador = 0;
		int maximo = 0;
		for (int i = array.length-1; i >= 0; i--) {
			if (array[i] > maximo) {
				contador++;
				maximo = array[i];
			}
		}

		System.out.println(contador);

		return true;
	}
}