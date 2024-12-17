import java.util.Scanner;

public class DiaPiano676 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 1; i <= numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int contador1 = 0;
		int contador2 = 0;
		
		for (int i = num1; i<=num2; i++) {
			if (esBisiesto(i)) {
				contador1++;
			} else {
				contador2++;
			}
		}
		
		System.out.println(contador2 + " " + contador1);
		
	}
	
    public static boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
	
}