import java.util.Scanner;

public class PasosStair736 {

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
		int num2 = scan.nextInt();
		
		double resultado = (double) num/num2;
		resultado = Math.ceil(resultado);
				
		
		System.out.println((int) resultado);
		
		
	}

}