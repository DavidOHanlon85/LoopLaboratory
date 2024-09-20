/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise07_WhileLoop_CountPlusCommas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		int i = 1;
		
		while (i <= 10) {
			System.out.print(i);
			if (i != 10) {
				System.out.print(", ");
			}
			i++;
		}
	}

}
