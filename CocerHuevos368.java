
public class CocerHuevos368 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int numero = entrada.nextInt();
		int numero2 = entrada.nextInt();
		if (numero == 0 || numero2 == 0) { 
			return false;
		}

		double resultado = 0;
		if (numero < numero2) {
			resultado = 10;
		} else {
			resultado = (Math.ceil((double)numero/numero2)) * 10;
		}
		
		System.out.println((int) resultado);
		
		return true;
	}
}