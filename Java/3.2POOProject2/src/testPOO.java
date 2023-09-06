import org.generations.classes.Person;
import org.generations.payroll.Payroll;
import org.generations.classes.Employee;
import org.generations.classes.Manager;
import org.generations.classes.Consultor;
import org.generations.util.EmailFormatException;


public class testPOO {
	public static void main(String[] args) {
		Employee hugo = 	new Employee("Hugo Rojas",21, "alberto.trejo@gmail.com","ASSPJDFSOAJO", "Comicilio conocido", "TI", 222.6);
		Employee alberto =  new Employee("Alberto Treho",22,"albert.trejo@gamil.com","TEXL010101XY1","Domicilio conocido", "Development", 200.20 ); //Es de una clase anterior
		Manager vale = 		new Manager("Valeria", 45, "Vale@a.com","AXXADFAFASDF", "Officina","Development IT", 450.25, 34, 0.25f);

		Payroll.printRecipt(hugo);
		Payroll.printRecipt(alberto);
		Payroll.printRecipt(vale);

		Consultor leslie = new Consultor ("Lestie Inc SA de CV","ALJFDAJLDASF", 231);
		//System.out.println(leslie);
		Payroll.printRecipt(leslie);
		
//		alberto.name = "Alberto Treho"; //Asignan un nombre a Alberto con ctrl+7 es para comentar
//		alberto.age=22;
//		alberto.email="albert.trejo@gamil.com";
//		alberto.rfc="TEXL010101XY1";
//		alberto.address="Domicilio conocido";
/*
		System.out.println(hugo.toString());
		System.out.println(hugo.calculateSalary(30));
		System.out.println(alberto.toString());
		System.out.println(alberto.calculateSalary(30));
		System.out.println(vale.toString());
		System.out.println(vale.calculateSalary(30));
		
		
		
		alberto.setAge(16);
		System.out.println(alberto.getRfc());
		System.out.println(alberto.getRfc());
		System.out.println(alberto.getRfc());
		*/
		
		/*
		try {
			hugo.setEmail("hugo@gamil.com");
		} catch (EmailFormatException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}//catch
		
	*/
//		System.out.println(alberto.name); // Y Y Y Y
//		System.out.println(alberto.email);// Y Y Y N
//		System.out.println(alberto.age); // Y Y N N
//		System.out.println(alberto.rfc); // Y n n n
//		System.out.println(alberto.toString());
//		System.out.println(hugo); //Lo imprime por la sobrecarga
}
}