package TreeSet;

public class Product implements Comparable<Product> {
	private int pid;
	private String name;
	private int price;
	
	public Product() {}
	public Product(int pid, String name, int price) {
		this.pid=pid;
		this.name=name;
		this.price=price;
		
	}
	public String toString() {
		return "Product [pid="+pid+",name="+name+", price="+price+"]";
		
	}
	public int compareTo(Product p) {
		return this.pid-p.pid;
	}
}
