

import java.util.Scanner;

public class holaMundo116 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		for (int i=0; i< numPeticiones;i++) {
			callMundo();
		}
	
	}

	public static void callMundo() {
		System.out.println("Hola mundo.");
	}
	
}
