package HashSet;

public class Product {
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
	public int hashcode() {
		return pid*100;
	}
	public boolean equals(Object obj) {
		Product n=(Product) obj;
		boolean r=this.pid==n.pid;
		return r;
		
	}
	
	

}
