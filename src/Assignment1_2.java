
public class Assignment1_2 {

	public static void main(String[] args) {
		//Declare variables
		int number1 = 1;
		int number2 = 2;
		int number3 = 3;
		int temp;
		
		//Initial state
		System.out.println("Number 1 is equal to: " + number1);
		System.out.println("Number 2 is equal to: " + number2);
		System.out.println("Number 3 is equal to: " + number3);
		System.out.println();
		
		//Swap
		temp = number3;
		number3 = number2;
		number2 = number1;
		number1 = temp;
		
		//Final state
		System.out.println("Number 1 is now equal to: " + number1);
		System.out.println("Number 2 is now equal to: " + number2);
		System.out.println("Number 3 is now equal to: " + number3);
	}

}
