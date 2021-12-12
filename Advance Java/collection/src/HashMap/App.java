package HashMap;

import java.util.*;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "AA");
		map.put(2, "BB");
		map.put(3, "CC");
		map.put(4, "DD");
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Collection<String> c = map.values();
		System.out.println(c);

	}

}
