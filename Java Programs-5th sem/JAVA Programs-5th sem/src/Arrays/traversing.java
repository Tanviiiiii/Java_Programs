package Arrays;

public class traversing 
{
	public static void main(String args[]) 
	{
		int myArray[] = new int[7];
		myArray[0] = 100;
		myArray[1] = 200;
		myArray[2] = 300;
		myArray[3] = 400;
		myArray[4] = 600;
		myArray[5] = 500;
		myArray[6] = 700;
		System.out.println("Traversing of the array: ");
		for (int element : myArray) 
		{
			System.out.println(element);
		}
	}
}