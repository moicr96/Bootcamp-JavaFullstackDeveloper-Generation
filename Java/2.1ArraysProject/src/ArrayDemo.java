public class ArrayDemo {
	public static void main(String[] args) {
	//public static void main(String[] args) { //también puede escribirse con el corchete después de args
//		String[] meses= {"Enero", "Febrero", "Marzo",   //por ejemplo aqui lo pongo despues de string 
//				"Abril", "Mayo", "Junio", "Julio", 
//				"Agosto", "Septiembre", "Octubre", 
//				"Noviembre", "Diciembre"};

		String meses[]= {"Enero", "Febrero", "Marzo", 
				"Abril", "Mayo", "Junio", "Julio", 
				"Agosto", "Septiembre", "Octubre", 
				"Noviembre", "December"};  //los arreglos en java son de tamaño fijo, su tamaño no puede ser modificado posteriormente
		
		System.out.println(meses[11]); //Diciembre
		meses[11]="Diciembre";
		System.out.println(meses[11]); //el elemento 11 nuevo		
		
		
		System.out.println(meses.length); //lenght es una propiedad y lenght() es un método
		meses[11]+="(Navidad)";
		System.out.println(meses[11]);
		System.out.println(meses[11].length()); //la longitud del arreglo no puede cambiar pero la longitud de un elemento si puede cambiar
	}
}
