
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// No permite instanciar la clase, solo sirve para ser padre de otras clases.
public class Person {
	// encapsulando nuestras propiedades para que no se modifiquen
	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	private static int total = 0;

	public Person(String name, int age, String email, String rfc, String address) {
		// this.propiedad de la clase = parametros del constructor
		this.name = name;
		this.age = (age < 18) ? 18 : age;
		this.email = email;
		this.rfc = rfc;
		Person.total++;
		this.id = Person.total;
		this.address = address;
	} // constructor Person

	public Person(String name, int age) {
		this(name, age, "Email@o.com", "XXXXXX", "Casa");
	} // constructor Person

	// tatic solo va a establecer mediante el metodo, no instancia osea pues
	// Person.getTotal()
	// Este Metodo se llama mediante la clase, no mediante el objeto de la clase

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Person.total = total;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ ", id=" + id + "]";
	}

}
