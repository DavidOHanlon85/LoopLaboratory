/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise09_EvenNumbers1To100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare and Initialise Variables
		
		for (int i = 0; i <= 100; i++)
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
	}

}
