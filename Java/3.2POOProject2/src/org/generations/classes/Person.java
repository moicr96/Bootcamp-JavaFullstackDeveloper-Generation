package org.generations.classes;

// No permite instanciar la clase, solo sirve para ser padre de otras clases.
public abstract class Person {
	//encapsulando nuestras propiedades para que no se modifiquen
	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	private static int total=0;
	
	public Person(String name, int age, String email, String rfc, String address) {
		//this.propiedad de la clase = parametros del constructor
		this.name = name;
		this.age = (age<18)?18:age;
		this.email = email;
		this.rfc = rfc;
		Person.total++;
		this.id=Person.total;
		this.address = address;
		
	} // constructor Person
	
	public Person(String name, int age) { 
		this(name, age,"Email@o.com", "XXXXXX", "Casa");
	} // constructor Person
	
// tatic solo va a establecer mediante el metodo, no instancia osea pues Person.getTotal()
	// Este Metodo se llama mediante la clase, no mediante el objeto de la clase
	public static int getTotal() {
		return Person.total;
	}
	public int getId() {
		return id;
	}

	public String getRfc() {
		return this.rfc;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = (age<18)?18:age;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	} // toString

	
	
	
}
