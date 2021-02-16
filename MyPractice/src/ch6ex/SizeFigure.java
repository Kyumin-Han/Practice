package ch6ex;

public class SizeFigure {

	public static void main(String[] args) {
		Figure f1 = new Square(2.5);
		Figure f2 = new Square(2.3, 3.7);
		Figure f3 = new Circle(3.6);
		
		f1.mesure();
		f2.mesure();
		f3.mesure();

	}

}
