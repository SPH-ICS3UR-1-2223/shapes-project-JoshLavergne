package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	
	//Methods
	public Circle() {
	this.radius = 1;
	}
	
	public Circle(double r) {
		this.radius = r;
		this.circumference = r;
		
		this.circumference = findCircumference();
		this.area = findArea();
	}
	
	private double findCircumference() {
		return 2*Math.PI*radius;
		
	}
	
	private double findArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
	public void printStats() {
		System.out.println("Circle");
		System.out.println("Radius = "+this.radius);
		System.out.println("Circumference = "+this.circumference);
		System.out.println("Area = "+this.area);
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}
