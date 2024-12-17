
public class PiezaPerdida168 {
	static java.util.Scanner entrada = new java.util.Scanner(System.in);

	public static void main(String args[]) {
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int numeroPiezas = entrada.nextInt();
		int sumaTotal = 0;
		for (int i = 1; i < numeroPiezas; i++) {
			sumaTotal += entrada.nextInt();
		}
		if (numeroPiezas == 0) {
			return false;
		}

		int calculo = (numeroPiezas + numeroPiezas * numeroPiezas) / 2;

		System.out.println(calculo - sumaTotal);
		return true;
	}
}