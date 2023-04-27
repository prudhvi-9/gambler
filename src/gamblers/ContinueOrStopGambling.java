package gamblers;

import java.util.*;

public class ContinueOrStopGambling {
	static int bet = 1;
	static int maxStake = 100;
	int minStake = 1;
	static int totalStake = 100;
	static int totalAmount = 0;
	static int dayWon = 0;
	static int dayLost = 0;
	static int gameLost = 0;
	static int gameWon = 0;
	static int day = 0;
	static int option;

	/**
	 * This method is created to know whether the gambler wants to continue or stop
	 * the gambling for the next month.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		playing();
		switch (option) {
		case 1:
			playing();

		case 2:
			System.out.println("Game over");
		}

	}

	public static void menu() {
		/**
		 * Taking input from user.
		 */
		System.out.println("Enter Your Option:\n1)Continue. 2)Stop.");
		Scanner cs = new Scanner(System.in);
		option = cs.nextInt();

		cs.close();
	}

	public static void playing() {
		/**
		 * Using random to check whether the gambler wins or not.
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
					 * To find the luckiest  day.
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
		System.out.println("----------------------------------------");
		if (totalStake > 110) {
			System.out.println("Would you like to continue or stop gambling?");
			menu();
		}
	}
}
