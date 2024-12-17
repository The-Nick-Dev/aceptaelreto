/**
 * Ahooro infantil / 424
 * 
 * @author Nick
 * @version 28.11.2024
 */
public class AhorroInfantil424 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int cantidadOperaciones = entrada.nextInt();
		if (cantidadOperaciones == 0) {
			return false;
		}

		int maximo = 0;
		int total = 0;
		for (int i = 0; i < cantidadOperaciones; i++) {

			int numero = entrada.nextInt();
			total += numero;
			if (maximo < total) {
				maximo = total;
			}
		}
		System.out.println(total + " " + maximo);

		return true;
	}
}