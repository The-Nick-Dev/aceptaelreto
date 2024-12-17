

import java.util.Scanner;

public class laFiesta117 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		entrada.nextLine();
		for (int i=0; i< numPeticiones;i++) {
			function();
			
		}
	
	}

	public static void function() {
		
		String texto = entrada.nextLine();
		
		String texto2 = texto.replace("Soy ", "");
				
		System.out.println("Hola, " + texto2 + ".");
	}
	
}
