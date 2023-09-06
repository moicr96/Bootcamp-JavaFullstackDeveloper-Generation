public class Student {
	String firstName;
	String lastName;
	int registration;
	int grade;
	int year;

	public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}// constructor

	public Student(String firstName, String lastName) {
		this(firstName, lastName, 0, 0, 1);
	}// constructor

	public Student(String firstName, String lastName, int year) {
		this(firstName, lastName, 0, 0, year);
	}// constructor

	public void printFullName() {
		System.out.println(this.firstName + " " + this.lastName);
	}// printFullName

	public boolean isApproved() {
		if (this.grade >= 60) {
			return true;
		} // if
		return false;
	}// isApproved

	public int changeYearIfApproved() {
		if (isApproved()) {
			year++;
			System.out.println("Felicidades!");
		} // if
		return year;
	}// changeYearIfApproved

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", grade=" + grade + ", year=" + year + "]";
	}// toString

}// class Student
