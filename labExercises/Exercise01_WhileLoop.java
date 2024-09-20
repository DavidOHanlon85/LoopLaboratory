package labExercises;

public class Exercise01_WhileLoop {

	public static void main(String[] args) {
		
		//Declare and initialise variables
		
		int num = 1;
		int sum = 0;
		
		
		while (num < 11) {
		sum += num;
		num++;
		}
		
		System.out.println("The sum is: " +sum);
		
	}

}
