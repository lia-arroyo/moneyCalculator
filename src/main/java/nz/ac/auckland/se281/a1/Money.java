package nz.ac.auckland.se281.a1;

/**
 * University of Auckland
 * <p>
 * SOFTENG 281 - SEMESTER 1 - 2022
 * <p>
 * ASSIGNMENT 1 (A1)
 * <p>
 * Money Class
 */
public class Money {
	// TODO implement Task 2
	// class attributes here
	private int dollars;
	private int cents;

	/**
	 * Construct a Money instance with given initial dollar and cent components
	 * 
	 * If a Money instance is constructed with an invalid <code>dollars</code> or
	 * <code>cents</code>, then that value is set to 0
	 *
	 * @param dollars
	 * @param cents
	 */
	public Money(int dollars, int cents) {
		// TODO implement Task 2

		// ensuring dollars input is valid
		if (dollars >= 0) {

			this.dollars = dollars;

		} else { // reverts to default value

			this.dollars = 0;
		}

		// ensuring cents input is valid
		if (cents >= 0 && cents <= 99) {
			this.cents = cents;

		} else if (cents >= 100) { // wrapping cents

			int wrap = cents / 100; // calculating amount in dollars
			int remainingCents = cents % 100; // amount to be left as cents

			// recalculating dollars and cents
			this.dollars += wrap;
			this.cents = remainingCents;

		} else { // reverts to default value if invalid input
			this.cents = 0;
		}
	}

	/**
	 * Default constructor
	 * 
	 * the default value of <code>dollars</code> and <code>cents</code> is 0.
	 * 
	 */
	public Money() {
		// TODO implement Task 2

		// initialising default values
		this.dollars = 0;
		this.cents = 0;
	}

	/**
	 * returns the dollars component
	 *
	 * @return
	 */
	public int getDollars() {
		// TODO implement Task 2
		return this.dollars;
	}

	/**
	 * returns the cents component
	 *
	 * @return
	 */
	public int getCents() {
		// TODO implement Task 2
		return this.cents;
	}

	/**
	 * returns the total amount as cents
	 *
	 * @return
	 */
	public int getTotalAsCents() {
		// TODO implement Task 2

		// transforming dollars into cents
		int dollarsInCents = this.dollars * 100;

		// returning total total amount in cents
		return dollarsInCents + this.cents;
	}

	/**
	 * add the specified dollar amount to this Money
	 * 
	 * if <code>dollars</code> is negative then nothing changes
	 * 
	 * @param dollars amount to add
	 */
	public void addDollars(int dollars) {
		// TODO implement Task 3

		// ensuring dollars input isn't negative
		if (dollars >= 0) {
			// add to existing total dollars
			this.dollars += dollars;
		}
	}

	/**
	 * add the specified cents amount to this Money
	 * 
	 * if <code>cents</code> is negative then nothing changes
	 * 
	 * @param cents amount to add
	 */
	public void addCents(int cents) {
		// TODO implement Task 3

		// ensuring cents input is not negative
		if (cents >= 0) {

			// temp new total cents
			int newTotalCents = this.cents + cents;

			// wrapping up the cents
			int excessDollars = newTotalCents / 100; // amount to be added to dollars
			int remainingCents = newTotalCents % 100; // amount left in cents

			// updating attributes
			this.dollars += excessDollars;
			this.cents = remainingCents;
		}

	}

	/**
	 * subtract the specified dollar amount from this Money
	 * 
	 * if <code>dollars</code> is negative then nothing changes. if it is attempted
	 * to decrease the money by an amount that is larger than the available money
	 * nothing changes
	 * 
	 * @param dollars amount to subtract
	 */
	public void subtractDollars(int dollars) {
		// TODO implement Task 3
		// ensuring dollars input is valid
		if (dollars >= 0 && dollars <= this.dollars) {

			this.dollars -= dollars;
		}
	}

	/**
	 * subtract the specified cents amount from this Money
	 * 
	 * if <code>cents</code> is negative then nothing changes. if it is attempted to
	 * decrease the money by an amount that is larger than the available money
	 * nothing changes
	 * 
	 * @param cents
	 */
	public void subtractCents(int cents) {
		// TODO implement Task 3

		// taking current total and turning it to cents
		int totalAsCents = this.getTotalAsCents();

		// checking cents input is valid
		if (cents >= 0 && cents <= totalAsCents) {
			// temp new total as cents
			int newTotal = totalAsCents - cents;

			// wrapping result
			int newDollars = newTotal / 100;
			int newCents = newTotal % 100;

			// updating instance attributes
			this.dollars = newDollars;
			this.cents = newCents;
		}
	}

	/**
	 * add the other Money amount to this Money.
	 * 
	 * The method does not affect the <code>other</code> Money instance. We assume
	 * that the <code>other</code> object has a valid amount.
	 * 
	 * @param other Money instance to add to the current instance
	 */
	public void add(Money other) {
		// TODO implement Task 4
	}

	/**
	 * subtract the other Money amount from this Money
	 *
	 * The method does not affect the <code>other</code> Money instance. We assume
	 * that the <code>other</code> object has a valid amount.
	 *
	 * @param other Money instance to subtract to the current instance
	 */
	public void subtract(Money other) {
		// TODO implement Task 4
	}

	/**
	 * split the total amount of Money with the other instance.
	 * 
	 * The method will change the amount of both the current instance and the
	 * <code>other</code> instance. We assume that the <code>other</code> object has
	 * a valid amount.
	 * 
	 * 
	 * 
	 * @param other Money instance to split with
	 */
	public void split(Money other) {
		// TODO implement Task 4
	}

}
