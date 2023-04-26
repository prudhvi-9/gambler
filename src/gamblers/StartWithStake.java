package gamblers;

public class StartWithStake {
	/**
	 * This is method is created to check whether gambler has won or not.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bet = 1;
		int maxStake = 100;
		int minStake = 1;
		int totalStake = 100;
		/**
		 * Using random to check whether the gambler wins or not.
		 */
		for (int days = 1; days <= 20; days++) {
			for (int game = 1; game <= 5; game++) {
				while (bet >= 1 || bet <= 100) {

					totalStake = totalStake - bet;
					System.out.println("For Day " + days + ":");
					System.out.println("For game " + game + ":");

					System.out.println("You spent $" + bet + " then your total stake is $" + totalStake);
					
					/**
					 * Generating Random Numbers.
					 */
					int random = (int) Math.floor(Math.random() * 2);

					/**
					 * If random is equals to 0 then player has lost the bet.
					 * If random is equals to 1 then player has won the bet.
					 */
					if (random == 0) {

						System.out.println("You have lost.");
						totalStake--;
						System.out.println("Your Total Stake is $" + totalStake);
						break;
					}
					if (random == 1)
						System.out.println("You have won.");
					totalStake++;
					System.out.println("Your Total Stake is $" + totalStake);
					break;
				}
			}

		}
	}
}
