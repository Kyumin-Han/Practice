package ch6ex;

public class Circle extends Figure {
	private final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	void area() {
		System.out.println("���� ����: " + PI*radius*radius);
		
	}

	@Override
	void around() {
		System.out.println("���� �Ѹ�: " + 2*PI*radius);
		
	}
	

}
