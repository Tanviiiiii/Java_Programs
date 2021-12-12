package basics;

public class App {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 67;
		num[1] = 67;
		num[2] = 67;
		num[3] = 67;
		num[4] = 67;
		int[] na = new int[num.length * 2];
		for (int i = 0; i < num.length; i++) {
			na[i] = num[i];
		}
		num = na;
		num[5] = 67;
		num[6] = 67;	
	}	
}
// how to extend size of array list 