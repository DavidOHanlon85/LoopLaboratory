/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise11_LaunchAborted_BreakStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare and Initialise Variables
		
		int i = 1000;
		
		// While loop
		
		while (i >= 0) {
			if (i == 333) {
				System.out.println("Launch Aborted");
				break;
			}
			System.out.println(i);
			i--;
		}
	}

}
