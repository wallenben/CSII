/**
 * 
 */
package cs145.banking;

/**
 * CheckingAccount for the Bank Account project.
 * 
 * @author Ben
 */
public class CheckingAccount extends BankAccount {
	private static final double MIN_BALANCE = 100;
	private static final double FEE = 10;
/**
 * Default constructor for a Checking Account 
 * @param owner is the owner of the account
 */
	public CheckingAccount(Person owner) {
		super(owner);
	}

	@Override
	/**
	 * Withdraw class for Checking Account. Overrides super withdraw method
	 */
	public boolean withdraw(double amount) {
		if (super.withdraw(amount)) {
			if (getBalance() < MIN_BALANCE) {
				if (super.withdraw(FEE)) {
					System.out.println("Dropped below the minimum balance, fee was deducted");
					return true;
				} else {
					deposit(amount);// reverse the transaction for insufficient funds
					return false;
				}
			} else {
				return true;
			}
		}
		return false;
	}
}
