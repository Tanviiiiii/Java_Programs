package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class App4 {

	public static void main(String[] args) {

		ArrayList<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("AA", "DELHI", 10));
		list1.add(new Person("BB", "MUMBAI", 20));
		list1.add(new Person("CC", "CHANDIGARH", 30));
		list1.add(new Person("DD", "HMH", 40));
		// 1st method
		System.out.println("1st method");
		for (Person p : list1) {
			System.out.println(p);
		}
		// 2nd method
		System.out.println("2nd method");
		for (int i = 0; i < list1.size(); i++) {
			Person p = list1.get(i);
			System.out.println(p);
		}
		//3rd method
		System.out.println("3rd method");
		Iterator<Person> itr=list1.iterator();
		while(itr.hasNext()) {
			Person p=itr.next();
			System.out.println(p);
		}
	}
}
