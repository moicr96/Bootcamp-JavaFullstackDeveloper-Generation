import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaCalculadora {

	@Test
	@DisplayName("Prueba la suma de dos enteros, varias anotaciones")
	void testSuma() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.sum(2, 2));
		assertEquals(40, calc.sum(20, 20));
		assertEquals(6, calc.sum(3, 3));
		assertEquals(60, calc.sum(47, 13));
	}// testSuma

	@Test
	@DisplayName("Prueba del valor de PI que se encuentre entre 3.14 y 3.1416")
	void testGetPI() {
		Calculator calc = new Calculator();
		assertTrue(calc.getPI() >= 3.14);
		assertTrue(calc.getPI() <= 3.1416);
	}// testSuma

	@Test
	@DisplayName("Prueba del valor de PI en string no es nulo")
	void testGetStrPI() {
		Calculator calc = new Calculator();
		assertNotNull(calc.getStrPi());
	}// testSuma

	@Test
	@DisplayName("Prueba de la división y la división entre cero")
	void testDivide() {
		Calculator calc = new Calculator();
		// assertEquals(3,calc.divide(9,3));
		Exception e = assertThrows(ArithmeticException.class, () -> calc.divide(9, 0));
		assertEquals("/ by zero", e.getMessage());
	}// testSuma

	@Test
	@DisplayName("Prueba EMAIL")
	void testEmail() {
		Person p = new Person("Ana Paula", 18);
		Exception e = assertThrows(EmailFormatException.class, () -> p.setEmail("anapauyahoo.mx"));
		assertEquals("El formato del correo no es válido [anapauyahoo.mx]", e.getMessage());
		assertEquals("jdoe@hotmail.com", p.getEmail());
	}// testEmail
}
