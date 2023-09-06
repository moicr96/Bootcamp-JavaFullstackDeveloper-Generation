package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
	private String name = "";
	private int age;
	private String email;
	private String rfc;
	private String adress;
	private int id;
	private static int total = 0;

	public Person(String name, int age) {
		this(name, age, "email@email.com", "XAXX010101000", "Casa");
	}// constructor

	public Person(String name, int age, String email, String rfc, String adress) {
		this.name = name.toUpperCase();
		this.age = (age < 18) ? 18 : age;
		this.email = email.toLowerCase();
		this.rfc = rfc.toUpperCase();
		this.adress = adress;
		Person.total++;
		this.id = Person.total;
	}// constructor

	public static int getTotal() {
		return Person.total;
	}// getTotal

	public int getId() {
		return id;
	}// getId

	public void setId(int id) {
		this.id = id;
	}// setId

	public String getName() {
		return name;
	}// getName

	public void setName(String name) {
		this.name = name;
	}// setName

	public String getEmail() {
		return email;
	}// getEmail

	public void setEmail(String email) throws PayRoll {
		Pattern regex = Pattern.compile("^[a-z_0-9.%+-]+@[a-z0-9.-]+\\\\.[a-z]{2,6}\r\n", Pattern.CASE_INSENSITIVE);
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()) {
			this.email = email.toLowerCase();
		} else {
			this.email = "jdoe@hotmail.com";
	 		throw new PayRoll("El formato del correo no es válido [" + email + "]");
		}
		this.email = email;
	}// setEmail

	public int getAge() {
		return age;
	}// getAge

	public void setAge(int age) {
		this.age = (age < 18) ? 18 : age;
	}// setAge

	public String getRfc() {
		return rfc;
	}// getRfc

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}// setRfc

	public String getAdress() {
		return adress;
	}// getAdress

	public void setAdress(String adress) {
		this.adress = adress;
	}// setAdress

	@Override
	public String toString() {
		return "Person [name=" + name + ", " + "age=" + age + ", email=" + email + ", rfc=" + rfc + ", " + "adress="
				+ adress + "]";
	}// toString

}// class Person
