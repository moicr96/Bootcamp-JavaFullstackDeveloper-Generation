package classes;

public class Course {
	public String name;

	public int credits;

	public String professorName;

	public Course(String name, int credits, String professorName) {
		this.name = name;
		this.credits = credits;
		this.professorName = professorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", professorName=" + professorName + "]";
	}

}