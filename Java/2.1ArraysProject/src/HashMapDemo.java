import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> colores=new HashMap<>(); //declara el hashmap con 2 argumentos tipo string
		
		colores.put("WHITE", "#FFFFFF");
		colores.put("BLACK", "#000000");
		colores.put("RED", "#FF0000");
		colores.put("GREEN", "#00FF00");
		colores.put("BLUE", "#0000FF");
		colores.put("FUCHSIA", "#FF00FF");
		colores.put("PINK", "#FFC8CB");
		colores.put("YELLOW", "#FFFF00");
		System.out.println(colores.put("NAVY", "#000080")); //muestra el valor que previamente tenía ese elemento, y como no estaba sería nulo o null
		System.out.println(colores.put("NAVY", "#000080")); //muestra el valor que previamente tenía ese elemento, y como ya lo había agregado muestra su valor
		System.out.println(colores.size());
		
		for (String key: colores.keySet()) {
			System.out.println(key+": "+colores.get(key));
		}//foreach
		
		
		System.out.println("-------------------");
		colores.forEach((key,value)->System.out.println(key+"="+value));
	}//main

}//class HashMapDemo
