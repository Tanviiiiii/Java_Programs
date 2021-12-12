package sorting_in_ascending_order;

public class numbersorting {

	public static void main(String[] args) {
		int[] num = { 10, 50, 30, 20, 40, 70, 60 };
		for (int p = 1; p < num.length; p++) {
			for (int j = 0; j < num.length-p; j++) {
				if (num[j] > num[j + 1]) {
					int t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		for (int n : num) {
			System.out.println(n);
		}

	}

}
