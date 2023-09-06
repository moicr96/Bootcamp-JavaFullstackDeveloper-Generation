package org.generation.demo.controller;

import java.util.List;
import org.generation.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//	@GetMapping("/hola/")
//	public String hello() {
//		return "<h1>Hola Mundo SpringBoot CH25 !!!</h1>";
//	}//gethello  

	@GetMapping("/empleado/")
	public List<Employee> getEmployees() {
		List<Employee> lista = List.of(
				new Employee("Jane Doe", "XAXX000000XA1", "jdoe@hotmail.com", 1250.20),
				new Employee("John Doe", "XAXX000000XA1", "jdoe@gmail.com", 1050.20),
				new Employee("Juan Perez", "XAXX000000XA1", "jperez@hotmail.com", 1200.20),
				new Employee("Fulanito Detal", "XAXX000000XA1", "fdetal@hotmail.com", 1200.00),
				new Employee("Gabriela Torres", "XAXX000000XA1", "gtorres@hotmail.com", 1100.00)
				);
		return lista;
	}// getEmployees
}// class DemoController
