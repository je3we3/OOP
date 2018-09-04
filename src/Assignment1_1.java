
public class Assignment1_1 {
	public static void main(String[] args) {
		//Declare variables
		int number = 10;
		int increment = 1;
		int maxNumber = Integer.MAX_VALUE;
		
		//Assignment part 1
		System.out.println("The number is equal to: " + number + ".");
		number += increment;
		System.out.println("The number is now equal to: " + number + ".");
		
		//Assignment part 2
		System.out.println("The highest possible value for an integer is: " + maxNumber + ".");
		System.out.println("Adding " + increment + " to " + maxNumber + " will cause an integer overflow,");
		System.out.println("making it the lowest possible value for an integer.");
		maxNumber += increment;
		System.out.println("The lowest possible value for an integer is: " + maxNumber + ".");
	}

}
