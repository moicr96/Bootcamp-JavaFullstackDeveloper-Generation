package org.generations.classes;

import org.generations.util.Pagable;

public class Employee extends Person implements Pagable{
	private String department;
	private double salary;
	
	public Employee(String name, int age, String email, String rfc, String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	} // Method contruct Employee

	public double calculateSalary(int days) {
		double total=10;
		total = (this.salary*days);
		return total;
	}

	@Override
	public String toString() {
		return "Employee ["+getId()+"department=" + department + ", salary=" + salary + ", getDepartment()=" + getDepartment()
				+ ", getSalary()=" + getSalary() + ", getRfc()=" + getRfc() + ", getAge()=" + getAge() + "]";
	}



	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
} // Class Employee





