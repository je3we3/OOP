
public class Assignment2_2 {

	public static int max(int[] seq) { 
		int n = seq.length;
		if (n == 0) {
			return Integer.MIN_VALUE;
		}
		int maxValue = seq[0];
		for (int i = 1; i < n; i++) {
			if (maxValue < seq[i]) {
				maxValue = seq[i];
			}
		}
		return maxValue;
	}
	
	public static int index(int[] seq, int el) {
		for (int i = 0; i < seq.length; i++) {
			if (el == seq[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean contains(int[] seq, int el) {
		for (int i = 0; i < seq.length; i++) {
			if (el == seq[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPrime(int el) {
		if (el > 1) {
			
			for (int i = 2; i < (el - 1); i++) {
				if (el % i == 0) {
					return false;
				}	
			}
			return true;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public static int countPrimes(int[] seq) {
		int number = 0;
		for (int i = 0; i < seq.length; i++) {
			if (isPrime(seq[i])) {
				number++;
			}
		}
		return number;
	}
	
	public static int[] primesIn(int[] seq) {
		int[] result = new int[countPrimes(seq)];
		int counter = 0;
		for (int i = 0; i < seq.length; i++) {
			if (isPrime(seq[i])) {
				result[counter] = seq[i];
				counter++;
			}
		}
		return result;
	}
	
	public static int[] primesUpTo(int n) {
		int[] temp = new int[n];
		int counter = 0;
		int i;
		for (i = 2; i < n; i++) {
			if (isPrime(i)) {
				temp[counter] = i;
				counter++;
			}
		}
		int[] result = new int[counter];
		for (i = 0; i < counter; i++) {
			result[i] = temp[i];
		}
		return result;
	}
}
