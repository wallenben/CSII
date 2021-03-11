/**
 * 
 */
package cs145.banking;

import java.text.DecimalFormat;

/**
 * Represents a bank account at a finacial institution
 * 
 * @author Ben
 * @version 2021.3.1
 */
public abstract class BankAccount {
	private long accountNumber;
	private double balance;
	private Person owner;
	private static long numAccounts = 1000;

	/**
	 * @param owner
	 */
	public BankAccount(Person owner) {
		this.owner = owner;
		accountNumber = numAccounts++;
		balance = 0;
	}

	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * Deposit class for depositing funds into the account
	 * 
	 * @param amount is the amount being deposited
	 * @return true on completion
	 */
	public boolean deposit(double amount) {
		balance += amount;
		return true;
	}

	/**
	 * Withdraw class for withdrawing funds from the account
	 * 
	 * @param amount is the amount being withdrawn
	 * @return true on completion
	 */
	public boolean withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	/**
	 * toString method
	 */
	public String toString() {
		DecimalFormat x = new DecimalFormat("$#,##0.00");
		return owner + "\nAcct: ######" + accountNumber + "\n" + "Balance: " + x.format(balance);
	}
}
