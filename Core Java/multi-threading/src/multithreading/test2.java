package multithreading;

public class test2 {
	public static void main(String[] args) {
		tableThread th1 = new tableThread(10);
		tableThread th2 = new tableThread(20);
		tableThread th3 = new tableThread(30);
		tableThread th4 = new tableThread(40);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
