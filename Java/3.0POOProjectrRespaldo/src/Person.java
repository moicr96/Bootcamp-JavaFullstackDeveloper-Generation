
public class Person {
	String name;
	int age;
	String email;
	String rfc;
	String adress;
	
	public Person(String name, int age) {
		this(name,age,"email@email.com","XAXX010101000","Casa");
	}//constructor
	
public Person(String name, int age, String email, String rfc, String adress) {
		this.name=name.toUpperCase();
		this.age=(age<18)?18:age;
		this.email=email.toLowerCase();
		this.rfc=rfc.toUpperCase();
		this.adress=adress;
		
		

	}//constructor 

@Override
public String toString() {
	return "Person [name=" + name + ", "
			+ "age=" + age + ", email=" + 
			email + ", rfc=" + rfc + ", "
					+ "adress=" + adress + "]";
}//toString
}//class Person 
