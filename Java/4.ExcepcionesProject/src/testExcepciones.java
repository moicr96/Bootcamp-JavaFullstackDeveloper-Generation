import java.util.Scanner;

public class testExcepciones {
	public static void main(String[] args) {
		String[] names = { "Dora", "Carlos", "Leslie", "Adri", "Abel", "Gabriela", "Moises", "Jorge", "Francisco", "Adriana" };
		System.out.println("Escribe un numero entero:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Escribe otro numero entero:");
		int num2 = in.nextInt();
		try {
			System.out.println(names[num]);
			System.out.println(names[num2]);
//			System.out.println(names[num2].charAt(num));
			System.out.println("El primero entre el segundo da: " + num / num2);
		} catch (ArithmeticException e) {
			System.out.println("No fue posible la división (" + e.getMessage() + ")");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Se sale de los limites del arreglo (" + e.getMessage() + ")");
		} finally {
			in.close();
		} // finally
	}// main
}// class testExcepciones
