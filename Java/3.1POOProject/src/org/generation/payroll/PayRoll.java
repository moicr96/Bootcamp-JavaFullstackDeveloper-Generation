package org.generation.payroll;
import org.generation.classes.Employee;

public class PayRoll {
	public static void printReceipt(Employee e) {
		System.out.println("+========================================================================");
		System.out.println("| Recibo de pago de "+e.getName());
		System.out.println("| RFC"+e.getRfc());
		System.out.println("| Por la cantidad de: $"+String.format("%.2f",e.calculateSalary(30)));
		System.out.println("| Numero de empleado: #"+e.getId());
		System.out.println("+========================================================================");
	}//printReceipt	
}//class PayRoll
