
public class Zapping166 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		int canalInicio = entrada.nextInt();
		int canalFin = entrada.nextInt();
		if (canalInicio == 0 && canalFin == 0) {
			return false;
		}
	
		if (canalInicio > canalFin) {
			int aux = canalInicio;
			canalInicio = canalFin;
			canalFin = aux;
		}
		
		int contador1 = canalFin - canalInicio;
		int contador2 = canalInicio + (99- canalFin);


		
		
		
		if (contador1 > contador2) {
			System.out.println(contador2);
		} else {
			System.out.println(contador1);
		}

		return true;
	}
}