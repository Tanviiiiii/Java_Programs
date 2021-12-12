package string_method;
class Personn {
	private String name;
	private int age;

	public Personn(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String tostring() {
		return "Personn[Name=" + name + ", Age=" + age + "]";
	}
}
public class ToString_method {
	public static void main(String[] args) {
		Personn p = new Personn("Tanvi", 20);
		String str = p.toString();
		System.out.println(str);
	}

}
