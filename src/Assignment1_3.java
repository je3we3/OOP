import java.util.*;

public class Assignment1_3 {

	public static void main(String[] args) {
		//Create scanner object and create variables
		Scanner sc = new Scanner(System.in);
		
		//Ask for temperature in degrees Celsius
		System.out.print("Please provide a temperature in degrees Celsius that you want to convert to degrees Fahrenheit: ");
		double celsius = (double) sc.nextInt();
		
		//Convert to degrees Fahrenheit
		double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
		System.out.println("A temperature of " + celsius + " degrees Celsius is equal to a temperature of " + fahrenheit + " degrees fahrenheit.");
	}

}
