	import java.util.Scanner;
	public class SwitchDaysDemo {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Escribe el número del mes (1-12): ");
			int month= in.nextInt();
			String monthString="";
			switch (month) {
				case 1,3,5,8,10,12: monthString="Tiene 31"; //se pueden meter todos en un case
				break;
				case 4:				 
				case 6:				 
				case 9:				 
				case 11:
					monthString="Tiene 30"; //se pueden poner por separado con una sola instrucción
				break;
				case 2:
					monthString="Tiene 28/29";
					break;
					default:
						monthString="Mes no válido";
						break;
			} // switch
			System.out.println(monthString);
			in.close();
		}// main
	}
