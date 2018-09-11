
public class Point {
	//Attributes and constructor
	double x;
	double y;
	
	public Point(double xCoordinate, double yCoordinate) {
		x = xCoordinate;
		y = yCoordinate;
	}
	
	//Methods
	public String toString() {
		return "<Point(" + getX() + ", " + getY() + ")>";
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof Point)
		{
			Point that = (Point) other;
			return (this.x == that.x) && (this.y == that.y);
		}
		return false;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double distance(Point other) {
		double xAbs = this.x - other.x;
		double yAbs = this.y - other.y;
		return Math.sqrt(Assignment1_7.squared(xAbs) + Assignment1_7.squared(yAbs));
	}
}
