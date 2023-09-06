package org.generations.payroll; 
import org.generations.util.Pagable;

public class Payroll {
	// 
	public static void printRecipt(Pagable e) {
		System.out.println("+===========================+");
		System.out.println("| Recibo de pago de "+e.getName()+"       ");
		System.out.println("| RFC: "+e.getRfc()+"       ");
		System.out.println("| Por la cantidad de : $"+
String.format("%.2f", e.calculateSalary(30))); 
		System.out.println("| Numero de empleado: #"+e.getId()+"       ");
		System.out.println("+===========================+");
		
		
	}// Metodo printRecipt

} // Clase Payroll
