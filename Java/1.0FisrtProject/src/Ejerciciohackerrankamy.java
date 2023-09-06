import java.util.Scanner;

public class Ejerciciohackerrankamy {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Dame un número entero del rango del 1 al 100 ");
		int N = in.nextInt();
		if (N % 2 != 0) {
			System.out.println("Weird");
		} else if (N <= 5) {
			System.out.println("Not Weird");
		} else if (N <= 20) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		} // else
		in.close();
	}

}
