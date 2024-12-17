
public class Perimetro155 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int numero = entrada.nextInt();
		int numero2 = entrada.nextInt();
		if (numero < 0 || numero2 <0) { 
			return false;
		}

		
		int resultado = (numero*2) + (numero2*2);
		
		System.out.println(resultado);
		
		return true;
	}
}