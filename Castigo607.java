import java.util.Scanner;

public class Castigo607 {

	static Scanner scan = new Scanner(System.in);
	static int[] powerOf2 = calcular();
	
	public static void main(String[] args) {

		int numPeticiones = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numPeticiones; i++) {
			function();
		}
	}

	public static void function() {

		int num = scan.nextInt();
		int ans = 0;
		for (int i = 0; i < powerOf2.length; i++) {
			if (powerOf2[i] >= num) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

	static int[] calcular() {
		int[] arr = new int[32];
		for (int i = 0; i < 32; i++) {
			arr[i] = Double.valueOf(Math.pow(2, i)).intValue();
		}
		return arr;
	}

}