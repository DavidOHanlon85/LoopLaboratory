/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise12_NestedLoop_StarAndNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Nested Loop
		
		for (int i = 1; i <= 3; i++) {
		 for (int j = 1; j <= 10; j++) {
			
			if (i == 1) {
				System.out.print("*" + j);
			}
			else if (i == 2) {
				System.out.print("**" + j);
			}
			else {
				System.out.print("***" + j);
			}
			
			if (j != 10) {
				System.out.print(", ");
				}
		}
		 System.out.println();
		}
	}

}
