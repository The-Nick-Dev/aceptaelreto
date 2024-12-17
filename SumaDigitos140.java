/**
 * Suma de dígitos / 140
 * 
 * @author Nick
 * @version 27.11.2024
 */
public class SumaDigitos140 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		String scan = entrada.next();
		if (Integer.parseInt(scan) < 0) {
			return false;
		}
		
		int number = Integer.parseInt(scan);
		int[] digitos = new int[scan.length()];
		for (int i = digitos.length - 1; i >= 0; i--) {
			digitos[i] = number % 10;
			number /= 10;
		}

		int calculo = 0;
		for (int j = 0; j < digitos.length; j++) {
			calculo+=digitos[j];
			System.out.print(digitos[j]);
			if (j!=digitos.length-1) {
				System.out.print(" + ");	
			} else {
				System.out.print(" = ");
			}	
		}
		System.out.println(calculo);

		return true;
	}

}