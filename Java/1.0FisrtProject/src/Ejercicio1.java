//código para informarle a un vendedor qué porcentaje de comisión alcanza de acuerdo a su monto de ventas
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int monto = in.nextInt(); // convierte el dato de entrada a un entero
		System.out.println("Dime el monto: ");

		String comision = ""; //se declara la variable como tipo string sin ningún caracter por ahora
		if (monto >= 10000) {
			comision = "Comisión del 30%";
		} else if (monto >= 5000) {
			comision = "Comisión del 20%";
		} else if (monto >= 1000) {
			comision = "Comisión del 10%";
		} else {
			comision = "No hay comisión";
		} // else
		System.out.println(comision);
		in.close(); // cierra el scanner, aunque no sé para qué lo hace
	}

}
