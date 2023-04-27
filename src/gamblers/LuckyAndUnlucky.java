package gamblers;

public class LuckyAndUnlucky {

	/**
	 * This method is created to know gambler's luckiest day or unluckiest day.
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
		int dayWon = 0;
		int dayLost = 0;
		int gameLost = 0;
		int gameWon = 0;
		int day = 0;
		int days;
		/**
		 * Using random to check whether the gambler wins or not.
		 */
		for (days = 1; days <= 20; days++) {

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
						gameLost++;
						System.out.println("Your Total Stake is $" + totalStake);

						/**
						 * To find the unluckiest day.
						 */
						if (totalStake == 70) {
							System.out.println("UnLuckiest Day ");
						}
						break;
					}

					if (random == 1)
						System.out.println("You have won.");
					totalStake = totalStake + 3;
					gameWon++;
					System.out.println("Your Total Stake is $" + totalStake);

					/**
					 * To find the luckiest day.
					 */
					if (totalStake == 120) {
						System.out.println("Luckiest Day ");
					}
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
			System.out.println("You have won total amount of $" + totalAmount);
			System.out.println("----------------------------------------");

		}
		if (totalStake < 100) {
			totalAmount = maxStake - totalStake;
			System.out.println("You have lost total amount of $" + totalAmount);
			System.out.println("----------------------------------------");

		}
		/**
		 * To calculate how many days did the gambler has won or lost.
		 */
		gameWon = gameWon % 20;
		gameLost = gameLost % 20;
		dayWon = gameWon;
		dayLost = gameLost;
		System.out.println("Days won :" + dayWon);
		System.out.println("Days lost :" + dayLost);

	}

}