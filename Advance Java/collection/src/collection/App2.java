package collection;
class MyString{
	private String str;
	public MyString(String str) {
		this.str=str;
	}
	public int hashCode() {
		return str.hashCode();
	}
}
public class App2 {

	public static void main(String[] args) {

		String str1=new String("Rehan");
		MyString str2=new MyString("Rehan");
		
		int n1=str1.hashCode();
		int n2=str2.hashCode();
		
		System.out.println(n1);
		System.out.println(n2);

	}

}
