package collection_practice_quesn;

import java.util.*;

public class que5 {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		
		list_Strings.set(2, "yellow");
		System.out.println(list_Strings);
		
	}
}
