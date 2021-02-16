package ch6ex;

public class Square extends Figure {
	
	private double side;
	private double height;
	
	public Square(double side) {
		this.side = this.height = side;
	}
	
	public Square(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	@Override
	void area() {
		System.out.println("�簢���� ����: " + (side * height));
		
	}

	@Override
	void around() {
		System.out.println("�簢���� �ѷ�: " + 2*(side + height));
		
	}
	

}
