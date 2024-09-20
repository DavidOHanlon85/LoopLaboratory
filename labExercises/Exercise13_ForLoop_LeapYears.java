/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise13_ForLoop_LeapYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create loop
		
		for (int i = 1910; i <= 1990; i++) {
			if (i % 4 == 0){
				System.out.println(i);
			}
		}

	}

}
