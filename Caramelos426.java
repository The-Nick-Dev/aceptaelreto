/**
 * Caramelos de reyes / 426
 * 
 * @author Nick
 * @version 28.11.2024
 */
public class Caramelos426 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int numCaramelos = 0;
		int numNinos = -1;
		int intro = 1;

		while (intro != 0) {
			intro = entrada.nextInt();
			numNinos++;
			numCaramelos += intro;
		}

		if (numCaramelos == 0) {
			return false;
		}

		double calculo = (double) numCaramelos / (double) numNinos;
		if (tieneDecimales(calculo)) {
			System.out.println("REPARTO JUSTO");
		} else {
			System.out.println("IMPOSIBLE");
		}

		return true;
	}

	public static boolean tieneDecimales(double numero) {
		return numero % 1 == 0;
	}

}