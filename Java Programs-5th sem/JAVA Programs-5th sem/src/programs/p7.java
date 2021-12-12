package programs;
import java.util.Scanner;

public class p7 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number1, number2;
		sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print("Enter the Second Number : ");
		number2 = sc.nextInt();	
		
		if(number1 > number2) 
	    {
			System.out.println("The Largest Number = " + number1);          
	    } 
	    else if (number2 > number1)
	    { 
	    	System.out.println("The Largest Number = " + number2);        
	    } 
	    else 
	    {
	    	System.out.println("Both are Equal");
	    }		
	}	
}
