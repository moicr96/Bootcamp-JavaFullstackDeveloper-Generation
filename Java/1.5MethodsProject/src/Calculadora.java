////LLAMAR A LA CALCULADORA MEDIANTE LA CLASE:
//public class Calculadora {
//	public static int suma(int a, int b) {
//		int c=a+b;
//		return c;
//	}//suma
//	public static void main(String[] args) {
//		System.out.println(suma(5, 6));
//	}//main
//}//class Calculadora



//=================================================
//OTRA FORMA DE LLAMAR A LA CALCULADORA:
//public class Calculadora {
//	public int suma(int a, int b) {
//		int c=a+b;
//		return c;
//	}//suma
//	public static void main(String[] args) {
//		Calculadora calc=new Calculadora();
//		calc.suma(5,6);
//
//	}//main
//
//}//class Calculadora



//=================================================
////Ahora suma, resta, multiplicación y división
//public class Calculadora {
//	public static int suma(int a, int b) {
//		int c=a+b;
//		return c;
//	} //suma
//	public static int resta(int a, int b) {
//		int c=a-b;
//		return c;
//	} //resta	
//	static int division(int a, int b) {
//		int c=a/b;
//		return c;
//	} //resta	
//	static int multiplicacion(int a, int b) {
//		int c=a*b;
//		return c;
//	} //resta	
//	public static void main(String[] args) {
//		System.out.println(suma(5, 6));
//		System.out.println(resta(6, 5));
//		System.out.println(division(2, 2));
//		System.out.println(multiplicacion(5, 6));
//	}}//main



//=================================================
///Ahora con otra forma de llamar a las operaciones
//y con sobrecarga de métodos
public class Calculadora {
	public static int suma(int a, int b) {
		int c=a+b;
		return c;
	} //suma

	public static double suma(double a, double b) {
		double c=a+b;
		return c;
	} //suma con sobrecarga de métodos

	public static int resta(int a, int b) {
		int c=a-b;
		return c;
	} //resta	
	static int division(int a, int b) {
		int c=a/b;
		return c;
	} //resta	
	static int multiplicacion(int a, int b) {
		int c=a*b;
		return c;
	} //resta	
	public static void operaciones() {
		System.out.println(suma(5, 6));
		System.out.println(suma(5.5, 6.1)); //suma con sobrecarga de métodos
		System.out.println(resta(6, 5));
		System.out.println(division(2, 2));
		System.out.println(multiplicacion(5, 6));	
	}
	public static void main(String[] args) {
		operaciones();
		}//main
	}//Calculadora