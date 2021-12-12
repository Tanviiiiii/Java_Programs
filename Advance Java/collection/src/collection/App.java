package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {

		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Amit");
		list1.add("Rahul");
		list1.add("Suman");
		list1.add("Alok");
		list1.add("Prateek");
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
			String name=itr.next().toUpperCase();
			System.out.println(name);			
		}
		// other method
		System.out.println("2nd method:");
		list1.forEach((name)->System.out.println(name));
	}
}
