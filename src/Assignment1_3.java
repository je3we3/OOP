import java.util.*;

public class Assignment1_3 {

	public static void main(String[] args) {
		//Create scanner object and create variables
		Scanner sc = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		
		//Ask for temperature in degrees Celsius
		System.out.print("Please provide a temperature in degrees Celsius that you want to convert to degrees Fahrenheit: ");
		celsius = sc.nextInt();
		
		//Convert to degrees Fahrenheit
		fahrenheit = 9/5 * celsius + 32.0;
		System.out.println("A temperature of " + celsius + " degrees Celsius is equal to a temperature of " + fahrenheit + " degrees fahrenheit.");
	}

}
