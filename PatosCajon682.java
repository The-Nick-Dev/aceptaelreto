import java.util.Scanner;

public class PatosCajon682 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int num = scan.nextInt();
		
		System.out.println(num + " " + num*2);
		
		
	}
		
}