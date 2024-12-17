

import java.util.Scanner;

public class artropodos293 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		for (int i=0; i < numPeticiones; i++) {
			function();
		}
	
	}

	public static void function() {
		
		int insectos = entrada.nextInt();
		int aracnidos = entrada.nextInt();
		int crusty = entrada.nextInt();
		int escalop = entrada.nextInt();
		int anillosEscalop = entrada.nextInt();
	
		insectos = insectos * 6;
		aracnidos = aracnidos * 8;
		crusty = crusty * 10;
		
		int totalEscalop = escalop * (anillosEscalop*2);
		System.out.println(insectos + aracnidos + crusty + totalEscalop);
		
	}
	
}
