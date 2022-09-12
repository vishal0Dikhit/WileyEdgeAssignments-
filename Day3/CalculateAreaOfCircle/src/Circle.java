
public class Circle {
	private double radius;
	private double area;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double calculateArea() {
		area = 3.14 * radius * radius;
		return area;
	}
	
	
	
}
