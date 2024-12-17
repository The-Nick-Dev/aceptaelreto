/**
 * Las calorías / 363
 * 
 * @author Nick
 * @version 17.12.2024
 */
public class Calorias363 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int calorias = entrada.nextInt();
		if (calorias == 0) {
			return false;
		}

		int numeroVeces = entrada.nextInt();
		int suma = 0;
		for (int i = 0; i<numeroVeces; i++) {
			suma += entrada.nextInt();
		}
		
		double calculo = Math.ceil((double) suma/ (double) calorias);
		
		System.out.println((int) calculo);

		return true;
	}
}