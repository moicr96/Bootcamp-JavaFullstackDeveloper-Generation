package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import handlers.CourseNotFoundException;
import handlers.StudentNotFoundException;

public class StudentService {
	private HashMap<String, Course> courseList = new HashMap<>();

	private HashMap<String, Student> students = new HashMap<>();

	private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

	public StudentService() {
		courseList.put("Math", new Course("Math", 10, "Aurelio Baldor"));
		courseList.put("Physics", new Course("Physics", 10, "Albert Einstein"));
		courseList.put("Art", new Course("Art", 10, "Pablo Picasso"));
		courseList.put("History", new Course("History", 10, "Sima Qian"));
		courseList.put("Biology", new Course("Biology", 10, "Charles Darwin"));
	}

	public void enrollStudents(String courseName, String studentID) 
			throws CourseNotFoundException, StudentNotFoundException {
		Course course = courseList.get(courseName);
		if (course==null) {
			throw new CourseNotFoundException(courseName);
		}//if (course==null) 
		Student student=students.get(studentID);
		if (student==null) {
			throw new StudentNotFoundException(studentID);
		}//if (student==null)
		if (!coursesEnrolledByStudents.containsKey(studentID)) {
			coursesEnrolledByStudents.put(studentID, new ArrayList<>());
		}//if (!coursesEnrolledByStudents
		coursesEnrolledByStudents.get(studentID).add(course);
	}//enrollStudents

	public void unEnrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException {
		Course course = courseList.get(courseName);
		if (course==null) {
			throw new CourseNotFoundException(courseName);
		}//if (course==null) 
		Student student=students.get(studentID);
		if (student==null) {
			throw new StudentNotFoundException(studentID);
		}//if (student==null)

		if (coursesEnrolledByStudents.containsKey(studentID)) {
			coursesEnrolledByStudents.get(studentID).remove(course);
		}
	}

	public void showEnrolledStudents(String courseId) {
		System.out.println(courseId + " enrolled: ");
		Course course = courseList.get(courseId);
		Set<String> allStudens= coursesEnrolledByStudents.keySet();
		for (String key : allStudens) {
				List<Course> allCourses=coursesEnrolledByStudents.get(key);
				if (allCourses.contains(course)) {
					Student s=students.get(key); 
					System.out.println(s);								
				}//if			
			}//for
		System.out.println();
		}//showEnrolledStudents

	public void showAllCourses() {
		courseList.values().forEach((c)->System.out.println(c));
	}
	
	public void showAllStudents() {
		students.values().forEach((s)->System.out.println(s));
	}
	public void addStudent(Student student) {
		students.put(student.getId(), student);
	}
	
	public HashMap<String, Student> getStudents() {
		return students;
	}

	public HashMap<String, Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(HashMap<String, Course> courseList) {
		this.courseList = courseList;
	}

	public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
		return coursesEnrolledByStudents;
	}

	public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
		this.coursesEnrolledByStudents = coursesEnrolledByStudents;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}
	
	
	
}