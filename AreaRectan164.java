
public class AreaRectan164 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int alto = entrada.nextInt();
		int alto2 = entrada.nextInt();
		int ancho = entrada.nextInt();
		int ancho2 = entrada.nextInt();
		if (alto > ancho || alto2 > ancho2) { 
			return false;
		}
		
		int anchoReal = ancho - alto;
		int altoReal = ancho2 - alto2;

		
		int resultado = (altoReal) * (anchoReal);
		
		System.out.println(resultado);
		
		return true;
	}
}