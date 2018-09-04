
public class Assignment1_4 {
	
	public static int run(int number1, int number2, int number3) {
		if (number1 == number2 || number1 == number3 || number2 == number3) {
			return -1;
		}
		
		int res = max(max(number1,number2),number3);
		
		System.out.println(res);
		
		if (res == number1) {
			return 1;
		}
		if (res == number2) {
			return 2;
		}
			return 3;
	}

	private static int max(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		}
		return number2;
	}
}
