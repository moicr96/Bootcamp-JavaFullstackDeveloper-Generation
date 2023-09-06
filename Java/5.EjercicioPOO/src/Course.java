import java.util.ArrayList;
import java.util.Iterator;

public class Course {
	String courseName;
	String professorName;
	int year;
	ArrayList<Student> students = new ArrayList<>();

	public Course(String courseName, String professorName, int year) {
//		super();
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}// constructor

	public void enroll(Student student) {
		students.add(student);
	}// enroll

	public void enroll(Student[] students) {
		for (Student student : students) {
			enroll(student);
		} // for
	}// enroll

	public void unEnroll(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		} // if
	}// unEnroll

	public int countStudents() {
		return students.size();
	}// countStudents

	public int bestGrade() {
		int max = 0;
		for (Student student : students) {
			if (student.grade > max) {
				max = student.grade;
			} // if
		} // foreach
		return max;
	}// bestGrade

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", professorName=" + professorName + ", year=" + year
				+ ", students=" + students + "]";
	}
	
	
}// class Course
