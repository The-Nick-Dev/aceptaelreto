import java.util.Scanner;

public class envases532 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numPeticiones = entrada.nextInt();
		for (int i=0; i< numPeticiones;i++) {
			function();
		}
	
	}

	public static void function() {
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		System.out.println(num2-num1);
		
	}
	
}
