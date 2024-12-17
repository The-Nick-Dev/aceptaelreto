import java.util.Scanner;

public class cuadrados340 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = entrada.nextInt();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int horizontal = entrada.nextInt();
		int vertical = entrada.nextInt();
		int total = ((vertical + 1) * horizontal) + ((horizontal + 1) * vertical);
		System.out.println(total);

	}

}
