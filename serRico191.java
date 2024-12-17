

import java.util.Scanner;

public class serRico191 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		for (int i=0; i< numPeticiones;i++) {
			function();
		}
	
	}

	public static void function() {
		
		int numCompartimentos = entrada.nextInt();
		int capacidadAcuario = entrada.nextInt();
		int diferencia = entrada.nextInt();
		
		int total = numCompartimentos*capacidadAcuario;
		
		for (int i = 1; i<numCompartimentos; i++) {
			total -= diferencia*i;
		}
		
		System.out.println(total);
	}
	
}
