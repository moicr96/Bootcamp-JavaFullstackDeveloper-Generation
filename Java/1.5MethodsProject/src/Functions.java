//https://github.com/generation-org/JAVA/tree/master/Functions
//Este código sirve para meterle tu nombre y tu apellido y luego te va a mostrar el largo de tu nombre y el largo de tu apellido y también lo va a dividir en las letras que lo conforman

import java.util.Scanner;

public class Functions {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in); //se activa la entrada de datos
		System.out.println("Enter your name:  "); //te dice que metas tu nombre
		String name = console.next(); //ingresa a la variable name lo que vas a meter a continuación
		System.out.println("Name characters:  "); //te dice que te va a mostrar las letras que lo conforman
		printNameCharacters(name); //ejecuta la función para dividir tu nombre en letras
		System.out.println("Name length:  "); //te dice que te va a mostrar el numero de letras de tu nombre
		System.out.println(printNameLength(name)); //ejecuta la función para calcular el numero de letras de tu nombre
		System.out.println("Enter your last name:  "); //te dice que metas tu appellido
		String lastName = console.next(); //ingresa a la variable lastName lo que vas a meter a continuación
		System.out.println("Last name characters:  "); //te dice que te va a mostrar las letras que lo conforman
		printLastNameCharacters(lastName); //ejecuta la función para dividir tu apellido en letras
		System.out.println("Last Name Length"); //te dice que te va a mostrar el numero de letras de tu apellido
		System.out.println(printNameLength(lastName)); //ejecuta la función para calcular el numero de letras de tu apellido
		System.out.println("Full Name:"); //te dice que te va a mostrar tu nombre completo
		System.out.println(name + " " + lastName); //te muestra tu nombre completo
		console.close(); //se desactiva la entrada de datos
	}

	private static int printNameLength(String name) { //función que calcula el largo de tu nombre
		return name.length();
	}// printNameLength

	private static void printNameCharacters(String name) { //función que divide tu nombre en letras
		for(int cont=0;cont<name.length();cont++) {
			System.out.println(name.charAt(cont));
			
		}
	}// printNameCharacters
	
	private static void printLastNameCharacters(String lastName) { //función que divide tu apellido en letras
		for(int cont2=0;cont2<lastName.length();cont2++) {
			System.out.println(lastName.charAt(cont2));			
		}//for
	}// printLastNameCharacters
	
}// Functions
