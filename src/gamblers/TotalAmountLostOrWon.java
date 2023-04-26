package gamblers;

public class TotalAmountLostOrWon {
	/**
	 * This method is created to calculate the amount won or lost.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bet = 1;
		int maxStake = 100;
		int minStake = 1;
		int totalStake = 100;
		int totalAmount = 0;

		/**
		 * Using random to check whwether the gambler wins or not.
		 */
		for (int days = 1; days <= 20; days++) {

			for (int game = 1; game <= 10; game++) {

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
				System.out.println("----------------------------------------");

			}

		}
		/**
		 * To calculate how much amount did the gambler won or lost.
		 */
		if (totalStake > 100) {
			totalAmount = totalStake - maxStake;
			System.out.println("You have won $" + totalAmount);
		}
		if (totalStake < 100) {
			totalAmount = maxStake - totalStake;
			System.out.println("You have lost $" + totalAmount);
		}
	}

}
