import java.util.Scanner;

public class CumpleGeorge730 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int num = scan.nextInt();

		String binario = Integer.toBinaryString(num);
		
		int contador = 0;
		for (int i = 0; i<binario.length();i++) {
			if (binario.charAt(i)=='1') {
				contador++;
			}
		}
		
		System.out.println(contador);
		
		
	}

}