package method_overloding;
import java.util.Scanner;
class testt {
	int length, breadth;
	float radius;

	static int area(int length) {
		System.out.println("Area of square:");
		return length * length;
	}
	
	public static int area(int length, int breadth) {
		System.out.println("Area of reactangle:");
		return length * breadth;
	}

	static double area(float radius) {
		System.out.println("Area of circle:");
		return (3.14 *radius* radius);
	}
}
	public class Methd_overloading2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for length:");
		int length = sc.nextInt();

		System.out.println("Enter value for breadth:");
		int breadth = sc.nextInt();

		System.out.println("Enter value for radius:");
		float radius = sc.nextInt();
		
		testt obj=new testt ();
		System.out.println(testt.area(length));
		System.out.println(testt.area(length, breadth));
		System.out.println(testt.area(radius));
	}
}
