package ch6ex;

public abstract class Figure {

	abstract void area();
	abstract void around();
	
	void mesure() {
		area();
		around();
		System.out.println();
	}
}
