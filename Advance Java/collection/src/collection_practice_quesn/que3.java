package collection_practice_quesn;

import java.util.*;

public class que3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("White");
		list.add("Yellow");
		System.out.println(list);
		
		list.add(0, "Pink");
		System.out.println(list);		
	}
}
