import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int total=0;
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		numeros.add(35);	numeros.add(33);	numeros.add(42);
		numeros.add(10);	numeros.add(14);	numeros.add(19);
		numeros.add(27);	numeros.add(44);	numeros.add(26);
		numeros.add(31);	numeros.add(32);	
		System.out.println(numeros.size());
		System.out.println(numeros.isEmpty());
//		System.out.println(numeros.get(7));
		
		System.out.println("Índice 7: "+numeros.get(7));
		System.out.println("Índice del número 31 es: "+numeros.indexOf(31));
		System.out.println("Índice del número 31: "+numeros.lastIndexOf(31));

		System.out.println("Existe el # 14?: "+numeros.contains(14));
		
		System.out.println("Índice 9: "+numeros.get(9));
		System.out.println("Remueve el elemento en la posición 9 y dime cuál fue: "+numeros.remove(9));
		System.out.println("Índice 9: "+numeros.get(9));
				
		System.out.println("El nuevo tamaño del arraylist es: "+ numeros.size());
				
		System.out.println("Ahora muestrame todos los elementos: ");
		for (int cont=0; cont<numeros.size(); cont++) {
			System.out.println(numeros.get(cont));
		}
		
		System.out.println("Ahora lo mismo usando el foreach equivalente a la funcion flecha de javascript:");
		total=0;
		numeros.forEach(
				(numero)->System.out.println(numero)
				);
		
		
		System.out.println("Ahora suma los valores de todos los elementos: ");
		for (int cont1=0; cont1<numeros.size(); cont1++) {
			total+=numeros.get(cont1);		
		}		
		System.out.println(total);
		
		
		System.out.println("Ahora lo mismo pero usando el for equivalente al foreach de javascript: "+total);
		total=0;
		for (Integer numero: numeros) {
			total+=numero;
		}
		
		System.out.println("Ahora muestrame los elementos y dime si son pares o impares:");
		total=0;
		numeros.forEach(
				(numero)->paresImpares(numero)
				);
	}

	private static void paresImpares(Integer numero) {
		if((numero%2)==0) {
			System.out.println("El numero "+numero+" es par");
		} else {
			System.out.println("El numero "+numero+" es impar");
		}
	}
}
