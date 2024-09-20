/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise04_ForLoop_CountPlusCommas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and Initialise Variable
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			
			if (i != 10) {
				System.out.print(", ");
			}
		}

	}

}
