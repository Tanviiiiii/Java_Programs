package collection_practice_quesn;

import java.util.*;

public class MyList {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Red");
		list.add("blue");
		list.add("green");
		list.add("white");
		list.add("black");
		System.out.println(list);
		
		list.add(0, "yellow");
		System.out.println(list);
		
		//list.get(1);
		System.out.println(list.get(1));
		
		//list.remove(2);
		System.out.println(list.remove(2));
		
		//list.set(3, "pink");
		System.out.println(list.set(3, "pink"));
		
		//list.size();
		System.out.println(list.size());
		
		//list.isEmpty();
		System.out.println(list.isEmpty());
		
		//list.contains("Red");
		System.out.println(list.contains("Red"));
		
		Iterator <String> itr=list.iterator();
		while(itr.hasNext()) {
			String listt=itr.next().toUpperCase();
			System.out.println(listt);		
		}		
	}
}
