
public class LadoCalle217 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int numero = entrada.nextInt(); 
		if (numero == 0) { 
			return false;
		}
		
		if (numero % 2 == 0) {
			System.out.println("DERECHA");
		} else {
			System.out.println("IZQUIERDA");
		}
		
		
		return true;
	}
}