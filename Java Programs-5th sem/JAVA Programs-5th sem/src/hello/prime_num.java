package hello;

import java.util.Scanner;

public class prime_num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) 
		{
			if (num % i == 0) 
			{
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
