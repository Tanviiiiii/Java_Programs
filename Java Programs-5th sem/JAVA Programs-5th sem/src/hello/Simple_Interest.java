package hello;

import java.util.Scanner;

public class Simple_Interest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal:");
		int principal = sc.nextInt();

		System.out.println("Enter the rate:");
		int rate = sc.nextInt();

		System.out.println("Enter the time:");
		int time = sc.nextInt();

		int SI = (principal * rate * time) / 100;

		System.out.println("Simple Interest is: " + SI);

	}

}
