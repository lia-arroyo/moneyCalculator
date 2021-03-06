package nz.ac.auckland.se281.a1;

/**
 * University of Auckland
 * <p>
 * SOFTENG 281 - SEMESTER 1 - 2022
 * <p>
 * ASSIGNMENT 1 (A1)
 * <p>
 * Basics Class
 */
public class Basics {

	/**
	 * Returns the total number of cents. For example, it returns 320 given
	 * <code>dollars
	 * = 3</code> and <code>cents = 20</code>. If either dollars or cents are
	 * invalid (have negative values) the method returns -1.
	 * 
	 * @param dollars
	 * @param cents
	 * @return the total amount in cents, or -1 if dollars or cents are invalid.
	 */
	public static int getTotalAsCents(int dollars, int cents) {
		// TODO implement Task 1

		// initialising variables
		int total = -1;

		// checking inputs are valid i.e. not negative
		if (dollars >= 0 & cents >= 0) {
			total = (dollars * 100) + cents; // turned dollars into cents then added to current cents
		}

		return total;
	}

	/**
	 * Returns the sum of two money amounts as cents. For example, it returns 530
	 * given <code>moneyOneDollars = 3</code> <code>moneyOneCents = 0</code>,
	 * <code>moneyTwoDollars = 2</code>, and <code>moneyTwoCents = 30</code>.
	 * <p>
	 * if any of the two amounts contains invalid dollars or cents (have negative
	 * values) the method returns -1.
	 * 
	 * @param moneyOneDollars the dollars of the first amount
	 * @param moneyOneCents   the cents of the first amount
	 * @param moneyTwoDollars the dollars of the second amount
	 * @param moneyTwoCents   the cents of the second amount
	 * @return the sum of two money amounts as cents, or -1 if invalid dollars or
	 *         cents are provided
	 */
	public static int sumAsCents(int moneyOneDollars, int moneyOneCents, int moneyTwoDollars, int moneyTwoCents) {
		// TODO implement Task 1

		// initialising variables
		int sum = -1; // default is invalid

		// converting each amount to their total in cents
		int amountOneCents = getTotalAsCents(moneyOneDollars, moneyOneCents);
		int amountTwoCents = getTotalAsCents(moneyTwoDollars, moneyTwoCents);

		// checking that neither amounts are invalid
		if (amountOneCents != -1 & amountTwoCents != -1) {
			// summing the two amounts
			sum = amountOneCents + amountTwoCents;
		}

		return sum;
	}

	/**
	 * Returns the sum of two money amounts, as cents, split in half. For example,
	 * it returns 265 given <code>moneyOneDollars = 3</code>
	 * <code>moneyOneCents = 0</code>, <code>moneyTwoDollars = 2</code>, and
	 * <code>moneyTwoCents = 30</code>.
	 * <p>
	 * if any of the two amounts contains invalid dollars or cents (have negative
	 * values) the method returns -1.
	 * <p>
	 * if the total sum of two money amounts as cents is an odd value, when we do
	 * the split we ignore the extra cent. For example, if the two amounts total
	 * <code>153</code> cents comes out to <code>76</code> cents.
	 * 
	 * @param moneyOneDollars the dollars of the first amount
	 * @param moneyOneCents   the cents of the first amount
	 * @param moneyTwoDollars the dollars of the second amount
	 * @param moneyTwoCents   the cents of the second amount
	 * @return two money amounts, as cents, split in half, or -1 if invalid dollars
	 *         or cents are provided
	 */
	public static int splitAsCents(int moneyOneDollars, int moneyOneCents, int moneyTwoDollars, int moneyTwoCents) {
		// TODO implement Task 1

		// initialising variables
		int halved = -1; // default value is -1.

		// getting the sum of two values
		int totalSum = sumAsCents(moneyOneDollars, moneyOneCents, moneyTwoDollars, moneyTwoCents);

		// ensuring inputs are valid
		if (totalSum != -1) {
			// splitting the sum in half
			halved = totalSum / 2; // takes care of extra cent if any of the amounts are odd bc of integer division
		}

		return halved;

	}

}
