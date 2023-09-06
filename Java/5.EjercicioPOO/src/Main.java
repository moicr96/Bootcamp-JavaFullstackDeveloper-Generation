//https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Fundamentals
public class Main {

	public static void main(String[] args) {
		Student hugo = new Student("Hugo", "Rojas", 0, 55, 1);
		Student vale = new Student("Valeria", "Arquieta", 0, 50, 2);
		Student ana = new Student("Ana Paula", "Batiz", 0, 90, 1);
		Student nicte = new Student("Nicté", "Cortés", 0, 90, 1);

		Student[] lista = { 	new Student("Moises", "Coral", 0, 57, 1), 
								new Student("Leslie", "García", 0, 55, 2),
								new Student("Adriana", "Ibarra", 0, 80, 1), 
								new Student("Jorge", "Hernandez", 0, 95, 1) };

		System.out.println(hugo.changeYearIfApproved());
		System.out.println(vale.changeYearIfApproved());
		System.out.println(ana.changeYearIfApproved());
		System.out.println(nicte.changeYearIfApproved());

		System.out.println(hugo);
		System.out.println(vale);
		System.out.println(ana);
		System.out.println(nicte);

		Course java = new Course("Java FullStack", "Amizaday", 2);
		System.out.println(java.countStudents());
		java.enroll(lista);
		java.enroll(hugo);
		java.enroll(vale);
		java.enroll(ana);
		java.enroll(nicte);
		java.unEnroll(hugo);
		System.out.println(java.countStudents());
		System.out.println(java);
		System.out.println(java.bestGrade());

	}// main
}// class Main
