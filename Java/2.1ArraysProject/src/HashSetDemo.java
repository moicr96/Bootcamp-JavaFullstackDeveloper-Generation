import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos=new HashSet<String>(); //con estas cosas no tenemos indices como en los arrays
		System.out.println(autos.add("Volvo"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("Ford"));
		System.out.println(autos.add("VW"));
		System.out.println(autos.add("Audi"));
		System.out.println(autos.add("BMW")); //este no lo cuenta porque no se aceptan elementos repetidos
		
		System.out.println("----------------------------------");		
		System.out.println(autos.size()); //muestra el numero de elementos en el hashset
		System.out.println(autos.isEmpty()); //te dice si es que el hashset está vacío
		System.out.println(autos.contains("BMW")); //te dice si es que el hashset tiene el elemento "BMW" 		
		
		System.out.println("----------------------------------");		
		for (String marca:autos) { //te va mostrando uno por uno los elementos
			System.out.println(marca);
		}//foreach
		
		System.out.println("----------------------------------");		
		autos.forEach((marca)->mostrarMarca(marca));//te va mostrando uno por uno los elementos pero además su numero en hashcode
		
		
		System.out.println("----------------------------------");
		HashSet<String> pc=new HashSet<String>();
		pc.add("Lenovo");
		pc.add("HP");
		pc.add("Acer");
		pc.add("Dell");
		pc.add("Gateway");
		pc.add("Compaq");
		pc.add("Toshiba");
		pc.add("VAIO");
		pc.add("Apple");
		pc.add("Asus");
		pc.forEach((m)->mostrarMarca(m));			
	}//main
	private static void mostrarMarca(String marca) {
		System.out.println("=================");
		System.out.println("|"+marca.toUpperCase()+" "+marca.hashCode());
		System.out.println("=================\n");
	}//mostrarMarca
}//class HashSetDemo
