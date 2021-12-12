package generics;

public class Holder {
	
	private Object data;
	public Holder(Object data) {
		this.data=data;
	}
	public void add(Object data) {
		this.data=data;
	}
	public Object get() {
		return data;
	}
}
