package TreeSet;
import java.util.*;
public class App {

	public static void main(String[] args) {
		TreeSet<Product> set=new TreeSet<Product>();
		set.add(new Product(2,"AA",100));
		set.add(new Product(4,"BB",200));
		set.add(new Product(3,"CC",300));
		set.add(new Product(8,"DD",400));
		set.add(new Product(6,"EE",500));
		
		for(Product p:set) {
			System.out.println(p);
		}
		

	}

}
