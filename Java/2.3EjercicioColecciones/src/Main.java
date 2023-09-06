//https://github.com/generation-org/JAVA/tree/master/Collections

public class Main {
	public static void main(String[] args) {
		CourseService courseService = new CourseService();

		String courseId = "math_01";
		String studentId = "120120";
		courseService.displayCourseInformation(courseId);
		courseService.displayStudentInformation(studentId);
		courseService.displayStudentInformation("458787");

		courseService.enrollStudent(studentId, courseId);
		courseService.displayStudentInformation(studentId);

		courseService.enrollStudent("458787", "phys_01");
		courseService.displayStudentInformation("458787");
		courseService.unEnrollStudent(studentId, courseId);
		courseService.displayStudentInformation(studentId);
	}
}