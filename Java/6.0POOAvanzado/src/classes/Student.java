package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private String name;

	private String id;

	private int age;

	private final List<Course> courseList = new ArrayList<>();

	public Student(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}
	
	
}//public class Student
