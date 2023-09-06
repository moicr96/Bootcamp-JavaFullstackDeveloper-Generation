package handlers;

public class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String message) {
		super(message + " Student not found!");
	}
}