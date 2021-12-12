package hello;
import java.util.Scanner;
	interface Student
	{
		int studentID = 19;
		String studentName = "Tanvi Singla";
		String Class = "BCA" ;

		void getValue();
	}
	class Department implements Student
	{
		int attendance;

		public void getAttendance()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Attendance: ");
			attendance = sc.nextInt();
		}
		public void getValue()
		{
			System.out.println("Student ID :" + studentID);
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Class : " + Class);
		}
	}
	class Exam extends Department
	{
		public void calculateAttendance()
		{
			attendance = attendance;
		}
		public  boolean eligible()
		{
		if(attendance < 60)
			return false;
			else
			return true;
		}
	}
	public class student_eligibility
	{
		public static void main(String[] args)
		{
			Exam e = new Exam();
			e.getValue();
			e.getAttendance();
			e.calculateAttendance();
			System.out.println("Eligibility :" + e.eligible());			
		}
	}	
