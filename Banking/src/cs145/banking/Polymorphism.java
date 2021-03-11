/**
 * 
 */
package cs145.banking;

/**
 * Main method for the Bank Account program.
 * 
 * @author Ben Wallen
 *
 */
public class Polymorphism {

	/**
	 * @param args Main function for the bank account program.
	 */
	public static void main(String[] args) {
		final int numAccounts = 6;
		MailingAddress sesameSt;
		MailingAddress neighborhood;
		Person cookieMonster;
		Person mrRogers;
		BankAccount[] accountList;

		accountList = new BankAccount[numAccounts];
		sesameSt = new MailingAddress("123 Sesame St.", "New York City", "NY", "10001");
		neighborhood = new MailingAddress("4802 Fifth Ave", "Pittsburg", "PA", "15203");
		cookieMonster = new Person("Cookie", "Monster", sesameSt, 1234);
		mrRogers = new Person("Fred", "Rogers", neighborhood, 9876);
		// create accounts
		accountList[0] = new SavingsAccount(mrRogers, 0.025);
		accountList[1] = new SavingsAccount(cookieMonster, 0.025);
		accountList[2] = new CheckingAccount(mrRogers);
		accountList[3] = new CheckingAccount(cookieMonster);
		accountList[4] = new CheckingAccount(mrRogers);
		accountList[5] = new CheckingAccount(mrRogers);

		printAccountList(accountList, numAccounts);
		// deposit money into accounts
		accountList[0].deposit(400);
		accountList[1].deposit(300);
		accountList[2].deposit(410);
		accountList[3].deposit(400);
		accountList[4].deposit(500);
		accountList[5].deposit(300);
		printAccountList(accountList, numAccounts);
		// withdraw 400 from each
		for (int i = 0; i < numAccounts; i++) {
			if (accountList[i].withdraw(400)) {
				System.out.println("Withdrawl successful.");
			} else {
				System.out.println("Insufficient  funds.\n" + accountList[i] + "\n");
			}
		}
		printAccountList(accountList, numAccounts);
		// account for interest
		for (int i = 0; i < numAccounts; i++) {
			if (accountList[i] instanceof SavingsAccount) {
				((SavingsAccount) accountList[i]).accrueInterest();
			}
		}
		printAccountList(accountList, numAccounts);

	}

	/**
	 * Quick method for printing bank account data
	 * 
	 * @param list is the array of Bank Accounts
	 * @param size is the size of the bank account array.
	 */
	public static void printAccountList(BankAccount[] list, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(list[i].toString());
			System.out.println();
		}
		System.out.println("-----------------");
	}

}
