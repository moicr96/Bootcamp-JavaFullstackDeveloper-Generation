
public class Ciclos {

	public static void main(String[] args) {

		System.out.println("+=========================");
		final int MAX = 3;
		int index = 1;
		while (index <= MAX) {
			int cont = 1;
			while (cont <= MAX) {
				System.out.println(index + "" + cont);
				cont++;
			} // while cont
			index++;
		} // while index

		System.out.println("=========================");
		final int MAX2 = 5;
		for (int filas = 1; filas <= MAX2; filas++) {
			for (int cont2 = 1; cont2 <= filas; cont2++) {
				System.out.print("*");
			}
			System.out.println(""); // println pone un salto de linea despues de imprimir
		}

		System.out.println("=========================");
		final int MAX3 = 8;
		for (int star = 0; star <= MAX3; star++) {
			for (int estrella = 1; estrella <= MAX3 - star; estrella++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}// main
}// class
