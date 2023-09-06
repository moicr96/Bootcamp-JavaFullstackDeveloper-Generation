
public class ForDemo {
	// final-> define una constante
	public static void main(String[] args) {
		
		System.out.println("---------");
		System.out.println("imprimir los numeros enteros del 0 a 99");
		final int MAX = 100; 
		for (int cont = 0; cont < MAX; cont++) {
			System.out.println(cont);
		} // ciclo for

		System.out.println("---------");
		System.out.println("imprimir los pares de los primeros 100 nums naturales");
		System.out.println("usando el for y +2 en cont");
		final int MAX2 = 100; 
		for (int cont2 = 0; cont2 <= MAX2; cont2 += 2) {
			System.out.println(cont2);
		} // ciclo for

		System.out.println("---------");
		System.out.println("imprimir los pares de los primeros 100 nums naturales");
		System.out.println("usando el for y %2");
		final int MAX3 = 100; 
		for (int cont3 = 0; cont3 <= MAX3; cont3++) {
			if ((cont3 % 2) == 0)
				System.out.println(cont3);
		} // ciclo for

		System.out.println("---------");
		System.out.println("imprimir los pares de los primeros 100 nums naturales");
		System.out.println("usando while");
		int cont4 = 0;
		final int MAX4 = 100;
		while (cont4 <= MAX4) {
			if (cont4 == 0) {
				cont4++;
				continue;
			} // if cont4==0

			if ((cont4 % 2) == 0)
				System.out.println(cont4);
			cont4++;
		} // while

		System.out.println("---------");
		System.out.println("imprimir los pares de los primeros 100 nums naturales");
		System.out.println("usando do while");
		int cont5 = 0;
		int MAX5 = 100;
		do {
			if ((cont5 % 2) == 0)
				System.out.println(cont5);
			cont5++;
		} while (cont5 <= MAX5);
		//do while
		
	}// main

}// class ForDemo
