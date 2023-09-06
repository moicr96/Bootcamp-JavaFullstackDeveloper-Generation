package org.generation.classes;

public class Employee extends Person {
	private String department;
	private double salary;

	public Employee(String name, int age, String email, String rfc, String adress, String department, Double salary) {
		super(name, age, email, rfc, adress);
		this.department = department;
		this.salary = salary;
	}// constructor

	public double calculateSalary(int days) {
		double total = 0;
		total = (this.salary * days) * 1.16;
		return total;
	}// calculateSalary

	public String getDepartment() {
		return department;
	}// getDepartment

	public void setDepartment(String department) {
		this.department = department;
	}// setDepartment

	public Double getSalary() {
		return salary;
	}// getSalary

	public void setSalary(Double salary) {
		this.salary = salary;
	}// setSalary

	@Override
	public String toString() {
		return "Employee 	[" + getId() 	+ ", getName()="	+ getName() 
											+ ", getEmail()=" 	+ getEmail() 
											+ ", getAge()=" 	+ getAge() 
											+ ", getRfc()=" 	+ getRfc()
											+ ", getAdress()=" 	+ getAdress() 
											+ ", department=" 	+ department 
											+ ", salary=" 		+ salary 		+ "]";
	}// toString()
}// class Employee
