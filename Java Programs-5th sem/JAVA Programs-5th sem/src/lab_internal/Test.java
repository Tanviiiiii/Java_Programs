package lab_internal;
public class Test {

	public static void main(String args[]) {
		Account acct = new Account();
		System.out.println("customer name:" + acct.name);
		System.out.println("Customer_id:" + acct.Customer_id);
		System.out.println("Address:" + acct.Address);
		System.out.println("Current balance : " + acct.balance());
		System.out.println("Withdrawing Money : 5500");
		acct.withdraw(5500);
		System.out.println("Current balance : " + acct.balance());
		acct.withdraw(3500);

	}

}