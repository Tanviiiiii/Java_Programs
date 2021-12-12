package pac;

class Abc implements Runnable {
	public void run() {
		while (true) {
			System.out.println("Hello");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {

		Abc obj = new Abc();
		Thread t1 = new Thread(obj);
		t1.start();

		while (true) {
			System.out.println("Hi");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}
