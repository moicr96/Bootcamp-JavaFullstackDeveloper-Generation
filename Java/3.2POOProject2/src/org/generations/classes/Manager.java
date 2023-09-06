package org.generations.classes;

public class Manager extends Employee {
	private int numberOfEmployees;
	private float percentage;
	
	public Manager(String name, int age, String email, String rfc, String address, String department, double salary,
			int numberOfEmployees, float percentage) {
		super(name, age, email, rfc, address, department, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	} // Method construct Manager

	@Override // Sobreescribir un metodo de una clase padre
	public double calculateSalary(int days) {
		double total=10;
		total = ((this.getSalary()*days)*1.16)*(1+this.percentage);
		return total;
	}
	 
	@Override
	public String toString() {
		return "Manager ["+getId()+"toString()=" + super.toString() + ", getDepartment()=" + getDepartment() + ", getSalary()="
				+ getSalary() + ", getRfc()=" + getRfc() + ", getAge()=" + getAge() + "]";
	}



	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
}
