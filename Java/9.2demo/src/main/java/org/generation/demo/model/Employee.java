package org.generation.demo.model;

public class Employee {
	private String name;
	private String rfc;
	private String email;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rfc=" + rfc + ", email=" + email + ", salary=" + salary + "]";
	}

	public Employee(String name, String rfc, String email, double salary) {
		super();
		this.name = name;
		this.rfc = rfc;
		this.email = email;
		this.salary = salary;
	}

	public Employee() {
	}

}// class Employee
