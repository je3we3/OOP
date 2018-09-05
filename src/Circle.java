
public class Circle {
	//Attributes and constructor
		Point center;
		double radius;
		
		public Circle(Point centerPoint, double size) {
			center = centerPoint;
			if (size > 0) {
				radius = size;
			}
			radius = 0;
		}
		
		//Methods
		public String toString() {
			return "<Circle(" + getCenter() + ", " + getRadius() + ")>";
		}
		
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (other instanceof Circle)
			{
				Circle that = (Circle) other;
				return (this.center == that.center) && (this.radius == that.radius);
			}
			return false;
		}
		
		public Point getCenter() {
			return center;
		}
		
		public double getRadius() {
			return radius;
		}
		
		
		
}
