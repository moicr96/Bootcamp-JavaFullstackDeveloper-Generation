
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Dime la calificación: ");
		int testScore = in.nextInt();
		char grade;
		if (testScore >= 90) {
			grade = 'A';
		} else if (testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		} // else
		System.out.println("Calificación con letra: " + grade);
		in.close();
	}

}
