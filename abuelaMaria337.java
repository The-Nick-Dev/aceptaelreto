import java.util.Scanner;

public class abuelaMaria337 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		entrada.nextLine();
		for (int i=0; i< numPeticiones;i++) {
			function();
			
		}
	
	}

	public static void function() {
		
		int[] dientesArriba = new int[6];
		int[] dientesAbajo = new int[6];
		
		for (int i=0;i<6;i++) {
			int cosa = entrada.nextInt();	
			dientesArriba[i] = cosa;
		}
		
		for (int i=0;i<6;i++) {
			int cosa = entrada.nextInt();	
			dientesAbajo[i] = cosa;
		}
		
		int contador = 0;
		int resultado = dientesArriba[0] + dientesAbajo[0];
		for (int i = 0; i<dientesArriba.length;i++) {
			if (dientesArriba[i] + dientesAbajo[i] == resultado) {
				contador++;
			}
		}
				
		if (contador == 6) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		
	}
	
}
