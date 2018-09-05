
public class Assignment1_7 {
	
	public static double max(double x, double y) {
		if (y > x) {
			return y;
		}
		return x;
	}
	
	public static double abs(double x) {
		return Math.sqrt(x * x);
	}
	
	public static double squared(double x) {
		return x * x;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double xAbs = abs(x1 - x2);
		double yAbs = abs(y1 - y2);
		return Math.sqrt(squared(xAbs) + squared(yAbs));
	}
}
