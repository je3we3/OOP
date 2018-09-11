
public class Assignment2_1 {

	public static void println(int[] seq) {
		for (int i = 0; i < seq.length; i++) {
			System.out.print(seq[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] seq) {
		if (seq.length >= 2) {
			int temp = seq[0];
			seq[0] = seq[1];
			seq[1] = temp;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public static int[] copy(int[] seq) {
		int n = seq.length;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = seq[i];
		}
		return result;
	}
	
	public static void rotate(int[] seq) {
		int n = seq.length;
		if (n >= 2) { 
			int temp = seq[n - 1];
			for (int i = 1; i < n; i++) {
				seq[n - i] = seq[n - i - 1];
			}
			seq[0] = temp;
		} else if (n <= 0){
			throw new IllegalArgumentException();
		}
	}
	
	/* Creates 2 temporary arrays, a left side and right side. The size of the arrays is determined by the number of 
	 * rotations to be performed. The left side and right side arrays are then swapped around to create the effect of
	 * rotating the array m times. This has a runtime of 2 * seq.length steps, as opposed to m * seq.length steps.
	*/
	public static void rotate(int[] seq, int m) {
		int n = seq.length;
		if (n >= 2 && m > 0) { 
			int mMod = m % n;
			//check whether no rotation happens at all
			if (mMod == 0) {
				return;
			} else if (mMod == 1) {
				rotate(seq);
				return;
			}
			
			int i;
			int[] leftSide = new int[mMod];
			int[] rightSide = new int[n - mMod];
			
			for (i = 0; i < mMod; i++) {
				leftSide[mMod - i - 1] = seq[n - i - 1];
			}
			for (i = 0; i < (n - mMod); i++) {
				rightSide[i] = seq[i];
			}
			for (i = 0; i < mMod; i++) {
				seq[i] = leftSide[i];
			}
			for (i = 0; i < (n - mMod); i++) {
				seq[i + mMod] = rightSide[i];
			}
		} else if (m <= 0 || n <= 0) {
			throw new IllegalArgumentException();
		}
	}
}
