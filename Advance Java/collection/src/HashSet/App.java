package HashSet;
import java.util.*;
public class App {

	public static void main(String[] args) {
		HashSet<Product> set=new HashSet<Product>();
		set.add(new Product(1,"AA",100));
		set.add(new Product(2,"BB",200));
		set.add(new Product(3,"CC",300));
		set.add(new Product(4,"DD",400));
		set.add(new Product(5,"EE",500));
		
		for(Product p:set) {
			System.out.println(p);
		}
		

	}

}
