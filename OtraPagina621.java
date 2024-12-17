import java.util.Scanner;

public class OtraPagina621 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int num = scan.nextInt();
		int nextpage = 0;
		
		if (num % 2 == 0) {
			nextpage = num +1;
		} else {
			nextpage = num-1;
		}

		System.out.println(nextpage);
	}

}