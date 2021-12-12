package hello;

import java.util.Scanner;

public class about_myself 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String x = sc.next();

		System.out.println("Enter your roll-number: ");
		int y = sc.nextInt();

		System.out.println("Enter your CGPA/SGPA: ");
		double z = sc.nextDouble();

		System.out.println("My Name is:" + x);
		System.out.println("My Roll-number is:" + y);
		System.out.println("My CGPA is:" + z);
	}
}
