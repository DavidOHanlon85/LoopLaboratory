/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise14_DoWhile_AgeRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare and Initialise Variables

		int userAge;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		try {

			do {
				System.out.println("What age are you?");
				userAge = myScan.nextInt();

				if (userAge >= 1 && userAge <= 30) {
					System.out.println("You are young");
				} else if (userAge >= 31 && userAge <= 60) {
					System.out.println("You are getting on!");
				} else if (userAge >= 61 && userAge <= 120) {
					System.out.println("You look amazing for your age!");
				} else {
					System.out.println("Invalid input - please try again!");
				}

			} while (userAge < 1 || userAge > 120);

		} catch (Exception ex) {
			System.out.println("Sorry, problem with your input!");
		}

		myScan.close();
	}

}
