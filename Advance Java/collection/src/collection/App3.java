package collection;

class MyStrings{
	private String str;
	public MyStrings(String str) {
		this.str=str;
	}
}
public class App3 {

	public static void main(String[] args) {

		String str1=new String("Rehan");
		String str2=new String("Rehan");
		
		boolean res=str1.equals(str2);
		System.out.println(res);
	}
}
