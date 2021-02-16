package ch6ex;

public class Circle extends Figure {
	private final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	void area() {
		System.out.println("원의 면적: " + PI*radius*radius);
		
	}

	@Override
	void around() {
		System.out.println("원의 둘리: " + 2*PI*radius);
		
	}
	

}
