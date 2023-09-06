
public class TiposDeDatos {

	public static void main(String[] args) {
		byte age=20; //1byte = 8bits
		short numDays=3650; //2bytes = 16bits
		int num=1265645; //4bytes = 32bits
		long x=1_384_029_384;
		System.out.println(x);
		
		age=(byte) num; //esto se llama "cast" o "conversión explícita", sirve para convertir num al tipo byte
		
		System.out.println("================================");
		System.out.println("El valor mínimo del byte en java es: "+Byte.MIN_VALUE);
		System.out.println("Valor máximo del byte"+Byte.MAX_VALUE);
		System.out.println("El número de bytes de byte: "+Byte.BYTES);
		System.out.println("El número de bits de byte: "+Byte.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+(-Byte.MIN_VALUE*2));

		System.out.println("================================");
		System.out.println("Valor mínimo del short "+Short.MIN_VALUE);
		System.out.println("Valor máximo del short "+Short.MAX_VALUE);
		System.out.println("El número de bytes de short: "+Short.BYTES);
		System.out.println("El número de bits de short: "+Short.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+(-Short.MIN_VALUE*2));

		
		System.out.println("================================");
		System.out.println("Valor mínimo del integer "+Integer.MIN_VALUE);
		System.out.println("Valor máximo del integer "+Integer.MAX_VALUE);
		System.out.println("El número de bytes de integer: "+Integer.BYTES);
		System.out.println("El número de bits de integer: "+Integer.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+ (-Integer.MIN_VALUE*2)); //esto da cero no sé por qué

		
		System.out.println("================================");
		System.out.println("Valor mínimo del long "+Long.MIN_VALUE);
		System.out.println("Valor máximo del long "+Long.MAX_VALUE);
		System.out.println("El número de bytes de long: "+Long.BYTES);
		System.out.println("El número de bits de long: "+Long.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+(-Long.MIN_VALUE*2)); //esto da cero no sé por qué

		
		System.out.println("================================");
		System.out.println("Valor mínimo del float "+Float.MIN_VALUE);
		System.out.println("Valor máximo del float "+Float.MAX_VALUE);
		System.out.println("El número de bytes de float: "+Float.BYTES);
		System.out.println("El número de bits de float: "+Float.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+(-Float.MIN_VALUE*2)); //esto no sé si es correcto

		
		System.out.println("================================");
		System.out.println("Valor mínimo del double "+Double.MIN_VALUE);
		System.out.println("Valor máximo del double "+Double.MAX_VALUE);
		System.out.println("El número de bytes de double: "+Double.BYTES);
		System.out.println("El número de bits de double: "+Double.SIZE);
		System.out.println("O sea que el número de dígitos que almacena es: "+(-Double.MIN_VALUE*2)); //esto no sé si es correcto

		
	} //main

} // class TiposDeDatos
