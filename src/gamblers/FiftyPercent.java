package gamblers;

public class FiftyPercent {
	/**
	 * This method is created to know whether the gambler would resign for the day,
	 * if he wins or lose 50% of the stake.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int bet = 1;
		int maxStake = 100;
		int minStake = 1;
		int totalStake = 100;

		/**
		 * Using random to check whether the gambler wins or not.
		 */
		for (int days = 1; days <= 20; days++) {
			
			for (int game = 1; game <= 25; game++) {

				while (bet >= 1 || bet <= 100) {

					totalStake = totalStake - bet;
					System.out.println("For Day " + days + ":");
					System.out.println("For game " + game + ":");

					System.out.println("You spent $" + bet + " to play,then your total stake is $" + totalStake);

					/**
					 * Generating Random Numbers.
					 */

					int random = (int) Math.floor(Math.random() * 2);

					/**
					 * If random is equals to 0 then player has lost the bet. If random is equals to
					 * 1 then player has won the bet.
					 */

					if (random == 0) {

						System.out.println("You have lost.");
						totalStake--;
						System.out.println("Your Total Stake is $" + totalStake);
						break;
					}
					if (random == 1)
						System.out.println("You have won.");
					totalStake = totalStake + 3;
					System.out.println("Your Total Stake is $" + totalStake);
					break;
				}
			}
			/**
			 * To calculate whether gambler has lost or won 50% of the stake.
			 */
			if (totalStake <= 50) {
				System.out.println("You have lost more than 50% of Total Stake ");
				break;
			}
			if (totalStake >= 150) {
				System.out.println("You have won more than 50% of Total Stake ");
				break;
			}
		}
	}
}