package sorting_in_ascending_order;

public class alphabetsorting {

	public static void main(String[] args) {
		String[] str = { "10", "50", "30", "20", "40", "70", "60" };
		for (int p = 1; p < str.length; p++) {
			for (int j = 0; j < str.length - p; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					String t = str[j];
					str[j] = str[j + 1];
					str[j + 1] = t;
				}
			}
		}
		for (String n : str) {
			System.out.println(n);
		}

	}

}
