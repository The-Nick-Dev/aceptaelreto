
public class Nochevieja148 {
	static java.util.Scanner entrada;

	public static void main(String args[]) {
		entrada = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

	private static boolean casoDePrueba() {
		

		String texto = entrada.nextLine();
		
		String[] array = texto.split(":");

		int numero = Integer.valueOf(array[0]);
		int numero2 = Integer.valueOf(array[1]);
		if (texto.equals("00:00")) { 
			return false;
		}
		
        int pasados = numero * 60 + numero2;
        int minutosRestantes = 1440 - pasados;

        
        System.out.println(minutosRestantes);

		return true;
	}
}