package generics;

public class App {

	public static void main(String[] args) {
		int x=10;
		Integer i=x;//Object of Integer class will be created autometically.It is called auto-boxing

		double y=90.56;//Object of double class will be created autometically.It is called auto-boxing
		Double d=y;


		int a=i;//It will be automatically converted from object to primitive.It is called auto-unboxing
		double b=d;//It will be automatically converted from object to primitive.It is called auto-unboxing
		
		System.out.println(a);
		System.out.println(b);

	}

}
