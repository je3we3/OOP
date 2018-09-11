
public class Circle {
	// Attributes and constructor
	Point center;
	double radius;

	public Circle(Point centerPoint, double size) {
		center = centerPoint;
		if (size > 0.0) {
			radius = size;
			return;
		}
		radius = 0;
	}

	// Methods
	public String toString() {
		return "<Circle(" + getCenter() + ", " + getRadius() + ")>";
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof Circle) {
			Circle that = (Circle) other;
			return (this.getCenter().equals(that.getCenter())) && (this.radius == that.radius);
		}
		return false;
	}

	public Point getCenter() {
		return center;
	}

	public double getRadius() {
		return radius;
	}

	public double periphery() {
		return 2 * radius * Math.PI;
	}

	public double surface() {
		return radius * radius * Math.PI;
	}

	public void translate(double dx, double dy) {
		center.translate(dx, dy);
	}

	public boolean overlappingWith(Circle other) {
		if (this.equals(other)) {
			return true;
		}
		if (center.distance(other.getCenter()) < (radius + other.getRadius())) {
			return true;
		};
		return false;
	}

}
