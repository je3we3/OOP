
public class Assignment1_6 {
	
	public static String run(int n) {
		String square ="";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				square += "*";
			}
			square += "\n";
		}
		return square;
	}
}