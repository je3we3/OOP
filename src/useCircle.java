
public class useCircle {

	public static void main(String[] args) {
		Point middle1 = new Point(3.0, 5.0);
		Circle test1 = new Circle(middle1, 5.0);
		Point middle2 = new Point(3.0, 5.0);
		Circle test2 = new Circle(middle2, 5.0);
		System.out.println(test1.getCenter());
		System.out.println(test2.getCenter());
		System.out.println(test1.getCenter() == test2.getCenter());
		System.out.println(test1.equals(test2));
	}

}
