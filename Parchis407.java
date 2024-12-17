/**
 * Rebotando en el parchís / 407
 * 
 * @author Nick
 * @version 27.11.2024
 */
public class Parchis407 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int c = entrada.nextInt();
		int p = entrada.nextInt();
		int t = entrada.nextInt();
		if (c == 0 && p == 0 && t == 0) {
			return false;
		}

		boolean subir = true;
		while (t > 0 && subir == true) {
			t--;
			p++;
			if (p == c) {
				subir = false;
			}
		}

		while (t > 0 && subir != true) {
			t--;
			p--;
		}
		
		System.out.println(p);
		
		return true;
	}

}