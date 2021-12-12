package Arrays;

import java.util.Scanner;

class Student {
	String name;
	int javaMarks;
	int pythonMarks;
	int cMarks;
	int cppMarks;
	int totalMarks;
	float percentage;
	String grade;

	private void gradeCalculate() {
		if (percentage >= 90)
			grade = "A+";
		else if (percentage >= 80)
			grade = "B+";
		else if (percentage >= 60)
			grade = "C";
		else if (percentage >= 40)
			grade = "D";
		else
			grade = "Fail";
	}

	Student(String name, int javaMarks, int pythonMarks, int cMarks, int cppMarks) {
		this.name = name;
		this.javaMarks = javaMarks;
		this.pythonMarks = pythonMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
		totalMarks = javaMarks + pythonMarks + cMarks + cppMarks;
		percentage = totalMarks / 4f;
		gradeCalculate();
	}

	public void display() {
		System.out.println("Name: " + name + "\t" + "Java Marks: " + javaMarks + "\t" + "Python Marks: " + pythonMarks
				+ "\t" + "C Marks: " + cMarks + "\t" + "C++ Marks: " + cppMarks + "\t" + "Total Marks: " + totalMarks
				+ "\t" + "Percentage: " + percentage + "\t" + "Grade: " + grade);
	}

}

public class GradeProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int numberOfStudents = scanner.nextInt();
		Student[] students = new Student[numberOfStudents];
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter Name of Student: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.println("Enter Java Marks: ");
			int javaMarks = scanner.nextInt();
			System.out.println("Enter Python Marks: ");
			int pythonMarks = scanner.nextInt();
			System.out.println("Enter C Marks: ");
			int cMarks = scanner.nextInt();
			System.out.println("Enter C++ Marks: ");
			int cppMarks = scanner.nextInt();
			students[i] = new Student(name, javaMarks, pythonMarks, cMarks, cppMarks);
		}

		for (int i = 0; i < students.length; i++) {
			students[i].display();
		}
	}
}