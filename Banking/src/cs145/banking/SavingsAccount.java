/**
 * 
 */
package cs145.banking;

/**
 * Savings Account for the Bank Account project.
 * 
 * @author Ben
 *
 */
public class SavingsAccount extends BankAccount {
	private double INTEREST_RATE;

	/**
	 * Default constructor for SavingsAccount
	 * 
	 * @param owner is the owner of the account
	 * @param rate  is the rate of interest
	 */
	public SavingsAccount(Person owner, double rate) {
		super(owner);
		INTEREST_RATE = rate;
	}

	/**
	 * Main method for calculating interest.
	 */
	public void accrueInterest() {
		deposit(getBalance() * INTEREST_RATE);
	}
}
