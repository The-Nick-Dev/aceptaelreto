/**
 * Pintando fractales / 167
 * 
 * @author Nick
 * @version 07.11.2024
 */
public class Fractales167 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		if (!entrada.hasNext())
			return false;

		int longLado = entrada.nextInt();
		int suma = 0;
		int cuadrados = 1;

		while (longLado >= 1) {
			suma += cuadrados * (longLado * 4);
			longLado /= 2;
			cuadrados *=4;
		}

		System.out.println(suma);
		
		return true;
	}
}