import java.util.Scanner;

public class Escalera540 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int piso = scan.nextInt();
		int escalones = scan.nextInt();
		int pisoExtra = scan.nextInt();
		int escalonesExtra = scan.nextInt();

		
		int calculo1 = pisoExtra * escalones + escalonesExtra;

		int calculo2 = escalones * piso + calculo1;
		
		System.out.println(calculo1 + " " + calculo2);
		
	}

}