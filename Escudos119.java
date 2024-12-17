/**
 * Escudos del ejército romano / 119
 * 
 * @author Nick
 * @version 27.11.2024
 */
public class Escudos119 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {

		int scan = entrada.nextInt();
		if (scan == 0) {
			return false;
		}
        int escudosTotales = 0; // Total de escudos necesarios

        while (scan > 0) {
            // Lado del mayor cuadrado posible
            int ladoCuadrado = (int) Math.sqrt(scan);
            int legionariosEnCuadrado = ladoCuadrado * ladoCuadrado;

            // Escudos del cuadrado
            escudosTotales += 4 * ladoCuadrado;
            escudosTotales += legionariosEnCuadrado;

            // Resta los legionarios usados en este cuadrado
            scan -= legionariosEnCuadrado;

            // Si sobran legionarios, pasamos a otra iteración
        }
		
		System.out.println(escudosTotales);
        
		return true;
	}

}