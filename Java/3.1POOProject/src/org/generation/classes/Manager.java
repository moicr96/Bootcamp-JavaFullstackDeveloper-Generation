package org.generation.classes;

public class Manager extends Employee {
	private int numberOfEmployees;
	private float percentage;

	// 1.Constructor:
	public Manager(String name, int age, String email, String rfc, String adress, String department, Double salary,
			int numberOfEmployees, float percentage) {
		super(name, age, email, rfc, adress, department, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	}

	// ctrl+space + calculateSalary
	@Override
	public double calculateSalary(int days) {
		double total = 0;
		total = (this.getSalary() * days) * 1.16 * (1 + this.percentage);
		return total;
	}// calculateSalary

	// 2.Getters and Setters:

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}// getNumberOfEmployees

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}// setNumberOfEmployees

	public float getPercentage() {
		return percentage;
	}// getPercentage

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}// setPercentage

	// 3.toString

	@Override
	public String toString() {
		return "Manager [" + getId() + "numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage
				+ ", getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getAge()=" + getAge() + ", getRfc()=" + getRfc() + ", getAdress()="
				+ getAdress() + "]";
	}// toString
}// class Manager
