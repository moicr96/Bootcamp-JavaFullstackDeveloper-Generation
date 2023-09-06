import java.util.ArrayList;
import org.generation.classes.Consultor;
import org.generation.classes.Employee;
import org.generation.classes.Manager;
import org.generation.classes.Person;
import org.generation.payroll.PayRoll;
import org.generation.util.EmailFormatException;

public class testPOO {
	public static void main(String[] args) {

//		public class testPOO {
//			public static void main(String[] args) {
//		Person alberto=new Person();
//		alberto.name="Alberto Trejo";
//		alberto.age=22;
//		alberto.email="alberto.trejo@gmail.com";
//		alberto.rfc="TEXL010101XY1";
//		alberto.address="Domicilio Conocido";

//		System.out.println(	alberto.name+" "+
//		alberto.age+" "+
//		alberto.email+" "+
//		alberto.rfc+" "+
//		alberto.adress);

//		System.out.println(	hugo.name+" "+
//		hugo.age+" "+
//		hugo.email+" "+
//		hugo.rfc+" "+
//		hugo.adress);

//		System.out.println(alberto.toString());
//		System.out.println(hugo);
		
		Employee alberto = 	new Employee("Alberto Trejo", 22, "alberto.trejo@gmail.com", "TEXL010101XY1","Domicilio conocido", null, null);
		Employee hugo = 	new Employee("Hugo Rojas", 21, "hugo@gmail.com", "XAXX010101XX1", "Casa", "Development", 235.2);
		Manager vale = 		new Manager("Valeria Arquieta", 23, "vale@gmail.com", "XAXX010101XX1", "oficina","Development IT", 450.25, 35, 0.25f);

		// no se puede instanciar la clase persona porque es abstracta
		// Person daniel=new Person("Daniel",18)

//		alberto.setAge(16);
//		System.out.println(alberto.getRfc());	
//		System.out.println(alberto.toString());
//		System.out.println(alberto.calculateSalary(30));
//		System.out.println(hugo);
//		System.out.println(hugo.calculateSalary(30));
//		System.out.println(vale);
//		System.out.println(vale.calculateSalary(30));

		PayRoll.printReceipt(alberto);
		PayRoll.printReceipt(hugo);
		PayRoll.printReceipt(vale);
		Consultor leslie = new Consultor("Leslie inc sa de cv", "XAXX00000XXA", 1750);
		PayRoll.printReceipt(leslie);

		System.out.println("Total:" + Person.getTotal());

		try {
			hugo.setEmail("hugo@gmail.com");
		} catch (EmailFormatException e) {
			System.out.println(e.getMessage());
		} finally {	}

		System.out.println(hugo);
		ArrayList<String> x = new ArrayList<>();
		Printer prn = new Printer();
	}// main
}// class testPOO
