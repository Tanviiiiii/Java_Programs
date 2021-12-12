package lab_internal;

class Bank {
	String Name;
	int ID;
	String address;

	Bank(String Name, int ID, String address) {
		this.Name = Name;
		this.ID = ID;
		this.address = address;
	}
}

class Saving extends Bank {
	Saving(String Name, int ID, String address) {
		super(Name, ID, address);
	}

	void deposite() {
		System.out.println("Money Deposited Successfully");
	}

	void withdraw(int amount) {
		try {
			if (amount < 1000)
				throw new Exception();
			System.out.println("Money Withdraw Successfully");
		} catch (Exception e) {
			System.out.println(e + "Transaction failed");
		}
	}
}

class Current extends Bank {
	Current(String Name, int ID, String address) {
		super(Name, ID, address);
	}

	void deposite() {
		System.out.println("Money Deposited Successfully");
	}

	void withdraw(int amount) {
		try {
			if (amount < 5000)
				throw new Exception();
			System.out.println("Money Withdraw Successfully");
		} catch (Exception e) {
			System.out.println(e + "Transaction failed");
		}
	}
}

public class Testt {
	public static void main(String[] args) {
		Current businessman = new Current("Tanvi", 01, "Noida");
		Saving person = new Saving("Sara", 02, "Delhi");
		Saving person2 = new Saving("Ashmit", 03, "Gurugram");
		businessman.deposite();
		businessman.withdraw(15000);
		person.deposite();
		person.withdraw(700);
		person2.deposite();
		person2.withdraw(400);
	}
}
