package hello;

import java.util.Scanner;

public class cal2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();

		System.out.println("Enter second number: ");
		int y = sc.nextInt();

		int sum = x + y;
		int sub = x - y;
		int mul = x * y;
		int div = x / y;

		System.out.println("Sum of x and y is:" + sum);
		System.out.println("Substraction of x and y is:" + sub);
		System.out.println("Multiplication of x and y is:" + mul);
		System.out.println("Division of x and y is:" + div);
	}
}
