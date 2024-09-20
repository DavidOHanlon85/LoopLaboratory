/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise02_DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare variables

		int userInput;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// Menu
		
		do {
		System.out.println("1.\tFile\n2.\tEdit\n3.\tSave\n4.\tDelete\n5.\tExit\n\nSelect option...");
		userInput = myScan.nextInt();
		myScan.nextLine();
			if (userInput == 1) {
				System.out.println("File Selected\n");
			} else if (userInput == 2) {
				System.out.println("Edit Selected\n");
			} else if (userInput == 3) {
				System.out.println("Save Selected\n");
			} else if (userInput == 4) {
				System.out.println("Exit Selected\n");
			} else if (userInput == 5) {
				System.out.println("Edit Selected\n");
			} else {
				System.out.println("Erroneous Input\n");
			}
		} while (userInput != 4);
		
		// Close Scanner
		myScan.close();
	}

}
