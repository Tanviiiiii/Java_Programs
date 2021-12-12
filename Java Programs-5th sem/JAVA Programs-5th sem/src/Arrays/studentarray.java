package Arrays;
import java.util.*;

public class studentarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name;
		int marks;
		System.out.println("Enter the Name:");
		name = sc.next();
		System.out.println("Enter the total subjects:");
	    marks=sc.nextInt();
		int arr[] = new int[marks];
		System.out.println("Enter the marks secured in each subject:");
		for (int i = 0; i < marks; i++) {
			arr[i] = sc.nextInt();
		}

		int total = 0;

		for (int i = 0; i < marks; i++) {
			total = total + arr[i];
		}

		System.out.println("The total marks obtained is:" + total);

		float percentage;
		percentage = (total / (float) marks);

		System.out.println("Total Percentage:" + percentage + "%");
	}
}
