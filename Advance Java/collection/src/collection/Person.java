package collection;
public class Person {
	
	private String name;
	private String city;
	private int age;
	public Person() {
	}
	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
}
// main class is App4